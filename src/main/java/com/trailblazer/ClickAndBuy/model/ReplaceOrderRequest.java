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
public class ReplaceOrderRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer replaceOrderRequestId;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime replaceTimeStamp;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime replaceUpdatedTimeStamp;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Order order;

    private String status;

    private String approvedBy;

    private Boolean isApproved;

    // Replacement Order
    private Boolean isReplacementOrderGenerated;

    // Replacement Order for Original Order
    private Integer replacementOrderId;

}
