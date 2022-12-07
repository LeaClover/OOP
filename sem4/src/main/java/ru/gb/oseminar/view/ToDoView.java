package ru.gb.oseminar.view;

import java.util.List;
import java.util.logging.Logger;
import ru.gb.oseminar.data.ToDo;

public class ToDoView <T extends ToDo> {
    
    public void sendOnController(List<T> toDoList) {
        Logger log = Logger.getAnonymousLogger();
        log.info("\nЕще список задач!!!: \n");
        for(T toDo: toDoList) {
            log.info(toDo.toString());
        }
    }

    public void sendOnControllerToDo(List<ToDo> toDoList) {
        Logger log = Logger.getAnonymousLogger();
        log.info("\nСписок задач: \n");
        for(ToDo toDo: toDoList) {
            log.info(toDo.toString());
        }
    }
}
