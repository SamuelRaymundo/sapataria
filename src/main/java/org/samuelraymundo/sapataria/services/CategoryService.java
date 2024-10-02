package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.mapper.DozerMapper;
import org.samuelraymundo.sapataria.model.dto.CategoryDto;
import org.samuelraymundo.sapataria.model.entities.Category;
import org.samuelraymundo.sapataria.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryDto findById(Long id) {
        var entity = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));
        return DozerMapper.parseObject(entity, CategoryDto.class);
    }

    public List<CategoryDto> findAll() {
        return DozerMapper.parseListObject(categoryRepository.findAll(), CategoryDto.class);
    }

    public CategoryDto create(CategoryDto categoryDto) {
        var entity = DozerMapper.parseObject(categoryDto, Category.class);
        var dto = categoryRepository.save(entity);
        return DozerMapper.parseObject(dto, CategoryDto.class);
    }

    public CategoryDto update(CategoryDto categoryDto) {
        var updateCategory = categoryRepository.findById(categoryDto.getId())
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + categoryDto.getId()));

        updateCategory.setCategory(categoryDto.getCategory());
        var dto = DozerMapper.parseObject(updateCategory, CategoryDto.class);
        return dto;
    }

    public void delete(Long id) {
        var entity = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));
        categoryRepository.delete(entity);
    }
}
