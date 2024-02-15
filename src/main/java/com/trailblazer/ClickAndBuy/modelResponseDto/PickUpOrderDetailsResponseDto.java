package com.trailblazer.ClickAndBuy.modelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PickUpOrderDetailsResponseDto extends RepresentationModel<PickUpOrderDetailsResponseDto> {

    private Integer pickUpOrderRequestId;

    private LocalDateTime pickUpOrderTimeStamp;

    private LocalDateTime pickUpOrderUpdatedTimeStamp;

    private Boolean isReturnOrderPickedUp;

    private LocalDateTime expectedPickUpDate;

    private CustomerDetailsResponseDto customer;

    private OrderDetailsResponseDto order;


}
