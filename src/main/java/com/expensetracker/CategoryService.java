package com.expensetracker;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category category) {

        Optional<Category> existingCategory =
                categoryRepository.findById(id);

        if (existingCategory.isPresent()) {

            category.setId(id);

            return categoryRepository.save(category);
        }

        return new Category();
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}