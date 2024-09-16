package com.trailblazer.ClickAndBuy.repository;

import com.trailblazer.ClickAndBuy.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {

    @Override
    default boolean existsById(Integer id) {
        return false;
    }
}
