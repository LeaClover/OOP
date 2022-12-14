package com.gb.data;

import java.util.List;

public class BottleMachine implements Machine {

    private final List<Product> products;

    public BottleMachine(List<Product> products) {this.products = products;}

    public Product getProduct(String name) {
        
        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Product %s not found!", name));
    }

    public Drinks getProduct(String name, Double volume) {
        
        for (Product product: products) {
            if (product instanceof Drinks) {
                if(product.getName().equalsIgnoreCase(name) && 
                    ((Drinks)product).getVolume() == volume) {
                    return (Drinks) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Product %s not found!", name));
    }
    
}
