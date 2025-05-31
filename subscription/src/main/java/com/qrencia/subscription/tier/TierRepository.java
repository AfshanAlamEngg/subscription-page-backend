package com.qrencia.subscription.tier;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface TierRepository extends JpaRepository<Tier, Integer> {
    @Query("SELECT t FROM Tier t ORDER BY t.name ASC")
    List<Tier> findAllSorted();
}
