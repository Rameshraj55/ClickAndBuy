package com.trailblazer.ClickAndBuy.modelResponseDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponseDto extends RepresentationModel<AddressResponseDto> {

    private Integer addressId;

    private String addressLine1;

    private String addressLine2;

    private String buildingName;

    private String landMark;

    private String city;

    private String state;

    private String country;

    private String pinCode;

    private LocalDateTime addressCreatedDate;

    private LocalDateTime addressUpdatedDate;
}
