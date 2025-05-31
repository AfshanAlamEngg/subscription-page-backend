package com.qrencia.subscription.category;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Integer id) {
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.createCategory(category));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable Integer id, @RequestBody Category updatedCategory) {
        return ResponseEntity.ok(categoryService.updateCategory(id, updatedCategory));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Integer id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Category>> searchByName(@RequestParam String name) {
        try {
            return ResponseEntity.ok(categoryService.searchByName(name));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/by-tier/{tierId}")
    public ResponseEntity<List<Category>> getCategoriesByTier(@PathVariable Integer tierId) {
        return ResponseEntity.ok(categoryService.getCategoriesByTier(tierId));
    }

    @GetMapping("/by-feature/{featureId}")  // 🚀 Updated endpoint
    public ResponseEntity<List<Category>> getCategoriesByFeature(@PathVariable Integer featureId) {  // 🚀 Updated method name
        return ResponseEntity.ok(categoryService.getCategoriesByFeature(featureId));  // 🚀 Updated method call
    }
}
