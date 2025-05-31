package com.qrencia.subscription.category;

import java.util.List;
import com.qrencia.subscription.feature.Feature;
import com.qrencia.subscription.tier.Tier;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "categories", fetch = FetchType.LAZY)
    private List<Tier> tiers;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "Category_Features",  // 🚀 Renamed table
        joinColumns = @JoinColumn(name = "category_id"),
        inverseJoinColumns = @JoinColumn(name = "feature_id")  // 🚀 Updated reference
    )
    private List<Feature> features;  // 🚀 Renamed field
}
