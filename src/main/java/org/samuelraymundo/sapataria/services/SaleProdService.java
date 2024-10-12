package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.exceptions.ResourceNotFoundException;
import org.samuelraymundo.sapataria.mapper.DozerMapper;
import org.samuelraymundo.sapataria.model.dto.SaleProdDto;
import org.samuelraymundo.sapataria.model.dto.SaleProdDto;
import org.samuelraymundo.sapataria.model.entities.SaleProd;
import org.samuelraymundo.sapataria.repositories.SaleProdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleProdService {


    @Autowired
    private SaleProdRepository saleProdRepository;

    public SaleProdDto findById(Long id) {
        var entity = saleProdRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no saleProd with the id " + id));
        return DozerMapper.parseObject(entity, SaleProdDto.class);
    }

    public List<SaleProdDto> findAll() {
        return DozerMapper.parseListObject(saleProdRepository.findAll(), SaleProdDto.class);
    }


    public SaleProdDto create(SaleProdDto saleProd) {
        var entity = DozerMapper.parseObject(saleProd, SaleProd.class);
        var dto = saleProdRepository.save(entity);
        return DozerMapper.parseObject(dto, SaleProdDto.class);
    }

    public SaleProdDto update(SaleProdDto saleProd) {
        var updateSaleProd = saleProdRepository.findById(saleProd.getId())
                .orElseThrow(() -> new ResourceNotFoundException("There is no saleProd with the id " + saleProd.getId()));

        updateSaleProd.setQuantity(saleProd.getQuantity());
        updateSaleProd.setPrice(saleProd.getPrice());
        var dto = DozerMapper.parseObject(saleProdRepository.save(updateSaleProd), SaleProdDto.class);
        return dto;
    }

    public void delete(Long id) {
        var saleProd = saleProdRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no saleProd with the id " + id));
        saleProdRepository.delete(saleProd);
    }
}
