package com.sutherland.finaltask.service;

import com.sutherland.finaltask.entity.Product;
import com.sutherland.finaltask.repo.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Product> getAll() {
        return repo.findAll();
    }

    @Override
    public List<Product> getByTypeAndPrice(String type, double priceThreshold) {
        final String wanted = type == null ? "" : type.trim().toLowerCase(Locale.ROOT);
        return repo.findAll().stream()
                .filter(p -> p.getProductType() != null
                        && p.getProductType().trim().toLowerCase(Locale.ROOT).equals(wanted))
                .filter(p -> p.getPrice() > priceThreshold)
                .collect(Collectors.toList());
    }
}
