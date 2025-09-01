package com.sutherland.finaltask.controller;

import com.sutherland.finaltask.entity.Product;
import com.sutherland.finaltask.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return service.getAll();
    }

    @GetMapping("/getByTypeAndPrice")
    public List<Product> getByTypeAndPrice(@RequestParam String type,
                                           @RequestParam double price) {
        return service.getByTypeAndPrice(type, price);
    }
}
