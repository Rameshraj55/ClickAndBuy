package com.trailblazer.ClickAndBuy.repository;

import com.trailblazer.ClickAndBuy.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    Optional<Customer> findByMobileNumber(String mobileNumber);

    List<Customer> findByEmail(String email);

    List<Customer> findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);

    Boolean existsByEmail(String email);

    Boolean existsByMobileNumber(String mobileNumber);

    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);

}
