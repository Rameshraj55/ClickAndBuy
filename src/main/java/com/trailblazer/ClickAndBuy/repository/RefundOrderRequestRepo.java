package com.trailblazer.ClickAndBuy.repository;

import com.trailblazer.ClickAndBuy.model.Customer;
import com.trailblazer.ClickAndBuy.model.Order;
import com.trailblazer.ClickAndBuy.model.RefundOrderRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefundOrderRequestRepo  extends JpaRepository<RefundOrderRequest, Integer> {

    Page<RefundOrderRequest> findByApprovedBy(Boolean approved, Pageable pageable);

    Optional<RefundOrderRequest> findByOrder(Order order);

    Page<RefundOrderRequest> findByCustomer(Customer customer, Pageable pageable);

}
