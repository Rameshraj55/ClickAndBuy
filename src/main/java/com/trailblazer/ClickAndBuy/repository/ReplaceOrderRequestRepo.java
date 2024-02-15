package com.trailblazer.ClickAndBuy.repository;

import com.trailblazer.ClickAndBuy.model.Customer;
import com.trailblazer.ClickAndBuy.model.Order;
import com.trailblazer.ClickAndBuy.model.ReplaceOrderRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReplaceOrderRequestRepo extends JpaRepository<ReplaceOrderRequest, Integer> {

    Page<ReplaceOrderRequest> findByApprovedBy(Boolean approved, Pageable pageable);

    Optional<ReplaceOrderRequest> findByOrder(Order order);

    Page<ReplaceOrderRequest> findByCustomer(Customer customer, Pageable pageable);
}
