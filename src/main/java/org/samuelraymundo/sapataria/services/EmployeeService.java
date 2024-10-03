package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.exceptions.ResourceNotFoundException;
import org.samuelraymundo.sapataria.mapper.DozerMapper;
import org.samuelraymundo.sapataria.model.dto.EmployeeDto;
import org.samuelraymundo.sapataria.model.entities.Employee;
import org.samuelraymundo.sapataria.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDto findById(Long id) {
        var entity = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no employee with id " + id));
        return DozerMapper.parseObject(entity, EmployeeDto.class);
    }

    public List<EmployeeDto> findAll() {
        return DozerMapper.parseListObject(employeeRepository.findAll(), EmployeeDto.class);
    }

    public EmployeeDto create(EmployeeDto employeeDto) {
        var entity = DozerMapper.parseObject(employeeDto, Employee.class);
        var dto = employeeRepository.save(entity);
        return DozerMapper.parseObject(dto, EmployeeDto.class);
    }

    public EmployeeDto update(EmployeeDto employeeDto) {
        var updateEmployee = employeeRepository.findById(employeeDto.getId())
                .orElseThrow(() ->  new ResourceNotFoundException("There is no employee with id " + employeeDto.getId()));
        updateEmployee.setPhoneNumber(employeeDto.getPhoneNumber());
        updateEmployee.setName(employeeDto.getName());
        var dto = DozerMapper.parseObject(employeeRepository.save(updateEmployee), EmployeeDto.class);
        return dto;
    }

    public void delete(Long id) {
        var entity = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no employee with id " + id));
        employeeRepository.delete(entity);
    }

}


