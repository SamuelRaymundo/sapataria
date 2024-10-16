package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.dto.InstallmentDto;
import org.samuelraymundo.sapataria.services.InstallmentService;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/installment/v1")
public class InstallmentController {

    @Autowired
    private InstallmentService installmentService;

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-yml"})
    public InstallmentDto findById(@PathVariable Long id) {
        return installmentService.findById(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "application/x-yml"})
    public List<InstallmentDto> findAll() {
        return installmentService.findAll();
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public InstallmentDto create(@RequestBody InstallmentDto installmentDto) {
        return installmentService.create(installmentDto);
    }

    @PutMapping(consumes =  {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-yml"}, produces =  {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,"application/x-yml"})
    public InstallmentDto update(@RequestBody InstallmentDto installmentDto) {
        return installmentService.update(installmentDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        installmentService.delete(id);
    }
}
