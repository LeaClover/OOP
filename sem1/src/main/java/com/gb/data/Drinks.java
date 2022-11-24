package com.gb.data;

public class Drinks extends Product {

    Double volume;

    public Drinks(String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drinks [name=" + super.getName() + ", cost=" + super.getCost() + ", volume=" + volume + "]";
    }
    
}
