package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.List;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.interfaces.IStudentService;

public class StudentService implements IStudentService {

    private List<Student> studentList;
    
    public StudentService() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.studentList;
    }
    
}
