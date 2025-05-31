package com.qrencia.subscription.feature;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Integer> {  // 🚀 Renamed repository interface

    @Query("SELECT f FROM Feature f ORDER BY f.name ASC")  // 🚀 Updated entity reference
    List<Feature> findAllSorted();

    @Query("SELECT f FROM Feature f WHERE LOWER(f.name) LIKE LOWER(CONCAT('%', :name, '%'))")  // 🚀 Updated entity reference
    List<Feature> findByName(@Param("name") String name);

    @Query("SELECT f FROM Feature f JOIN f.categories c WHERE c.categoryId = :categoryId")  // 🚀 Updated entity reference
    List<Feature> findByCategory(@Param("categoryId") Integer categoryId);
}
