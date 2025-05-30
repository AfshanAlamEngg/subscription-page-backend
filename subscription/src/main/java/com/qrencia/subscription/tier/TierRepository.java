package com.qrencia.subscription.tier;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TierRepository extends JpaRepository<Tier, Integer> {
    // This interface extends JpaRepository to provide CRUD operations for Tier entities.
    // The first parameter is the entity type (Tier), and the second is the type of the entity's primary key (Integer).
    
    // Additional custom query methods can be defined here if needed.
    // For example:
    // List<Tier> findByName(String name);
}
