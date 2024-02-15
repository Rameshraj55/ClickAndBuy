package com.trailblazer.ClickAndBuy.modelResponseDto;

import com.trailblazer.ClickAndBuy.model.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetailsResponseDto extends RepresentationModel<CustomerDetailsResponseDto> {

    private Integer customerId;

    private String firstName;

    private String lastName;

    private String contact;

    private String email;

    private LocalDate dateOfBirth;

    private Image image;

    private LocalDateTime accountCreatedDate;

    private LocalDateTime accountUpdatedDate;


}
