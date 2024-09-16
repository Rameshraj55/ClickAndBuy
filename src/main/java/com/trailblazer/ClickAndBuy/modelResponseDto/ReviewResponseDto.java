package com.trailblazer.ClickAndBuy.modelResponseDto;

import com.trailblazer.ClickAndBuy.model.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewResponseDto extends RepresentationModel<ReviewResponseDto> {
    private Integer reviewId;

    private String customerReview;

    private Double customerRating;

    private List<Image> images;

    private LocalDateTime reviewTimeStamp;

    private CustomerDetailsResponseDto customer;
}
