package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.dto.PhoneDto;
import org.samuelraymundo.sapataria.services.PhoneService;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phone/v1")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @GetMapping(value = "/{id}" ,produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public PhoneDto findById(@PathVariable Long id) {
        return phoneService.findById(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public List<PhoneDto> findAll() {
        return phoneService.findAll();
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public PhoneDto create(@RequestBody PhoneDto phoneDto) {
        return phoneService.create(phoneDto);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public PhoneDto update(@RequestBody PhoneDto phoneDto) {
        return phoneService.update(phoneDto);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        phoneService.delete(id);
    }
}
