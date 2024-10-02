package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.dto.CategoryDto;
import org.samuelraymundo.sapataria.services.CategoryService;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category/v1")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/{id}",produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public CategoryDto findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public List<CategoryDto> findAll() {
        return categoryService.findAll();
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public CategoryDto create (@RequestBody CategoryDto categoryDto) {
        return categoryService.create(categoryDto);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"}, produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public CategoryDto update (@RequestBody CategoryDto categoryDto) {
        return categoryService.update(categoryDto);
    }

    @DeleteMapping(value = "/{id}", consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public void delete (@PathVariable Long id) {
        categoryService.delete(id);
    }
}
