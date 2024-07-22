package com.trailblazer.ClickAndBuy.modelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefundOrderResponseDto {

    private Integer refundOrderRequestId;

    private LocalDateTime refundTimestamp;

    private LocalDateTime refundUpdatedTimeStamp;

    private Double orderTotalAmount;

    private Boolean approved;

    private String status;

    private PaymentResponseDto payment;
}
