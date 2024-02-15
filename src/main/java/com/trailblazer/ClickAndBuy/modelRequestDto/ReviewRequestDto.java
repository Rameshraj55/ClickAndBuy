package com.trailblazer.ClickAndBuy.modelRequestDto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewRequestDto {

    @NotNull(message = "{Review.field.invalid}")
    @NotBlank(message = "{Review.field.invalid}")
    @NotEmpty(message = "{Review.field.invalid}")
    private String customerReview;

    @Max(5)
    @NotNull(message = "{Review.rating.invalid}")
    private Double customerRating;


}
