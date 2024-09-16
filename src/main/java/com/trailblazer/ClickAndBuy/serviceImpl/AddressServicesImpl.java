package com.trailblazer.ClickAndBuy.serviceImpl;

import com.jayway.jsonpath.JsonPath;
import com.trailblazer.ClickAndBuy.exception.ResourceNotFoundException;
import com.trailblazer.ClickAndBuy.model.Address;
import com.trailblazer.ClickAndBuy.model.Customer;
import com.trailblazer.ClickAndBuy.modelRequestDto.AddressRequestDto;
import com.trailblazer.ClickAndBuy.modelRequestDto.AddressUpdateRequestDto;
import com.trailblazer.ClickAndBuy.modelResponseDto.AddressResponseDto;
import com.trailblazer.ClickAndBuy.modelResponseDto.CustomerResponseDto;
import com.trailblazer.ClickAndBuy.repository.CustomerRepo;
import com.trailblazer.ClickAndBuy.service.AddressServices;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AddressServicesImpl implements AddressServices {

    /*
    * 1. implement regarding interface
    * 2. add @Service
    * 3. implement interface methods(knowing interface and SOLID principles well)
    * 4. Dependency Injection - add @Autowired for instantiation
    * 5.  */


    private ModelMapper modelMapper;

    @Autowired
    private CustomerRepo customerRepo;

    public AddressServicesImpl() {
    }


    /*
    * Add new Address to Customer
    * */
    @Override
    public CustomerResponseDto addAddressDetails(String customerMobileNumber, AddressRequestDto addressRequestDto) throws ResourceNotFoundException {

        Customer customer = this.customerRepo.findByMobileNumber(customerMobileNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Customer", "Mobile Number",customerMobileNumber));

        // DTO things converted to Objects
        Address address =  this.toAddress(addressRequestDto);

        customer.setAddress(address);

        this.customerRepo.save(customer);

        return this.toCustomerResponseDto(customer);
    }


    /*
     * Get Address from Customer
     * */
    @Override
    public AddressResponseDto getAddressDetails(String customerMobileNumber) throws ResourceNotFoundException {
        Customer customer = this.customerRepo.findByMobileNumber(customerMobileNumber)
                .orElseThrow(()-> new ResourceNotFoundException("Customer", "Mobile Number",customerMobileNumber));

        return this.toAddressResponseDto(customer.getAddress()); // think how is working??
    }


    /*
     *Update Address to Customer
     * */
    @Override
    public CustomerResponseDto updateAddressDetails(String customerMobileNumber, AddressUpdateRequestDto addressUpdateRequestDto) throws ResourceNotFoundException {
        return null;
    }
    
    // Model Mapping
    // think how is working??
    private Address toAddress(AddressRequestDto addressRequestDto){
        return modelMapper.map(addressRequestDto, Address.class);
    }
    private AddressResponseDto toAddressResponseDto(Address address) {
        return modelMapper.map(address, AddressResponseDto.class);
    }

    // Necessary for mapping Nested Objects
    private CustomerResponseDto toCustomerResponseDto(Customer customer){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE); // Important for Revise

        return modelMapper.map(customer, CustomerResponseDto.class);
    }
}
