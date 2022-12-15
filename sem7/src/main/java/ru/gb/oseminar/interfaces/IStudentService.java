package ru.gb.oseminar.interfaces;

import java.util.List;
import ru.gb.oseminar.data.Student;

public abstract interface IStudentService {
    
    public void addStudent(Student student);
    public List<Student> getAllStudents();
}
