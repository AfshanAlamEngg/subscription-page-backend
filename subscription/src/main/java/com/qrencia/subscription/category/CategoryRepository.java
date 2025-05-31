package com.qrencia.subscription.category;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("SELECT c FROM Category c ORDER BY c.name ASC")
    List<Category> findAllSorted();

    @Query("SELECT c FROM Category c WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Category> findByName(@Param("name") String name);

    @Query("SELECT c FROM Category c JOIN c.tiers t WHERE t.tierId = :tierId")
    List<Category> findByTier(@Param("tierId") Integer tierId);

    @Query("SELECT c FROM Category c JOIN c.features f WHERE f.featureId = :featureId")  // 🚀 Updated reference
    List<Category> findByFeature(@Param("featureId") Integer featureId);  // 🚀 Updated method name
}
