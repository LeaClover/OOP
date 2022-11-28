package ru.gb.oseminar.data;

import java.util.ArrayList;
import java.util.List;

public abstract class StudyingGroup {
    
    private Teacher teacher;
    private List<Student> studentsList = new ArrayList<>();
    
    public StudyingGroup(Teacher teacher, List<Student> studentsList) {
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    public User getTeachUser() {
        return teacher;
    }

    public void setTeachUser(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }
}
