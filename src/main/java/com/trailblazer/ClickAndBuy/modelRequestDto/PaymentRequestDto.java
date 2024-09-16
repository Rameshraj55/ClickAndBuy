package com.trailblazer.ClickAndBuy.modelRequestDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDto {

    @NotNull(message = "{Payment.id.invalid}")
    private Integer paymentId;

    @NotNull(message = "{Payment.type.invalid}")
    @NotBlank(message = "{Payment.type.invalid}")
    @NotEmpty(message = "{Payment.type.invalid}")
    private String paymentType;

    @NotNull(message = "{Payment.allowed.invalid}")
    private Boolean allowed;
}
