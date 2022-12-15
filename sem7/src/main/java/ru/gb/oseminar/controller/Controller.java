package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.service.StudentService;
import ru.gb.oseminar.view.StudentView;

public class Controller {

    private StudentService ss = new StudentService();
    private StudentView sv = new StudentView();

    public void addStudent(Student student) {
        ss.addStudent(student);
    }

    public void getAllStudents() {
        sv.sendOnConsole(ss.getAllStudents());
    }   
}
