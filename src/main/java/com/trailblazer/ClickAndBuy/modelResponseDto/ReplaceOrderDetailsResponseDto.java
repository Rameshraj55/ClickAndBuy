package com.trailblazer.ClickAndBuy.modelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplaceOrderDetailsResponseDto extends RepresentationModel<ReplaceOrderDetailsResponseDto> {

    private Integer replaceOrderRequestId;

    private LocalDateTime replaceTimeStamp;

    private String status;

    private String approvedBy;

    private Boolean approved;

    private CustomerDetailsResponseDto customer;

    private OrderDetailsResponseDto order;

    // Replacement Order
    private Boolean isReplacementOrderGenerated;

    // Replacement Order for Original Order
    private Integer replacementOrderId;

}
