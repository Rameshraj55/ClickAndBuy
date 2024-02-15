package com.trailblazer.ClickAndBuy.repository;

import com.trailblazer.ClickAndBuy.model.CancelOrderRequest;
import com.trailblazer.ClickAndBuy.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface CancelOrderRequestRepo extends JpaRepository<CancelOrderRequest, Integer> {

    Optional<CancelOrderRequest> findByOrder(Order order);

}
