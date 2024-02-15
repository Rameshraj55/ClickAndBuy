package com.trailblazer.ClickAndBuy.modelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponseDto  extends RepresentationModel<PaymentResponseDto> {

    private Integer paymentId;

    private String paymentType;

    private Boolean allowed;

    private LocalDateTime paymentAddedTimeStamp;

    private LocalDateTime paymentUpdatedTimeStamp;

}
