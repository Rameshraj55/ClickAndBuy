package com.trailblazer.ClickAndBuy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;    // We can use also UUID

    @Enumerated(EnumType.STRING)
    private ProductStatus orderStatus;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime orderTimeStamp;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime orderUpdatedTimeStamp;

    private LocalDateTime expectedDeliveryDate;

    private Integer orderQuantity;

    private Double orderTotalAmount;

    @OneToOne
    private Payment payment;

    @ManyToOne
    private Customer customer;

    @ElementCollection
    private List<OrderProductDetails> listOfProducts = new ArrayList<>();

    // product should be added to Inventory
    private Boolean isOrderCancelled;

    /*
        * Returned By Customer Return Request
        Generated after confirming Pickup request
        * after Pickup replacement / refund request generation
        * added to inventory
    */
    private Boolean isOrderReturned;

    /*
        * Replaced By Customer Product
        * Should be Not be added to Inventory
        * Replacement Request Should be Generated, After Confirming New Order Should be Placed
    */
    private Boolean isOrderReplaced;

    /*
        * Refunded to customer or not
        * Product Should be added to Inventory,
        * Refund Request Should be Generated and Payment Should be received by the Customer
     */
    private Boolean isOrderRefunded;

    private Boolean isOrderDelivered;

    private Boolean isReplacementOrder;

    // Replacement order for original order
    private Integer originalOrderId;

}
