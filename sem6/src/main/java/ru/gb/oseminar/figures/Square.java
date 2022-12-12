package ru.gb.oseminar.figures;

public class Square extends Rectangle {

    public Double side;

    public Square(Double side) {
        super(side, side);
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public Double area() {
        return this.side*this.side;
    }

    @Override
    public Double perimetr() {
        return 4*this.side;
    }

    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }
}
