package com.gb.data;

public class Snacks extends Product {

    String taste;

    public Snacks(String name, Double cost, String taste) {
        super(name, cost);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Snacks [name=" + super.getName() + ", cost=" + super.getCost() + ", taste=" + taste + "]";
    }
}
