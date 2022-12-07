package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.List;
import ru.gb.oseminar.data.ToDo;
import ru.gb.oseminar.data.ToDoUrgent;

public class ToDoUrgentService implements ToDoDataService<ToDo> {

    protected List <ToDoUrgent> toDoUrgList;

    public ToDoUrgentService() {
        this.toDoUrgList = new ArrayList<>();
    }

    @Override
    public void createToDo(String toDoDate, String toDoTime, String toDoDateDeadLine, String toDoTimeDeadLine,
            String toDoAuthor, String toDoName) {
        Long urgID = 0L; 
            for(ToDoUrgent toDo: toDoUrgList) {
                if(urgID < ((ToDoUrgent) toDo).getUrgentID()) {
                    urgID = ((ToDoUrgent) toDo).getUrgentID();
                }
            }
        ToDoUrgent urg = new ToDoUrgent(++urgID, toDoDate, toDoTime, toDoDateDeadLine, toDoTimeDeadLine, toDoAuthor, toDoName);
        this.toDoUrgList.add(urg);
    }

    public List<ToDoUrgent> getUrgentList() {
        return this.toDoUrgList;
    }
}
