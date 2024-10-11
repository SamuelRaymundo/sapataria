package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.exceptions.ResourceNotFoundException;
import org.samuelraymundo.sapataria.mapper.DozerMapper;
import org.samuelraymundo.sapataria.model.dto.ProductPurchaseDto;
import org.samuelraymundo.sapataria.model.entities.Phone;
import org.samuelraymundo.sapataria.model.entities.ProductPurchase;
import org.samuelraymundo.sapataria.repositories.ProductPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductPurchaseService {
    
    @Autowired
    private ProductPurchaseRepository productPurchaseRepository;


    public ProductPurchaseDto findById(Long id) {
        var entity = productPurchaseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no phone with this id"));
        return DozerMapper.parseObject(entity, ProductPurchaseDto.class);
    }

    public List<ProductPurchaseDto> findAll() {
        return DozerMapper.parseListObject(productPurchaseRepository.findAll(), ProductPurchaseDto.class);
    }

    public ProductPurchaseDto create(ProductPurchaseDto productPurchaseDto) {
        var entity = DozerMapper.parseObject(productPurchaseDto, ProductPurchase.class);
        var dto = productPurchaseRepository.save(entity);
        return DozerMapper.parseObject(dto, ProductPurchaseDto.class);
    }

    public ProductPurchaseDto update(ProductPurchaseDto productPurchaseDto) {
        var updateEntity = productPurchaseRepository.findById(productPurchaseDto.getId())
                .orElseThrow(() -> new ResourceNotFoundException("There is no phone with this id"));
        updateEntity.setQuantity(productPurchaseDto.getQuantity());
        updateEntity.setPrice(productPurchaseDto.getPrice());

        var dto = DozerMapper.parseObject(productPurchaseRepository.save(updateEntity), ProductPurchaseDto.class);
        return dto;
    }

    public void delete(Long id) {
        var entity = productPurchaseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no phone with this id"));
        productPurchaseRepository.delete(entity);
    }

}
