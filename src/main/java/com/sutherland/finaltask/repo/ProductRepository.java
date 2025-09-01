package com.sutherland.finaltask.repo;

import com.sutherland.finaltask.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

   
    @Query("SELECT p FROM Product p " +
           "WHERE LOWER(p.productType) = LOWER(:type) " +
           "AND p.price > :price")
    List<Product> findByTypeAndPriceGreaterThan(String type, double price);
}
