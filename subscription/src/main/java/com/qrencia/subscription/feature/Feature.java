package com.qrencia.subscription.feature;

import java.util.List;
import com.qrencia.subscription.category.Category;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "categories")  // ✅ Prevents lazy-loading issues
@Table(name = "Features")  // 🚀 Updated table name
public class Feature {  // 🚀 Renamed from 'SubscriptionService' to 'Feature'

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer featureId;  // 🚀 Updated ID field name

    @Column(nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @ManyToMany(mappedBy = "features")  // 🚀 Updated mappedBy reference (ensure it matches in Category.java)
    private List<Category> categories;
}
