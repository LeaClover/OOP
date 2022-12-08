package com.gb.data;

import java.util.List;

public class SnackMachine implements Machine{
    
    private final List<Product> products;

    public SnackMachine(List<Product> products) {this.products = products;}

    public Product getProduct(String name) {
        
        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Product %s not found!", name));
    }

    public Snacks getProduct(String name, String taste) {
        
        for (Product product: products) {
            if (product instanceof Snacks) {
                if(product.getName().equalsIgnoreCase(name) && 
                    ((Snacks)product).getTaste() == taste) {
                    return (Snacks) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Product %s not found!", name));
    }
}
