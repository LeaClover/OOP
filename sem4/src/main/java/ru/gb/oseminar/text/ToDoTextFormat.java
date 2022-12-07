package ru.gb.oseminar.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.gb.oseminar.data.ToDo;
import ru.gb.oseminar.data.ToDoLow;
import ru.gb.oseminar.data.ToDoMedium;
import ru.gb.oseminar.data.ToDoUrgent;

public class ToDoTextFormat {

    public String getStringCSV(List<ToDo> list) {
        StringBuilder sb = new StringBuilder();
        for(ToDo toDo: list) {
            if(toDo instanceof ToDoLow) {
                sb.append(((ToDoLow) toDo).getStatusLow().toString() + ";");
            }
            if(toDo instanceof ToDoMedium) {
                sb.append(((ToDoMedium) toDo).getStatusMedium().toString() + ";");
            }
            if(toDo instanceof ToDoUrgent) {
                sb.append(((ToDoUrgent) toDo).getStatusUrgent().toString() + ";");
            }
            sb.append(toDo.getToDoName().toString() + ";");
            sb.append(toDo.getToDoDate().toString() + ";");
            sb.append(toDo.getToDoTime().toString() + ";");
            sb.append(toDo.getToDoDateDeadLine().toString() + ";");
            sb.append(toDo.getToDoTimeDeadLine().toString() + ";");
            sb.append(toDo.getToDoAuthor().toString() + ";");
            sb.append("\n");
        }
        String str = sb.toString();
        return str;
    } 

    public List<ToDo> getListToDoFromCSV(List<String> list) {
        List <ToDo> toDoList = new ArrayList<>();
        Long id = 0L;
        for(String str: list) {
            List<String> prom = Arrays.asList(str.split(";"));
            int count = 0;
            while(count < 1) {
                if(prom.get(0).equalsIgnoreCase("LOW")) {
                    for(ToDo toDo: toDoList) {
                        if(toDo instanceof ToDoLow) {
                            if(id < ((ToDoLow) toDo).getLowID()) {
                                id = ((ToDoLow) toDo).getLowID();
                            }
                        }
                    }
                    ToDoLow low = new ToDoLow(++id, prom.get(2), prom.get(3), 
                    prom.get(4), prom.get(5), prom.get(6), prom.get(1));
                    toDoList.add(low); 
                }
                if(prom.get(0).equalsIgnoreCase("MEDIUM")) {
                    for(ToDo toDo: toDoList) {
                        if(toDo instanceof ToDoMedium) {
                            if(id < ((ToDoMedium) toDo).getMediumID()) {
                                id = ((ToDoMedium) toDo).getMediumID();
                            }
                        }
                    }
                    ToDoMedium med = new ToDoMedium(++id, prom.get(2), prom.get(3), 
                    prom.get(4), prom.get(5), prom.get(6), prom.get(1));
                    toDoList.add(med);
                }
                if(prom.get(0).equalsIgnoreCase("ALARM")) {
                    for(ToDo toDo: toDoList) {
                        if(toDo instanceof ToDoUrgent) {
                            if(id < ((ToDoUrgent) toDo).getUrgentID()) {
                                id = ((ToDoUrgent) toDo).getUrgentID();
                            }
                        }
                    }
                    ToDoUrgent urg = new ToDoUrgent(++id, prom.get(2), prom.get(3), 
                    prom.get(4), prom.get(5), prom.get(6), prom.get(1));
                    toDoList.add(urg);
                }
                count++;
            }
        }
        return toDoList;
    } 
}
