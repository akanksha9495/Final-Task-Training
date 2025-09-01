package com.sutherland.finaltask.service;

import com.sutherland.finaltask.entity.Product;
import com.sutherland.finaltask.repo.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public Product create(Product product) {
        if (repo.existsById(product.getProductId())) {
            // simple replace-on-create behavior; adjust if you prefer error
            // throw new IllegalArgumentException("Product ID already exists: " + product.getProductId());
        }
        return repo.save(product);
    }

    @Override
    public List<Product> createBulk(List<Product> products) {
        return repo.saveAll(products);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> getAll() {
        return repo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> getByTypeAndPrice(String type, double priceThreshold) {
        return repo.findByTypeAndPriceGreaterThan(type, priceThreshold);
    }

    @Override
    public Product update(Product product) {
        
        return repo.save(product);
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
