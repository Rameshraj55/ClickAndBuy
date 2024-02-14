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
public class RefundOrderRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer refundOrderRequestId;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime refundTimeStamp;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime refundUpdatedTimeStamp;

    private Double orderTotalAmount;

    private String approvedBy;

    private Boolean isApproved;

    private String status;

    @OneToOne
    private Payment payment;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Order order;
}
