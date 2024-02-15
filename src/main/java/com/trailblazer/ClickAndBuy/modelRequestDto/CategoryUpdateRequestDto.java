package com.trailblazer.ClickAndBuy.modelRequestDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryUpdateRequestDto {
    private String categoryName;

    private String categoryDescription;

    private Boolean active;

}
