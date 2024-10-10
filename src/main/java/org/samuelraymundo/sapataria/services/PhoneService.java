package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.exceptions.ResourceNotFoundException;
import org.samuelraymundo.sapataria.mapper.DozerMapper;
import org.samuelraymundo.sapataria.model.dto.PhoneDto;
import org.samuelraymundo.sapataria.model.entities.Phone;
import org.samuelraymundo.sapataria.repositories.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;

    public PhoneDto findById(Long id) {
        var entity = phoneRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no phone with this id"));
        return DozerMapper.parseObject(entity, PhoneDto.class);
    }

    public List<PhoneDto> findAll() {
        return DozerMapper.parseListObject(phoneRepository.findAll(), PhoneDto.class);
    }

    public PhoneDto create(PhoneDto phoneDto) {
        var entity = DozerMapper.parseObject(phoneDto, Phone.class);
        var dto = phoneRepository.save(entity);
        return DozerMapper.parseObject(dto, PhoneDto.class);
    }

    public PhoneDto update(PhoneDto phoneDto) {
        var updateEntity = phoneRepository.findById(phoneDto.getId())
                .orElseThrow(() -> new ResourceNotFoundException("There is no phone with this id"));
        updateEntity.setNumber(phoneDto.getNumber());
        updateEntity.setContact(phoneDto.getContact());
        updateEntity.setEmail(phoneDto.getEmail());

        var dto = DozerMapper.parseObject(phoneRepository.save(updateEntity), PhoneDto.class);
        return dto;
    }

    public void delete(Long id) {
        var entity = phoneRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no phone with this id"));
        phoneRepository.delete(entity);
    }


}
