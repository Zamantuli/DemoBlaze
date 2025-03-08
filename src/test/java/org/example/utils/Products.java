package org.example.utils;

public class Products {
    private final String productName;
    private final String productPrice;
    private final String productDescription;

    public Products(String productName, String productPrice, String productDescription) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }
}
