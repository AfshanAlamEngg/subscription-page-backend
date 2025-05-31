package com.qrencia.subscription.category;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAllSorted();
    }

    public Category getCategoryById(Integer categoryId) {
        return categoryRepository.findById(categoryId)
            .orElseThrow(() -> new IllegalArgumentException("Category not found with ID: " + categoryId));
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Integer categoryId, Category updatedCategory) {
        Category existingCategory = getCategoryById(categoryId);
        existingCategory.setName(updatedCategory.getName());
        return categoryRepository.save(existingCategory);
    }

    public void deleteCategory(Integer categoryId) {
        categoryRepository.deleteById(categoryId);
    }

    public List<Category> searchByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be empty.");
        }
        return categoryRepository.findByName(name);
    }

    public List<Category> getCategoriesByTier(Integer tierId) {
        return categoryRepository.findByTier(tierId);
    }

    public List<Category> getCategoriesByFeature(Integer featureId) {  // 🚀 Updated method name
        return categoryRepository.findByFeature(featureId);  // 🚀 Updated repository reference
    }
}
