package com.trailblazer.ClickAndBuy.modelResponseDto;

import com.trailblazer.ClickAndBuy.model.OrderProductDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDto extends RepresentationModel<OrderResponseDto> {

    private Integer orderId;

    private String status;

    private LocalDateTime orderTimeStamp;

    private LocalDateTime orderUpdatedTimeStamp;

    private LocalDateTime expectedDeliveryDate;

    private Integer orderQuantity;

    private Double orderTotalAmount;

    private PaymentResponseDto payment;

    private CustomerResponseDto customer;

    private List<OrderProductDetails> listOfProducts;

    private Boolean isOrderCancelled;

    private Boolean isOrderReturned;

    private Boolean isOrderReplaced;

    private Boolean isOrderRefunded;

    private Boolean isOrderDelivered;

    private Boolean isReplacementOrder;

    private Integer originalOrderId;
}
