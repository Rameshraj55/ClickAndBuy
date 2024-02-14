package com.trailblazer.ClickAndBuy.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;

    private String productName;

    @Lob
    private String productDescription;

    @Lob
    private String productTechnicalDetails;

    private String brand;

    private String type;

    private Double price; //sale price

    private Double marketPrice;

    private Integer discountPercentage;

    private Integer stockQuantity;

    private Double rating;

    @NotNull(message = "{Product Availability Should be True or False}")
    private Boolean available;

    @NotNull(message = "{Product On Sale or Discount Should be True or False}")
    private Boolean onDiscountSale;

    @NotNull(message = "{Customer's Best Choice Should be True or False}")
    private Boolean buyerschoice;

    private Integer manufacturingYear;

    private Integer manufacturingMonth;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime productAddedDateTime;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime productUpdatedDateTime;

    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private ProductCategory category;

    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;





}
