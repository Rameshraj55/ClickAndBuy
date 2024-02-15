package com.trailblazer.ClickAndBuy.repository;

import com.trailblazer.ClickAndBuy.model.Product;
import com.trailblazer.ClickAndBuy.model.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo  extends JpaRepository<Product, Integer> {

   List<Product> findByproductNameContaining(String keyword);

    List<Product> findByTypeContaining(String keyword);

    // Having doubt with "ProductCategory" related filters
//    List<Product> findByProductCategory(ProductCategory category); // error

  //  Page<Product> findByProductCategoryOrderByRating(ProductCategory category, Pageable pageable); // error

 //   Page<Product> findByProductCategoryOrderByRatingDesc(ProductCategory category, Pageable pageable); // error

   // Page<Product> findByProductCategoryOrderByProductAddedDateTime(ProductCategory category, Pageable pageable); // error

   // Page<Product> findByProductCategoryOrderByProductAddedDateTimeDesc(ProductCategory category, Pageable pageable); // error

   // Page<Product> findByBuyersChoice(Boolean buyerschoice, Pageable pageable); // error

    Page<Product> findByDiscountPercentage(Integer discountPercentage, Pageable pageable);

    Page<Product> findByOnDiscountSale(Boolean onDiscountSale, Pageable pageable);

//    // Least sold product
//    Optional<Product> findFirstByOrderByTotalSalesAsc();
//
//    // Highest sold product
//    Optional<Product> findFirstByOrderByTotalSalesDesc();

    // highest sold product ordered by rating in given duration
//    Page<Product> findByRatingOrderByTotalSalesAsc(Double rating, Pageable pageable);

//    Page<Product> findByRatingOrderByTotalSalesDesc(Double rating, Pageable pageable);

    // highest sold product categorised underselling price
//    Page<Product> findBySalePriceOrderByTotalSalesAsc(Double salePrice, Pageable pageable);

//    Page<Product> findBySalePriceOrderByTotalSalesDesc(Double salePrice, Pageable pageable);

    // highest sold product in different categories
    // Using JPQL
    // highest sold product ordered by rating in given duration, how to use duration
    // Using JPQL

}
