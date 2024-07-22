package com.trailblazer.ClickAndBuy.modelRequestDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequestDto {
    @NotEmpty(message = "{Category.name.invalid}")
    @NotNull(message = "{Category.name.invalid}")
    @NotBlank(message = "{Category.name.invalid}")
    @Size(min = 3, message = "Category Name Should be Minimum of 3 Characters")
    private String categoryName;

    @NotEmpty(message = "{Category.description.invalid}")
    @NotNull(message = "{Category.description.invalid}")
    @NotBlank(message = "{Category.description.invalid}")
    private String categoryDescription;

    @NotNull(message = "Category Should be Active or InActive")
    private Boolean active;

}
