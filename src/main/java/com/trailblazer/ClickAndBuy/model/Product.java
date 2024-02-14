package com.trailblazer.ClickAndBuy.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Integer productId;

    private String productName;

    private Double price;

    private Integer quantity;

    private ProductCategory category;

    private ProductStatus productStatus;





}
