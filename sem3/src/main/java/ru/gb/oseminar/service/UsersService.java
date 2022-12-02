package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.List;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

public class UsersService implements DataService {

    protected Teacher teacher;
    protected List<User> users;
    private List<Student> students;

    public UsersService() {
        this.users = new ArrayList<User>();
        this.students = new ArrayList<Student>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        Long id = 0L;
        Long groupID = null;
        for(User item: this.users) {
            if(item instanceof Student) {
                if(id < ((Student) item).getStudentID()) {
                    id = ((Student) item).getStudentID();
                }
            }
        }
        Student student = new Student(++id, firstName, lastName, patronymic, groupID);
        this.students.add(student);
        this.users.add(student);
    }

    public void createStudList(List<Student> st) {
        List<Student> stud = new ArrayList<>(st);
        this.students = stud;
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    public List<Student> getAllStud() {
        return this.students;
    }

    public List<Student> getAllStudentsOfUSerList() {
        List<Student> studList = new ArrayList<>();
        for(User user: this.users) {
            if(user instanceof Student) {
                studList.add((Student)user);
            }
        }
        return studList;
    }

    public List<Student> clearStudList(List<Student> students) {
        this.students.clear();
        return this.students;
    }

    public List<User> clearUserList() {
        this.users.clear();
        return users;
    }

    @Override
    public void deleteUser(Long id) {
        for(User item: users) {
            if(item instanceof Student) {
                if(id.equals(((Student) item).getStudentID())) {
                    this.users.remove(item);
                }
            }
        }
    }
}
