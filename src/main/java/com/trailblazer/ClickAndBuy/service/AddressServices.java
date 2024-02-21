package com.trailblazer.ClickAndBuy.service;

import com.trailblazer.ClickAndBuy.exception.ResourceNotFoundException;
import com.trailblazer.ClickAndBuy.modelRequestDto.AddressRequestDto;
import com.trailblazer.ClickAndBuy.modelRequestDto.AddressUpdateRequestDto;
import com.trailblazer.ClickAndBuy.modelResponseDto.AddressResponseDto;
import com.trailblazer.ClickAndBuy.modelResponseDto.CustomerResponseDto;

public interface AddressServices {


    // Address is Resource so "ResourceNotFoundException" is used
    AddressResponseDto getAddressDetails(String customerMobileNumber) throws ResourceNotFoundException;

    // why CustomerResponseDto to be returned? think!!!
    CustomerResponseDto addAddressDetails(String customerMobileNumber,
                                          AddressRequestDto addressRequestDto) throws ResourceNotFoundException;

    CustomerResponseDto updateAddressDetails(String customerMobileNumber,
                         AddressUpdateRequestDto addressUpdateRequestDto) throws ResourceNotFoundException;



}
