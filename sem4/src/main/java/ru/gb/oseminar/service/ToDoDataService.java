package ru.gb.oseminar.service;

import ru.gb.oseminar.data.ToDo;

public abstract interface ToDoDataService <T extends ToDo> {

    void createToDo(String toDoDate, String toDoTime, String toDoDateDeadLine, String toDoTimeDeadLine,
    String toDoAuthor, String toDoName);
    // void deleteToDo(T param);
}
