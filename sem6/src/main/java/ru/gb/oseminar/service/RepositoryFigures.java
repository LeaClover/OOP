package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.List;
import ru.gb.oseminar.data.Figure;
import ru.gb.oseminar.data.IRepository;

public class RepositoryFigures implements IRepository <Figure> {

    private final List<Figure> figureList;

    public RepositoryFigures() {
        this.figureList = new ArrayList<Figure>();
    }

    @Override
    public void add(Figure value) {
        this.figureList.add(value);
    }
    
    public List<Figure> getFigureList() {
        return this.figureList;
    }
}
