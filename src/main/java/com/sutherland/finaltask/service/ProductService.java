package com.sutherland.finaltask.service;

import com.sutherland.finaltask.entity.Product;
import java.util.List;

public interface ProductService {
    Product create(Product product);
    List<Product> createBulk(List<Product> products);

    List<Product> getAll();
    List<Product> getByTypeAndPrice(String type, double priceThreshold);

    Product update(Product product); 
    void delete(int id);
}
