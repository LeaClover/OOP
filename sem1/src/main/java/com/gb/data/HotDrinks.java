package com.gb.data;

public class HotDrinks extends Drinks{

    int temp;

    public HotDrinks(String name, Double cost, Double volume, int temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrinks [name=" + super.getName() + ", cost=" + super.getCost() + ", volume=" + volume + ", temp=" + temp + "]";
    }

    
    
}
