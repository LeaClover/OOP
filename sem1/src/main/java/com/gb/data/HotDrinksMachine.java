package com.gb.data;

import java.util.List;

public class HotDrinksMachine implements Machine{

    private final List<Product> products;

    public HotDrinksMachine(List<Product> products) {this.products = products;}

    public Product getProduct(String name) {
        
        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Product %s not found!", name));
    }

    public HotDrinks getProduct(String name, Double volume, int temp) {
        
        for (Product product: products) {
            if (product instanceof HotDrinks) {
                if(product.getName().equalsIgnoreCase(name) && 
                    ((HotDrinks)product).getVolume() == volume &&
                    ((HotDrinks)product).getTemp() == temp) {
                    return (HotDrinks) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Product %s not found!", name));
    }
    
}
