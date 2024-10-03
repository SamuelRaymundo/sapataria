package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.exceptions.ResourceNotFoundException;
import org.samuelraymundo.sapataria.mapper.DozerMapper;
import org.samuelraymundo.sapataria.model.dto.SaleDto;
import org.samuelraymundo.sapataria.model.entities.Sale;
import org.samuelraymundo.sapataria.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public SaleDto findById(Long id) {
        var entity = saleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sale not found for this id: " + id));
        return DozerMapper.parseObject(entity, SaleDto.class);
    }

    public List<SaleDto> findAll() {
        return DozerMapper.parseListObject(saleRepository.findAll(), SaleDto.class);
    }

    public SaleDto create(SaleDto saleDto) {
        var entity = DozerMapper.parseObject(saleDto, Sale.class);
        var dto = saleRepository.save(entity);
        return DozerMapper.parseObject(dto, SaleDto.class);
    }

    public SaleDto update(SaleDto saleDto) {
        var updatedEntity = saleRepository.findById(saleDto.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Sale not found for this id: " + saleDto.getId()));

        updatedEntity.setLocal(saleDto.getLocal());
        updatedEntity.setDate(saleDto.getDate());
        updatedEntity.setTotal(saleDto.getTotal());
        updatedEntity.setTaxCupon(saleDto.getTaxCupon());

        var dto = DozerMapper.parseObject(saleRepository.save(updatedEntity), SaleDto.class);
        return DozerMapper.parseObject(dto, SaleDto.class);
    }

    public void delete(Long id) {
        var entity = saleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sale not found for this id: " + id));
        saleRepository.delete(entity);
    }
}
