package com.qrencia.subscription.feature;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/features")  // 🚀 Updated endpoint
@RequiredArgsConstructor
public class FeatureController {  // 🚀 Renamed from ServiceController to FeatureController
    private final FeatureService featureService;

    @GetMapping
    public ResponseEntity<List<Feature>> getAllFeatures() {  // 🚀 Updated method name and type
        return ResponseEntity.ok(featureService.getAllFeatures());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Feature> getFeatureById(@PathVariable Integer id) {  // 🚀 Updated method name and type
        return ResponseEntity.ok(featureService.getFeatureById(id));
    }

    @PostMapping
    public ResponseEntity<Feature> createFeature(@RequestBody Feature feature) {  // 🚀 Updated method name and type
        return ResponseEntity.ok(featureService.createFeature(feature));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Feature> updateFeature(@PathVariable Integer id, @RequestBody Feature updatedFeature) {  // 🚀 Updated method name and type
        return ResponseEntity.ok(featureService.updateFeature(id, updatedFeature));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFeature(@PathVariable Integer id) {  // 🚀 Updated method name
        featureService.deleteFeature(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Feature>> searchByName(@RequestParam String name) {  // 🚀 Updated method name and type
        try {
            return ResponseEntity.ok(featureService.searchByName(name));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/by-category/{categoryId}")
    public ResponseEntity<List<Feature>> getFeaturesByCategory(@PathVariable Integer categoryId) {  // 🚀 Updated method name and type
        return ResponseEntity.ok(featureService.getFeaturesByCategory(categoryId));
    }
}
