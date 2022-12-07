package ru.gb.oseminar.controller;

import java.util.Collections;
import java.util.List;
import ru.gb.oseminar.data.ToDo;
import ru.gb.oseminar.data.ToDoComparator;
import ru.gb.oseminar.data.ToDoGroup;
import ru.gb.oseminar.data.ToDoLow;
import ru.gb.oseminar.data.ToDoMedium;
import ru.gb.oseminar.data.ToDoUrgent;
import ru.gb.oseminar.service.ToDoExportService;
import ru.gb.oseminar.service.ToDoGroupService;
import ru.gb.oseminar.service.ToDoImportService;
import ru.gb.oseminar.service.ToDoLowService;
import ru.gb.oseminar.service.ToDoMediumService;
import ru.gb.oseminar.service.ToDoUrgentService;
import ru.gb.oseminar.text.ToDoTextFormat;
import ru.gb.oseminar.view.ToDoView;

public class Controller <T extends ToDo> {
    
    private ToDoView<T> toDoView = new ToDoView<>();
    private ToDoLowService toDoLowService = new ToDoLowService();
    private ToDoMediumService toDoMediumService = new ToDoMediumService();
    private ToDoUrgentService toDoUrgentService = new ToDoUrgentService();
    private ToDoGroupService<T> toDoGroupService = new ToDoGroupService<>();
    private ToDoImportService toDoImportService = new ToDoImportService();
    private ToDoTextFormat toDoTextFormat = new ToDoTextFormat();
    private ToDoExportService toDoExportService = new ToDoExportService();

    public void createToDoLow(String toDoDate, String toDoTime, String toDoDateDeadLine, String toDoTimeDeadLine,
    String toDoAuthor, String toDoName) {
        toDoLowService.createToDo(toDoDate, toDoTime, toDoDateDeadLine, toDoTimeDeadLine, toDoAuthor, toDoName);
    }

    public void createToDoMedium(String toDoDate, String toDoTime, String toDoDateDeadLine, String toDoTimeDeadLine,
    String toDoAuthor, String toDoName) {
        toDoMediumService.createToDo(toDoDate, toDoTime, toDoDateDeadLine, toDoTimeDeadLine, toDoAuthor, toDoName);
    }

    public void createToDoUrgent(String toDoDate, String toDoTime, String toDoDateDeadLine, String toDoTimeDeadLine,
    String toDoAuthor, String toDoName) {
        toDoUrgentService.createToDo(toDoDate, toDoTime, toDoDateDeadLine, toDoTimeDeadLine, toDoAuthor, toDoName);
    }

    public void createToDoGroup(List<ToDoLow> lowList, List<ToDoMedium> medList, List<ToDoUrgent> urgList) {
        toDoGroupService.createToDoListAll(lowList, medList, urgList);
        List<ToDo> toDoList = toDoGroupService.getAll();
        Collections.sort(toDoList, new ToDoComparator());
        toDoView.sendOnControllerToDo(toDoList);
    }

    public void showToDoList(List<T> toDoList) {
        toDoView.sendOnController(toDoList);
    }
    
    public List<ToDoLow> getLowToDoLIst() {
        return toDoLowService.getLowList();
    }

    public List<ToDoMedium> getMedToDoLIst() {
        return toDoMediumService.getMediumList();
    }

    public List<ToDoUrgent> getUrgentToDoLIst() {
        return toDoUrgentService.getUrgentList();
    }

    public List<ToDo> getToDoGroup() {
        return toDoGroupService.getAll();
    }

    public ToDoGroup getGroupToDo() {
        return toDoGroupService.getToDoGroup();
    }

    public void writeFile(List<ToDo> list) throws Exception{
        toDoExportService.exportToCSV(toDoTextFormat.getStringCSV(list));   
    }

    public void readFile() throws Exception {
        List<ToDo> toDo = toDoTextFormat.getListToDoFromCSV(toDoImportService.importFromCSV());
        Collections.sort(toDo, new ToDoComparator());
        toDoView.sendOnControllerToDo(toDo);
    }

    // public List<ToDo> getToDoList(List<ToDoLow> lowList, List<ToDoMedium> medList, List<ToDoUrgent> urgList) {
    //     return toDoService.getToDoList();
    // }

    // public void showLowList(List <ToDoLow> lowList) {
    //     toDoView.sendOnController(lowList);
    // }
}
