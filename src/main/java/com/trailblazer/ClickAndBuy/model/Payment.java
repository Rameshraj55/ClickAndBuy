package com.trailblazer.ClickAndBuy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Payment {
    @Id
    @Column(unique = true)
    private Integer paymentId;

    private String paymentTpe;

    private Boolean allowed;

    @CreationTimestamp
    @Column(nullable = false,updatable = false)
    private LocalDateTime paymentAddedTimeStamp;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime paymentUpdatedTimeStamp;


}
