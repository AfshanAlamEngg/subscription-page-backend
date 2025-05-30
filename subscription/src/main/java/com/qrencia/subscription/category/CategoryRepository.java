package com.qrencia.subscription.category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    // This interface extends JpaRepository to provide CRUD operations for Category entities.
    // The first parameter is the entity type (Category), and the second is the type of the entity's primary key (Integer).
    
    // Additional custom query methods can be defined here if needed.
    // For example:
    // List<Category> findByName(String name);
}