package com.trailblazer.ClickAndBuy.service;

import com.trailblazer.ClickAndBuy.exception.FileTypeNotValidException;
import com.trailblazer.ClickAndBuy.exception.ResourceNotFoundException;
import com.trailblazer.ClickAndBuy.model.Customer;
import com.trailblazer.ClickAndBuy.modelRequestDto.CustomerRequestDto;
import com.trailblazer.ClickAndBuy.modelRequestDto.CustomerUpdateRequestDto;
import com.trailblazer.ClickAndBuy.modelResponseDto.CustomerDetailsResponseDto;
import com.trailblazer.ClickAndBuy.modelResponseDto.CustomerResponseDto;
import com.trailblazer.ClickAndBuy.payloads.ApiResponse;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CustomerServices {

    /*
    * Register Customer
    * */
   CustomerDetailsResponseDto registerCustomer(CustomerRequestDto customerRequestDto)
                    throws ResourceNotFoundException;

   /*
   * Get Customer details
   * */
    CustomerResponseDto getCustomer(String phoneNumber) throws ResourceNotFoundException;

    /*
    * Update Customer
    * */
    CustomerDetailsResponseDto updateCustomerDetails(String phoneNumber,
                                                     CustomerUpdateRequestDto customerUpdateRequestDto) throws ResourceNotFoundException;

    /*
     * Delete Customer account
     *
     * */
    ApiResponse deleteCustomerAccount(String phoneNumber) throws ResourceNotFoundException;

    /*
     * Searching Customers
     *
     * */
    List<CustomerResponseDto> searchByFirstName(String firstName);

    List<CustomerResponseDto> searchByLastName(String lastName);

    List<CustomerResponseDto> searchByFirstAndLastName(String firstName, String lastName);

    List<CustomerResponseDto> searchByEmailId(String email);

    Page<Customer> getAllCustomerDetails(Integer page, Integer size, String sortDirection, String sortBy);

    /*
    * Image CRUD operations
    * */
    CustomerDetailsResponseDto  updateCustomerImage(String phoneNumber, MultipartFile image)
                    throws ResourceNotFoundException, IOException, FileTypeNotValidException;

    void serveCustomerImage(String imgName, HttpServletResponse response)
                    throws ResourceNotFoundException, IOException, FileTypeNotValidException;

    ApiResponse deleteCustomerImage(String fileName) throws IOException;


}
