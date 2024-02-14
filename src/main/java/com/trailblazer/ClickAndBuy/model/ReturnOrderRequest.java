package com.trailblazer.ClickAndBuy.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ReturnOrderRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer returnOrderRequestId;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime returnTimeStamp;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime returnUpdatedTimeStamp;


    private Boolean isReturnOrderPickedUp;

    private Boolean returnForReplacement;

    private Boolean returnForRefund;

    private String status;

    @OneToOne
    private Order order;

    @OneToOne
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    private PickUpOrderRequest pickUpOrderRequest;

    @OneToOne(cascade = CascadeType.ALL)
    private ReplaceOrderRequest replaceOrderRequest;

    @OneToOne(cascade = CascadeType.ALL)
    private RefundOrderRequest refundOrderRequest;

}
