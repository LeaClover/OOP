package com.gb.data;

public class HotMeal extends Product{

    String type;

    public HotMeal(String name, Double cost, String type) {
        super(name, cost);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "HotMeal [name=" + super.getName() + ", cost=" + super.getCost() + ", type=" + type + "]";
    }
}
