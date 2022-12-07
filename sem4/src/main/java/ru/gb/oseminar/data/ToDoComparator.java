package ru.gb.oseminar.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;

public class ToDoComparator implements Comparator<ToDo> {
    
    @Override
    public int compare(ToDo toDo1, ToDo toDo2) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        DateFormat tm = new SimpleDateFormat("hh:mm");
        try {
            if(df.parse(toDo1.getToDoDateDeadLine()).equals(df.parse(toDo2.getToDoDateDeadLine()))) {
                return tm.parse(toDo1.getToDoTimeDeadLine()).compareTo(tm.parse(toDo2.getToDoTimeDeadLine()));
            }
            return df.parse(toDo1.getToDoDateDeadLine()).compareTo(df.parse(toDo2.getToDoDateDeadLine()));

        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
