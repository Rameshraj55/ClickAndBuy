package com.trailblazer.ClickAndBuy.modelResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategoryResponseDto {
    private Integer categoryId;

    private String categoryName;

    private String categoryDescription;

    private Boolean active;

    private LocalDateTime categoryAddedDateTime;

    private LocalDateTime categoryUpdatedDateTime;
}
