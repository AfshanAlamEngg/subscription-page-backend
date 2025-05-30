package com.qrencia.subscription.service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
    // This interface extends JpaRepository to provide CRUD operations for Service entities.
    // The first parameter is the entity type (Service), and the second is the type of the entity's primary key (Integer).
    
    // Additional custom query methods can be defined here if needed.
    // For example:
    // List<Service> findByName(String name);
}