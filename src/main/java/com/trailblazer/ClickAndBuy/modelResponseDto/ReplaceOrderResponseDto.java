package com.trailblazer.ClickAndBuy.modelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplaceOrderResponseDto {

    private Integer replaceOrderRequestId;

    private LocalDateTime replaceTimeStamp;

    private LocalDateTime replaceUpdatedTimeStamp;

    private String status;

    private Boolean approved;

    // Replacement Order
    private Boolean isReplacementOrderGenerated;

    // Replacement Order for Original Order
    private Integer replacementOrderId;
}
