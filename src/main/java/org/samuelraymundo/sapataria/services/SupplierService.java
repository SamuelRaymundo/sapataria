package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.exceptions.ResourceNotFoundException;
import org.samuelraymundo.sapataria.mapper.DozerMapper;
import org.samuelraymundo.sapataria.model.dto.SupplierDto;
import org.samuelraymundo.sapataria.model.entities.Supplier;
import org.samuelraymundo.sapataria.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public SupplierDto findById(Long id) {
        var entity = supplierRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("The supplier with id " + id + " was not found in the database"));
        return DozerMapper.parseObject(entity, SupplierDto.class);
    }

    public List<SupplierDto> findAll() {
        var entity = supplierRepository.findAll();
        return DozerMapper.parseListObject(entity, SupplierDto.class);
    }

    public SupplierDto create(SupplierDto supplier) {
        var entity = DozerMapper.parseObject(supplier, Supplier.class);
        var dto = supplierRepository.save(entity);
        return DozerMapper.parseObject(dto, SupplierDto.class);
    }

     public SupplierDto update(SupplierDto supplier) {
        var updateSupplier = supplierRepository.findById(supplier.getId())
                .orElseThrow(() -> new ResourceNotFoundException("The supplier with id " + supplier.getId() + " was not found in the database"));
        updateSupplier.setCnpj(supplier.getCnpj());
        updateSupplier.setIe(supplier.getIe());
        updateSupplier.setFantasyName(supplier.getFantasyName());
        updateSupplier.setSocialReason(supplier.getSocialReason());
        updateSupplier.setAddress(supplier.getAddress());
        updateSupplier.setAddressNumber(supplier.getAddressNumber());
        updateSupplier.setComplement(supplier.getComplement());
        updateSupplier.setNeighborhood(supplier.getNeighborhood());
        updateSupplier.setCity(supplier.getCity());
        updateSupplier.setUf(supplier.getUf());
        updateSupplier.setCep(supplier.getCep());

        var dto = DozerMapper.parseObject(supplierRepository.save(updateSupplier), SupplierDto.class);
        return dto;
    }

    public void delete(Long id) {
        var entity = supplierRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("The supplier with id " + id + " was not found in the database"));
        supplierRepository.delete(entity);
    }

}
