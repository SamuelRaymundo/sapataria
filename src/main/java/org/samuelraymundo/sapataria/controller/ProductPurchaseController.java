package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.dto.ProductDto;
import org.samuelraymundo.sapataria.model.dto.ProductPurchaseDto;
import org.samuelraymundo.sapataria.services.ProductPurchaseService;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product-purchase/v1")
public class ProductPurchaseController {

    @Autowired
    private ProductPurchaseService productPurchaseService;

    @GetMapping(value ="/{id}",  produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public ProductPurchaseDto findById(@PathVariable Long id) {
        return productPurchaseService.findById(id);
    }
    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public List<ProductPurchaseDto> findAll() {
        return productPurchaseService.findAll();
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public ProductPurchaseDto create(@RequestBody ProductPurchaseDto productPurchaseDto) {
        return productPurchaseService.create(productPurchaseDto);
    }

    @PutMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public ProductPurchaseDto update(@RequestBody ProductPurchaseDto productPurchaseDto) {
        return productPurchaseService.update(productPurchaseDto);
    }

    @DeleteMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public void delete(@PathVariable Long id) {
        productPurchaseService.delete(id);
    }


}
