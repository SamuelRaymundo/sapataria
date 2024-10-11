package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.exceptions.ResourceNotFoundException;
import org.samuelraymundo.sapataria.mapper.DozerMapper;
import org.samuelraymundo.sapataria.model.dto.ProductDto;
import org.samuelraymundo.sapataria.model.entities.Product;
import org.samuelraymundo.sapataria.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductDto findById(Long id) {
        var entity = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        return DozerMapper.parseObject(entity, ProductDto.class);
    }

    public List<ProductDto> findAll() {
        return DozerMapper.parseListObject(productRepository.findAll(), ProductDto.class);
    }

    public ProductDto create(ProductDto productDto) {
        var entity = DozerMapper.parseObject(productDto, Product.class);
        var dto  = productRepository.save(entity);
        return DozerMapper.parseObject(dto, ProductDto.class);
    }

    public ProductDto update(ProductDto productDto) {
        var updateProduct= productRepository.findById(productDto.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        updateProduct.setDescription(productDto.getDescription());
        updateProduct.setDescription(productDto.getDescription());
        updateProduct.setModel(productDto.getModel());

        var dto = DozerMapper.parseObject(productRepository.save(updateProduct), ProductDto.class);

        return dto;
    }

    public void delete(Long id) {
        var entity = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        productRepository.delete(entity);
    }
}