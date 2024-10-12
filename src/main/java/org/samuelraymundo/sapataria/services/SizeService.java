package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.exceptions.ResourceNotFoundException;
import org.samuelraymundo.sapataria.mapper.DozerMapper;
import org.samuelraymundo.sapataria.model.dto.SizeDto;
import org.samuelraymundo.sapataria.model.entities.Size;
import org.samuelraymundo.sapataria.repositories.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService {


    @Autowired
    private SizeRepository sizeRepository;

    public SizeDto findById(Long id) {
        var entity = sizeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no size with the id " + id));
        return DozerMapper.parseObject(entity, SizeDto.class);
    }

    public List<SizeDto> findAll() {
        return DozerMapper.parseListObject(sizeRepository.findAll(), SizeDto.class);
    }


    public SizeDto create(SizeDto size) {
        var entity = DozerMapper.parseObject(size, Size.class);
        var dto = sizeRepository.save(entity);
        return DozerMapper.parseObject(dto, SizeDto.class);
    }

    public SizeDto update(SizeDto size) {
        var updateSize = sizeRepository.findById(size.getId())
                .orElseThrow(() -> new ResourceNotFoundException("There is no size with the id " + size.getId()));
        updateSize.setSize(size.getSize());
        updateSize.setStockQuantity(size.getStockQuantity());
        updateSize.setMinimumQuantity(size.getMinimumQuantity());
        updateSize.setMaximumQuantity(size.getMaximumQuantity());
        var dto = DozerMapper.parseObject(sizeRepository.save(updateSize), SizeDto.class);
        return dto;
    }

    public void delete(Long id) {
        var size = sizeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no size with the id " + id));
        sizeRepository.delete(size);
    }
}
