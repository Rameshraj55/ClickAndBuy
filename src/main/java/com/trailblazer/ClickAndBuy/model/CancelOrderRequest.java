package com.trailblazer.ClickAndBuy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CancelOrderRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cancelOrderRequestId;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime cancelTimeStamp;

    private Boolean isOrderCancelled;

    private Boolean isOrderRefunded;

    private String status;

    @OneToOne
    private Order order;

    @OneToOne
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    private RefundOrderRequest refundOrderRequest;

}
