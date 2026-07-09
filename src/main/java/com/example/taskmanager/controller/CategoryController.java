package com.example.taskmanager.controller;

import com.example.taskmanager.entity.Category;
import com.example.taskmanager.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Category> create(
            @RequestBody Category category) {
        Category create =  categoryService.create(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(create);
    }
}
