package com.trailblazer.ClickAndBuy.repository;

import com.trailblazer.ClickAndBuy.model.Customer;
import com.trailblazer.ClickAndBuy.model.Product;
import com.trailblazer.ClickAndBuy.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo  extends JpaRepository<Review, Integer> {

    Page<Review> findByProductOrderByCustomerRating(Product product, Pageable pageable);

    Page<Review> findByProductOrderByReviewTimeStamp(Product product, Pageable pageable);

    List<Review> findByProduct(Product product);

    List<Review> findByCustomer(Customer customer);
}
