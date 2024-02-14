package com.trailblazer.ClickAndBuy.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;

    @Lob
    private String customerReview;

    @Max(5)
    private Double customerRating;

    @ElementCollection
    private List<Image> images;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime reviewTimeStamp;

    @ManyToOne // Many Reviews  associated with One Customer
    private Customer customer;

    @ManyToOne // Many Reviews associated with One Product
    private Product product;


}
