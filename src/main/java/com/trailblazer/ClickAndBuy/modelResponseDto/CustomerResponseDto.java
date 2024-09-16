package com.trailblazer.ClickAndBuy.modelResponseDto;

import com.trailblazer.ClickAndBuy.model.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDto {

    private Integer customerId;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private LocalDate dateOfBirth;

    private Image image;

    private LocalDateTime accountCreatedDate;

    private LocalDateTime accountUpdatedDate;

    private AddressResponseDto address;

    // private Set<RoleResponseDto> roles;

}
