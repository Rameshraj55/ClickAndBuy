package com.trailblazer.ClickAndBuy.modelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefundOrderDetailsResponseDto extends RepresentationModel<RefundOrderDetailsResponseDto> {

    private Integer refundOrderRequestId;

    private LocalDateTime refundTimestamp;

    private LocalDateTime refundUpdatedTimeStamp;

    private Double orderTotalAmount;

    private String approvedBy;

    private Boolean approved;

    private String status;

    private PaymentResponseDto payment;

    private CustomerDetailsResponseDto customer;

    private OrderDetailsResponseDto order;

}
