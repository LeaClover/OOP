package com.gb.data;

public interface Machine  {

    Product getProduct(String name) throws IllegalStateException;
    
}
