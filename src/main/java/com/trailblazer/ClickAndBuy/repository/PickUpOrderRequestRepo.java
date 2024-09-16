package com.trailblazer.ClickAndBuy.repository;

import com.trailblazer.ClickAndBuy.model.Order;
import com.trailblazer.ClickAndBuy.model.PickUpOrderRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PickUpOrderRequestRepo extends JpaRepository<PickUpOrderRequest, Integer> {

    Optional<PickUpOrderRequest> findByOrder(Order order);

    Page<PickUpOrderRequest> findByIsReturnOrderPickedUp(Boolean isReturnOrderPickedUp, Pageable pageable);

}
