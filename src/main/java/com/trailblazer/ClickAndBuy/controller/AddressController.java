package com.trailblazer.ClickAndBuy.controller;


import com.trailblazer.ClickAndBuy.exception.ResourceNotFoundException;
import com.trailblazer.ClickAndBuy.modelRequestDto.AddressRequestDto;
import com.trailblazer.ClickAndBuy.modelResponseDto.AddressResponseDto;
import com.trailblazer.ClickAndBuy.modelResponseDto.CustomerResponseDto;
import com.trailblazer.ClickAndBuy.service.AddressServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressServices addressServices;

    @GetMapping("/welcome")
    public String helloClickAndBuy() {
        return "Welcome to \"Click and Buy Shopping\"";
    }

    /*
    * Create Customer Address
    * */
    // ResourceNotAllowedException is not added
    @PostMapping("/customer/{phonenumber}")
    public ResponseEntity<CustomerResponseDto> addAddressDetailsHandler(@PathVariable("phonenumber")String phoneNumber,
                                                                        @Valid @RequestBody AddressRequestDto addressRequestDto) throws ResourceNotFoundException {
        CustomerResponseDto customerResponseDto = this.addressServices.addAddressDetails(phoneNumber,addressRequestDto);

        // create Self Link : using Spring HATEOAS

        return new ResponseEntity<CustomerResponseDto>(customerResponseDto,HttpStatus.CREATED);
    }

   /* public ResponseEntity<AddressResponseDto> getAddressDetailsHandler(@PathVariable("phonenumber") String phoneNumber) throws ResourceNotFoundException {

        AddressResponseDto addressDetails = this.addressServices.getAddressDetails(phoneNumber);



        return new ResponseEntity<AddressResponseDto>(addressDetails, HttpStatus.OK);
    }*/
}
