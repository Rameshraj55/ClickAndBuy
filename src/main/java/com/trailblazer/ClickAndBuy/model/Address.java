package com.trailblazer.ClickAndBuy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    private String addressLine1;

    private String addressLine2;

    private String buildingName;

    private String landMark;

    private String city;

    private String state;

    private String country;

    // we can also use specific pattern using regex. e.g:"[0-9]{6} for india"
    private String pincode;

    // TEST JSON
    /*
    {
        "addressLine1": ,
        "addressLine2": ,
        "buildingName": ,
        "landMark": ,
        "city": ,
        "state": ,
        "country": ,
        "pincode": .
    }
    */

}
