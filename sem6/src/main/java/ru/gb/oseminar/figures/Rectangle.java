package ru.gb.oseminar.figures;

import ru.gb.oseminar.data.Poligon;

public class Rectangle extends Poligon {

    public Double sideA;
    public Double sideB;
    
    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }

    @Override
    public Double area() {
        return this.sideA * this.sideB;
    }

    @Override
    public Double perimetr() {
        return 2 * (this.sideA + this.sideB);
    }

    @Override
    public String toString() {
        return "Rectangle [sideA=" + sideA + ", sideB=" + sideB + "]";
    }
}
