package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.List;
import ru.gb.oseminar.data.ToDo;
import ru.gb.oseminar.data.ToDoMedium;

public class ToDoMediumService implements ToDoDataService<ToDo> {

    protected List <ToDoMedium> toDoMedList;

    public ToDoMediumService() {
        this.toDoMedList = new ArrayList<>();
    }

    @Override
    public void createToDo(String toDoDate, String toDoTime, String toDoDateDeadLine, String toDoTimeDeadLine,
            String toDoAuthor, String toDoName) {
        Long medID = 0L; 
            for(ToDoMedium toDo: toDoMedList) {
                if(medID < ((ToDoMedium) toDo).getMediumID()) {
                    medID = ((ToDoMedium) toDo).getMediumID();
                }
            }
        ToDoMedium med = new ToDoMedium(++medID, toDoDate, toDoTime, toDoDateDeadLine, toDoTimeDeadLine, toDoAuthor, toDoName);
        this.toDoMedList.add(med);
    }

    public List<ToDoMedium> getMediumList() {
        return this.toDoMedList;
    }
}
