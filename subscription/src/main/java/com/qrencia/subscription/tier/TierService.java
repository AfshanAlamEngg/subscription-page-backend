package com.qrencia.subscription.tier;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.qrencia.subscription.category.Category;


@Service
@RequiredArgsConstructor
public class TierService {
    private final TierRepository tierRepository;

    public List<Tier> getAllTiers() {
        return tierRepository.findAllSorted();
    }

    public Tier getTierById(Integer tierId) {
        return tierRepository.findById(tierId)
            .orElseThrow(() -> new IllegalArgumentException("Tier not found with ID: " + tierId));
    }

    public Tier createTier(Tier tier) {
        return tierRepository.save(tier);
    }

    public Tier updateTier(Integer tierId, Tier updatedTier) {
        Tier existingTier = getTierById(tierId);
        existingTier.setName(updatedTier.getName());
        return tierRepository.save(existingTier);
    }

    public void deleteTier(Integer tierId) {
        tierRepository.deleteById(tierId);
    }

    public List<Category> getCategoriesByTier(Integer tierId) {
        return getTierById(tierId).getCategories();
    }
}
