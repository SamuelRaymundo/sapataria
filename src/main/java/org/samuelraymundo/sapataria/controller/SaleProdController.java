package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.dto.SaleProdDto;
import org.samuelraymundo.sapataria.services.SaleProdService;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sale-prod/v1")
public class SaleProdController {

    @Autowired
    private SaleProdService saleProdService;

    @GetMapping(value = "/{id}" ,produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SaleProdDto findById(@PathVariable Long id) {
        return saleProdService.findById(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public List<SaleProdDto> findAll() {
        return saleProdService.findAll();
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SaleProdDto create(@RequestBody SaleProdDto saleProdDto) {
        return saleProdService.create(saleProdDto);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SaleProdDto update(@RequestBody SaleProdDto saleProdDto) {
        return saleProdService.update(saleProdDto);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        saleProdService.delete(id);
    }
}
