package com.trailblazer.ClickAndBuy.repository;

import com.trailblazer.ClickAndBuy.model.Order;
import com.trailblazer.ClickAndBuy.model.RefundOrderRequest;
import com.trailblazer.ClickAndBuy.model.ReplaceOrderRequest;
import com.trailblazer.ClickAndBuy.model.ReturnOrderRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReturnOrderRequestRepo extends JpaRepository<ReturnOrderRequest, Integer> {

    Optional<ReturnOrderRequest> findByOrder(Order order);

    Optional<ReturnOrderRequest> findByReplaceOrderRequest(ReplaceOrderRequest replaceOrderRequest);

    Optional<ReturnOrderRequest> findByRefundOrderRequest(RefundOrderRequest refundOrderRequest);

}
