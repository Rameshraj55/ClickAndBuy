package com.trailblazer.ClickAndBuy.modelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnReplaceOrderResponseDto {

    private Integer returnOrderRequestId;

    private Boolean returnForReplacement;

    private LocalDateTime returnTimeStamp;

    private LocalDateTime returnUpdatedTimeStamp;

    private Boolean isReturnOrderPickedUp;

    private String status;

    private OrderDetailsResponseDto order;

    private CustomerResponseDto customer;

    private PickUpOrderResponseDto pickUpOrderRequest;

    private ReplaceOrderResponseDto replaceOrderRequest;
}
