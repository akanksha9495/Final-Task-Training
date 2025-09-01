package com.sutherland.finaltask.service;

import com.sutherland.finaltask.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAll();
    List<Product> getByTypeAndPrice(String type, double priceThreshold);
}
