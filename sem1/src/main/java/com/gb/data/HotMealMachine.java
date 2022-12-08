package com.gb.data;

import java.util.List;

public class HotMealMachine implements Machine{

    private final List<Product> products;

    public HotMealMachine(List<Product> products) {this.products = products;}

    public Product getProduct(String name) {
        
        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Product %s not found!", name));
    }

    public HotMeal getProduct(String name, String type) {
        
        for (Product product: products) {
            if (product instanceof HotMeal) {
                if(product.getName().equalsIgnoreCase(name) && 
                    ((HotMeal)product).getType() == type) {
                    return (HotMeal) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Product %s not found!", name));
    }
    
}
