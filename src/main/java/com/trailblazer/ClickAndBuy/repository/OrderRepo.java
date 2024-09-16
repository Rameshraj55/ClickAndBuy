package com.trailblazer.ClickAndBuy.repository;

import com.trailblazer.ClickAndBuy.model.Customer;
import com.trailblazer.ClickAndBuy.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

    Page<Order> findByCustomer(Customer customer, Pageable pageable);

    // sales made today,sales made last week, last month, Jan - Dec;
    Page<Order> findAllByOrderTimeStampBetween(LocalDateTime start, LocalDateTime end, Pageable pageable);

}
