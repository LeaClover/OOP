package ru.gb.oseminar.figures;

import ru.gb.oseminar.data.Figure;
import ru.gb.oseminar.data.ILengthable;

public class Circle extends Figure implements ILengthable {
    private final Double pi = 3.14;
    public Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return this.pi*this.radius*this.radius;
    }

    @Override
    public Double length() {
        return 2*this.radius*this.pi;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
