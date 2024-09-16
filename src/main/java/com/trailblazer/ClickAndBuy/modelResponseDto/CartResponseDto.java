package com.trailblazer.ClickAndBuy.modelResponseDto;

import com.trailblazer.ClickAndBuy.model.OrderProductDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartResponseDto {

    private Integer cartId;

    private Integer cartQuantity;

    private Double cartTotalAmount;

    private List<OrderProductDetails> listOfProducts = new ArrayList<>();
}
