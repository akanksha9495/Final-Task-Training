package com.sutherland.finaltask.entity;

public class Product {
    private int productId;
    private String productName;
    private String productType;
    private double price;

    public Product() {}

    public Product(int productId, String productName, String productType, double price) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
    }

    public int getProductId() 
    { return productId; }
    
    public void setProductId(int productId) 
    { this.productId = productId; }

    public String getProductName() 
    { return productName; }
    
    public void setProductName(String productName) 
    { this.productName = productName; }

    public String getProductType() 
    { return productType; }
    public void setProductType(String productType) 
    { this.productType = productType; }

    public double getPrice() 
    { return price; }
    public void setPrice(double price) 
    { this.price = price; }
}
