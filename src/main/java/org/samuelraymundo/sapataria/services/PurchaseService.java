package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.exceptions.ResourceNotFoundException;
import org.samuelraymundo.sapataria.mapper.DozerMapper;
import org.samuelraymundo.sapataria.model.dto.PurchaseDto;
import org.samuelraymundo.sapataria.model.entities.Purchase;
import org.samuelraymundo.sapataria.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;


    public PurchaseDto findById(Long id) {
        var entity = purchaseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no phone with this id"));
        return DozerMapper.parseObject(entity, PurchaseDto.class);
    }

    public List<PurchaseDto> findAll() {
        return DozerMapper.parseListObject(purchaseRepository.findAll(), PurchaseDto.class);
    }

    public PurchaseDto create(PurchaseDto productPurchaseDto) {
        var entity = DozerMapper.parseObject(productPurchaseDto, Purchase.class);
        var dto = purchaseRepository.save(entity);
        return DozerMapper.parseObject(dto, PurchaseDto.class);
    }

    public PurchaseDto update(PurchaseDto productPurchaseDto) {
        var updateEntity = purchaseRepository.findById(productPurchaseDto.getId())
                .orElseThrow(() -> new ResourceNotFoundException("There is no phone with this id"));
        updateEntity.setTotal(productPurchaseDto.getTotal());
        updateEntity.setDate(productPurchaseDto.getDate());

        var dto = DozerMapper.parseObject(purchaseRepository.save(updateEntity), PurchaseDto.class);
        return dto;
    }

    public void delete(Long id) {
        var entity = purchaseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no phone with this id"));
        purchaseRepository.delete(entity);
    }
}
