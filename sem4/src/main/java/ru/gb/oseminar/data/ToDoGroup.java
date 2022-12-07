package ru.gb.oseminar.data;

import java.util.List;

public class ToDoGroup {

    private List<ToDoLow> toDoLowLis;
    private List<ToDoMedium> toDoMedLis;
    private List<ToDoUrgent> toDoUrgLis;

    public ToDoGroup(List<ToDoLow> toDoLowLis, List<ToDoMedium> toDoMedLis, List<ToDoUrgent> toDoUrgLis) {
        this.toDoLowLis = toDoLowLis;
        this.toDoMedLis = toDoMedLis;
        this.toDoUrgLis = toDoUrgLis;
    }

    public List<ToDoLow> getToDoLowLis() {
        return toDoLowLis;
    }

    public void setToDoLowLis(List<ToDoLow> toDoLowLis) {
        this.toDoLowLis = toDoLowLis;
    }

    public List<ToDoMedium> getToDoMedLis() {
        return toDoMedLis;
    }

    public void setToDoMedLis(List<ToDoMedium> toDoMedLis) {
        this.toDoMedLis = toDoMedLis;
    }

    public List<ToDoUrgent> getToDoUrgLis() {
        return toDoUrgLis;
    }

    public void setToDoUrgLis(List<ToDoUrgent> toDoUrgLis) {
        this.toDoUrgLis = toDoUrgLis;
    }

    @Override
    public String toString() {
        return "ToDoGroup [toDoLowLis=" + toDoLowLis + ", toDoMedLis=" + toDoMedLis + ", toDoUrgLis=" + toDoUrgLis
                + "]";
    }
}
