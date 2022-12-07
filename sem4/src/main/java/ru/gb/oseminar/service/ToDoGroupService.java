package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.List;

import ru.gb.oseminar.data.ToDo;
import ru.gb.oseminar.data.ToDoGroup;
import ru.gb.oseminar.data.ToDoLow;
import ru.gb.oseminar.data.ToDoMedium;
import ru.gb.oseminar.data.ToDoUrgent;

public class ToDoGroupService <T extends ToDo> {

    private ToDoGroup toDoGroup;

    public ToDoGroupService() {
    }

    public void createToDoListAll(List<ToDoLow> lowList, List<ToDoMedium> medList, List<ToDoUrgent> urgList) {
        this.toDoGroup = new ToDoGroup(lowList, medList, urgList);
    }

    public ToDoGroup getToDoGroup() {
        return this.toDoGroup;
    }

    public List<ToDo> getAll() {
        List<ToDo> allList = new ArrayList<>();
        for(ToDo toDoL: this.toDoGroup.getToDoLowLis()) {
            allList.add(toDoL);
        }
        for(ToDo toDoM: this.toDoGroup.getToDoMedLis()) {
            allList.add(toDoM);
        }
        for(ToDo toDoU: this.toDoGroup.getToDoUrgLis()) {
            allList.add(toDoU);
        }
        return allList;
    }
}
