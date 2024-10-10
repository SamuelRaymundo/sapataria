package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.exceptions.ResourceNotFoundException;
import org.samuelraymundo.sapataria.mapper.DozerMapper;
import org.samuelraymundo.sapataria.model.dto.InstallmentDto;
import org.samuelraymundo.sapataria.model.entities.Installment;
import org.samuelraymundo.sapataria.repositories.InstallmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstallmentService {
    
    @Autowired
    private InstallmentRepository installmentRepository;
    
    public InstallmentDto findById(Long id) {
        var entity = installmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no istallment with th id " + id));
        return DozerMapper.parseObject(entity, InstallmentDto.class);
    }
    
    public List<InstallmentDto> findAll() {
        List<Installment> teste = installmentRepository.findAll();
        return DozerMapper.parseListObject(teste, InstallmentDto.class);
    }
    
    public InstallmentDto create(InstallmentDto installmentDto) {
        var entity = DozerMapper.parseObject(installmentDto, Installment.class);
        var dto = installmentRepository.save(entity);
        return DozerMapper.parseObject(dto, InstallmentDto.class);
    }
    
    public InstallmentDto update(InstallmentDto installmentDto) {
        var updatedInstallment = installmentRepository.findById(installmentDto.getId())
                .orElseThrow(() -> new ResourceNotFoundException("There is no istallment with id " + installmentDto.getId()));
        updatedInstallment.setInstallmentQuantity(installmentDto.getInstallmentQuantity());
        updatedInstallment.setInstallmentPrice(installmentDto.getInstallmentPrice());
        updatedInstallment.setInstallmentDueDate(installmentDto.getInstallmentDueDate());
        updatedInstallment.setInstallmentPaymentDate(installmentDto.getInstallmentPaymentDate());
        updatedInstallment.setInstallmentAmount(installmentDto.getInstallmentAmount());

        var dto = DozerMapper.parseObject(installmentRepository.save(updatedInstallment), InstallmentDto.class);
        return dto;
    }

    public void delete(Long id) {
        var entity = installmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no istallment with id " + id));
        installmentRepository.delete(entity);
    }

}
