package com.trailblazer.ClickAndBuy.modelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnRefundOrderResponseDto {

    private Integer returnOrderRequestId;

    private Boolean returnForRefund;

    private LocalDateTime returnTimeStamp;

    private LocalDateTime returnUpdatedTimeStamp;

    private Boolean isReturnOrderPickedUp;

    private String status;

    private OrderDetailsResponseDto order;

    private CustomerResponseDto customer;

    private RefundOrderResponseDto refundOrderRequest;

    private PickUpOrderResponseDto pickUpOrderRequest;
}
