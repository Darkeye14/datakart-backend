package com.dbms.datakart.serviceImpl;

import com.dbms.datakart.entity.Category;
import com.dbms.datakart.repo.CategoryRepo;
import com.dbms.datakart.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl  {

    @Autowired
    private CategoryRepo categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }
}
