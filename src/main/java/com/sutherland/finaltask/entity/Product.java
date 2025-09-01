package com.sutherland.finaltask.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "product_id", nullable = false)
    // Keeping manual assignment so you can set productId from Swagger
    private int productId;

    @NotBlank
    @Column(name = "product_name", nullable = false, length = 100)
    private String productName;

    @NotBlank
    @Column(name = "product_type", nullable = false, length = 50)
    private String productType;

    @NotNull
    @Min(0)
    @Column(name = "price", nullable = false)
    private Double price;

    public Product() {}

    public Product(int productId, String productName, String productType, double price) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getProductType() { return productType; }
    public void setProductType(String productType) { this.productType = productType; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
