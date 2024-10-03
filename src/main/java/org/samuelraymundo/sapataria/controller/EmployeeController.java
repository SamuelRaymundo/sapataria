package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.dto.EmployeeDto;
import org.samuelraymundo.sapataria.services.EmployeeService;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public EmployeeDto findById(@PathVariable Long id){
        return employeeService.findById(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public List<EmployeeDto> findAll() {
        return employeeService.findAll();
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public EmployeeDto create(@RequestBody EmployeeDto employeeDto){
        return employeeService.create(employeeDto);
    }


    @PutMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public EmployeeDto update(@RequestBody EmployeeDto employeeDto){
        return employeeService.update(employeeDto);
    }

    @DeleteMapping(value = "/{id}", consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public void delete(@PathVariable Long id){
        employeeService.delete(id);
    }


}
