package com.qrencia.subscription.tier;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;
import com.qrencia.subscription.category.Category;

@RestController
@RequestMapping("/api/tiers")
@RequiredArgsConstructor
public class TierController {
    private final TierService tierService;

    @GetMapping
    public ResponseEntity<List<Tier>> getAllTiers() {
        return ResponseEntity.ok(tierService.getAllTiers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tier> getTierById(@PathVariable Integer id) {
        return ResponseEntity.ok(tierService.getTierById(id));
    }

    @PostMapping
    public ResponseEntity<Tier> createTier(@RequestBody Tier tier) {
        return ResponseEntity.ok(tierService.createTier(tier));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tier> updateTier(@PathVariable Integer id, @RequestBody Tier updatedTier) {
        return ResponseEntity.ok(tierService.updateTier(id, updatedTier));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTier(@PathVariable Integer id) {
        tierService.deleteTier(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/categories")
    public ResponseEntity<List<Category>> getCategoriesByTier(@PathVariable Integer id) {
        return ResponseEntity.ok(tierService.getCategoriesByTier(id));
    }
}
