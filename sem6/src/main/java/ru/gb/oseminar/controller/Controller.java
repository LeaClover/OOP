package ru.gb.oseminar.controller;

import java.util.ArrayList;
import java.util.List;

import ru.gb.oseminar.data.Figure;
//import ru.gb.oseminar.data.ILengthable;
import ru.gb.oseminar.data.IPerimeterable;
import ru.gb.oseminar.service.RepositoryFigures;
import ru.gb.oseminar.view.FigureView;

public class Controller {

    RepositoryFigures rf = new RepositoryFigures();
    FigureView fv = new FigureView();

    public void addFigureToList(Figure figure) {
        rf.add(figure);
    }
    
    public void showAllFigures() {
        List<Figure> listF = rf.getFigureList();
        fv.sendOnConsole(listF);
    }

    public List<Double> getAllAreas() {
        List<Double> listAreas = new ArrayList<>();
        List<Figure> listF = rf.getFigureList();
        for (Figure item: listF) {
            listAreas.add(item.area());
        }
        return listAreas;
    }

    public void showParamList(String msg, List<Double> listParam) {
        fv.sendParamOnConsole(msg, listParam);
    }

    public List<Double> getAllPerimetrs() {
        List<Double> listP = new ArrayList<>();
        List<Figure> listF = rf.getFigureList();
        for (Figure figure: listF) {
            if(figure instanceof IPerimeterable) {
                Double per = ((IPerimeterable) figure).perimetr();
                listP.add(per);
            }
            // if(figure instanceof ILengthable) {
            //     Double l = ((ILengthable) figure).length();
            //     listP.add(l);
            // }
        }
        return listP;
    }
}
