package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.List;
import ru.gb.oseminar.data.ToDo;
import ru.gb.oseminar.data.ToDoLow;

public class ToDoLowService implements ToDoDataService<ToDo> {

    protected List <ToDoLow> toDoLowList;

    public ToDoLowService() {
        this.toDoLowList = new ArrayList<>();
    }

    @Override
    public void createToDo(String toDoDate, String toDoTime, String toDoDateDeadLine, 
        String toDoTimeDeadLine, String toDoAuthor, String toDoName) {
        Long lowID = 0L; 
            for(ToDoLow toDo: toDoLowList) {
                if(lowID < ((ToDoLow) toDo).getLowID()) {
                    lowID = ((ToDoLow) toDo).getLowID();
                }
            }
        ToDoLow low = new ToDoLow(++lowID, toDoDate, toDoTime, toDoDateDeadLine, toDoTimeDeadLine, toDoAuthor, toDoName);
        this.toDoLowList.add(low);
    }

    // @Override
    // public void deleteToDo(T param) {
    //     super.deleteToDo(param);
    // }

    public List<ToDoLow> getLowList() {
        return this.toDoLowList;
    }
}
