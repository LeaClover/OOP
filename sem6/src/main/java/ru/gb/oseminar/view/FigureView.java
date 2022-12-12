package ru.gb.oseminar.view;

import java.util.List;
import java.util.logging.Logger;
import ru.gb.oseminar.data.Figure;

public class FigureView {

    public Logger log = Logger.getAnonymousLogger();
    
    public void sendOnConsole(List<Figure> listF) {
        for(Figure item: listF) {
            log.info(item.toString());
        }
    }

    public void sendParamOnConsole(String messege, List<Double> listParam) {
        log.info(messege + listParam.toString());
    }
}
