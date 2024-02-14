package com.trailblazer.ClickAndBuy.model;

import jakarta.persistence.*;
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
public class PickUpOrderRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pickUpOrderRequestId;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime pickUpOrderTimeStamp;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime pickUpOrderUpdatedTimeStamp;

    private LocalDateTime expectedPickUpDate;

    private String pickedUpBy;

    private Boolean isReturnOrderPickedUp;

    @OneToOne
    private Customer customer;

    @OneToOne
    private Order order;

}
