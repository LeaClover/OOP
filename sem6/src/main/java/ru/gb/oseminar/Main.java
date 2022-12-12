package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;
import ru.gb.oseminar.figures.Circle;
import ru.gb.oseminar.figures.Rectangle;
import ru.gb.oseminar.figures.Square;
import ru.gb.oseminar.figures.Triangle;

public class Main {
    public static void main(String[] args ) {

        Controller c = new Controller();
        c.addFigureToList(new Circle(2.0));
        c.addFigureToList(new Triangle(2.0, 2.0, 2.0));
        c.addFigureToList(new Rectangle(3.0, 5.0));
        c.addFigureToList(new Square(5.0));
        c.showAllFigures();
        c.getAllAreas();
        c.showParamList("Площади фигур: ", c.getAllAreas());
        c.showParamList("Периметры фигур: ", c.getAllPerimetrs());
    }
}
