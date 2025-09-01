package com.sutherland.finaltask.controller;

import com.sutherland.finaltask.entity.Product;
import com.sutherland.finaltask.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping 
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

   
    @PostMapping("/products")
    public Product create(@Valid @RequestBody Product product) {
        return service.create(product);
    }

    @PostMapping("/products/bulk")
    public List<Product> createBulk(@Valid @RequestBody List<Product> products) {
        return service.createBulk(products);
    }

    @GetMapping("/products")
    public List<Product> getAll() {
        return service.getAll();
    }

 
    @GetMapping("/products/search")
    public List<Product> searchByTypeAndPrice(@RequestParam String type,
                                              @RequestParam double price) {
        return service.getByTypeAndPrice(type, price);
    }

    @PutMapping("/products/{id}")
    public Product update(@PathVariable int id, @Valid @RequestBody Product product) {
        product.setProductId(id);
        return service.update(product);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

   
    @GetMapping("/getAllProducts")
    public List<Product> legacyGetAllProducts() {
        return service.getAll();
    }

   
    @GetMapping("/getByTypeAndPrice")
    public List<Product> legacyGetByTypeAndPrice(@RequestParam String type,
                                                 @RequestParam double price) {
        return service.getByTypeAndPrice(type, price);
    }
}
