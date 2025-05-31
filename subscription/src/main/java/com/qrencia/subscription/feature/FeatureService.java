package com.qrencia.subscription.feature;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FeatureService {  // 🚀 Renamed from ServiceService to FeatureService
    private final FeatureRepository featureRepository;

    public List<Feature> getAllFeatures() {  // 🚀 Updated method name and type
        return featureRepository.findAllSorted();
    }

    public Feature getFeatureById(Integer featureId) {  // 🚀 Updated method name and type
        return featureRepository.findById(featureId)
            .orElseThrow(() -> new IllegalArgumentException("Feature not found with ID: " + featureId));
    }

    public Feature createFeature(Feature feature) {  // 🚀 Updated method name and type
        return featureRepository.save(feature);
    }

    public Feature updateFeature(Integer featureId, Feature updatedFeature) {  // 🚀 Updated method name and type
        Feature existingFeature = getFeatureById(featureId);
        existingFeature.setName(updatedFeature.getName());
        existingFeature.setDescription(updatedFeature.getDescription());
        return featureRepository.save(existingFeature);
    }

    public void deleteFeature(Integer featureId) {  // 🚀 Updated method name
        featureRepository.deleteById(featureId);
    }

    public List<Feature> searchByName(String name) {  // 🚀 Updated method name and type
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Feature name cannot be empty.");
        }
        return featureRepository.findByName(name);
    }

    public List<Feature> getFeaturesByCategory(Integer categoryId) {  // 🚀 Updated method name and type
        return featureRepository.findByCategory(categoryId);
    }
}
