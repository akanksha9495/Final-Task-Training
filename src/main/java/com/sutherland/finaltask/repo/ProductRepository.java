package com.sutherland.finaltask.repo;

import com.sutherland.finaltask.entity.Product;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = Arrays.asList(
            new Product(101,"RedTape","Shoes",1500),
            new Product(102,"AllenSolley","Shirts",1000),
            new Product(103,"WoodLand","Shoes",2500),
            new Product(104,"Oxemberg","Shirts",900),
            new Product(105,"Arrow","Shirts",1100),
            new Product(106,"Bata","Shoes",899),
            new Product(107,"Raymond","Blazers",3000),
            new Product(108,"ParkAvenue","Blazers",2500),
            new Product(109,"PeterEngland","Shirts",1200),
            new Product(110,"LondonBridge","Shirts",700)
        );
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }
}
