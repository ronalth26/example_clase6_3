package com.example.demoAppv1.domain;

import org.springframework.stereotype.Component;

@Component
public class Seller {

    private String name = "Julio";
    private String store = "Mi tienda v3";
    private Product product;

    public Seller(String name, String store, Product product) {
        this.name = name;
        this.store = store;
        this.product = product;
    }


    public Seller(String name, String store) {
        this.name = name;
        this.store = store;
    }

    public Seller() {
    }

    public void showInfo() {
        System.out.println("Seller: " + this.name + " | Store: " + this.store);
        if (this.product != null) {
            System.out.println("Product: " + this.product.getName() + " | Price: " + this.product.getPrice());
        } else {
            System.out.println("No product assigned.");
        }
    }

    public void showInfo3() {
        System.out.println("Seller prueba ");
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
