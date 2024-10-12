package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.dto.SizeDto;
import org.samuelraymundo.sapataria.services.SizeService;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/size/v1")
public class SizeController {


    @Autowired
    private SizeService sizeService;

    @GetMapping(value = "/{id}" ,produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SizeDto findById(@PathVariable Long id) {
        return sizeService.findById(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public List<SizeDto> findAll() {
        return sizeService.findAll();
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SizeDto create(@RequestBody SizeDto sizeDto) {
        return sizeService.create(sizeDto);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public SizeDto update(@RequestBody SizeDto sizeDto) {
        return sizeService.update(sizeDto);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        sizeService.delete(id);
    }
}
