package com.dbms.datakart.service;

import com.dbms.datakart.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryById(Long categoryId);
    CategoryDTO createCategory(CategoryDTO category);
    void deleteCategory(Long categoryId);
    CategoryDTO updateCategory(CategoryDTO category);
}
