package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.dto.SaleDto;
import org.samuelraymundo.sapataria.services.SaleService;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sale/v1")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping(value ="/{id}",  produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SaleDto findById(@PathVariable Long id) {
        return saleService.findById(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public List<SaleDto> findAll() {
        return saleService.findAll();
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SaleDto create(@RequestBody SaleDto saleDto) {
        return saleService.create(saleDto);
    }

    @PutMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SaleDto update(@RequestBody SaleDto saleDto) {
        return saleService.update(saleDto);
    }

    @DeleteMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public void delete(@PathVariable Long id) {
        saleService.delete(id);
    }
}
