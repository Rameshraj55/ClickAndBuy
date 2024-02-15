package com.trailblazer.ClickAndBuy.modelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CancelOrderResponseDto {
    private Integer cancelOrderRequestId;

    private LocalDateTime cancelTimeStamp;

    private Boolean isOrderCancelled;

    private Boolean isOrderRefunded;

    private String status;

    private OrderDetailsResponseDto order;

    private CustomerDetailsResponseDto customer;

    private RefundOrderResponseDto refundOrderRequest;
}
