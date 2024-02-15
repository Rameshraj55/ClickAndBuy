package com.trailblazer.ClickAndBuy.modelRequestDto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDto {
    @NotNull(message = "{Customer.name.invalid}")
    @NotBlank(message = "{Customer.name.invalid}")
    @NotEmpty(message = "{Customer.name.invalid}")
    private String firstName;

    @NotNull(message = "{Customer.name.invalid}")
    @NotBlank(message = "{Customer.name.invalid}")
    @NotEmpty(message = "{Customer.name.invalid}")
    private String lastName;

    @NotNull(message = "{Customer.contact.invalid}")
    @NotBlank(message = "{Customer.contact.invalid}")
    @NotEmpty(message = "{Customer.contact.invalid}")
    @Size(min = 10, max = 12, message = "{Customer.contact.invalid}")
    private String phoneNumber;

    @NotNull(message = "{Customer.email.invalid}")
    @NotBlank(message = "{Customer.email.invalid}")
    @NotEmpty(message = "{Customer.email.invalid}")
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", flags = Pattern.Flag.CASE_INSENSITIVE, message = "{Customer.email.invalid}")
    private String email;

    @NotNull(message = "{Customer.password.invalid}")
    @NotBlank(message = "{Customer.password.invalid}")
    @NotEmpty(message = "{Customer.password.invalid}")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){6,12}$", message = "{Customer.password.invalid}")
    private String password;

    @Past(message = "Date of Birth Should be in Past")
    private LocalDate dateOfBirth;
}
