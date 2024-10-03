package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.dto.SupplierDto;
import org.samuelraymundo.sapataria.services.SupplierService;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier/v1")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SupplierDto findById(@PathVariable Long id) {
        return supplierService.findById(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public List<SupplierDto> findAll() {
        return supplierService.findAll();
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SupplierDto create(@RequestBody SupplierDto supplierDto) {
        return supplierService.create(supplierDto);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SupplierDto update(@RequestBody SupplierDto supplierDto) {
        return supplierService.update(supplierDto);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        supplierService.delete(id);
    }
}
