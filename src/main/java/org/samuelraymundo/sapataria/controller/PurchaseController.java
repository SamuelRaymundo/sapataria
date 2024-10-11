package org.samuelraymundo.sapataria.controller;


import org.samuelraymundo.sapataria.model.dto.
PurchaseDto;
import org.samuelraymundo.sapataria.services.
PurchaseService;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/purchase/v1")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping(value = "/{id}",produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public PurchaseDto findById(@PathVariable Long id) {
        return purchaseService.findById(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public List<PurchaseDto> findAll() {
        return purchaseService.findAll();
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public PurchaseDto create (@RequestBody PurchaseDto purchaseDto) {
        return purchaseService.create(purchaseDto);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public PurchaseDto update (@RequestBody PurchaseDto purchaseDto) {
        return purchaseService.update(purchaseDto);
    }

    @DeleteMapping(value = "/{id}", consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public void delete (@PathVariable Long id) {
        purchaseService.delete(id);
    }
}
