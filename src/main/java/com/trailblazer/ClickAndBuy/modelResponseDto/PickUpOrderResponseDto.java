package com.trailblazer.ClickAndBuy.modelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PickUpOrderResponseDto {

    private Integer pickUpOrderRequestId;

    private LocalDateTime pickUpOrderTimeStamp;

    private LocalDateTime pickUpOrderUpdatedTimeStamp;

    private Boolean isReturnOrderPickedUp;

    private LocalDateTime expectedPickUpDate;
}
