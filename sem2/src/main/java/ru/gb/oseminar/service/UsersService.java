package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.List;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.User;

public class UsersService implements DataService {

    final List<User> users;
    final List<Student> students;

    public UsersService() {
        this.users = new ArrayList<User>();
        this.students = new ArrayList<Student>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        Long id = 0L;
        for(User item: this.users) {
            if(item instanceof Student) {
                if(id < ((Student) item).getStudentID()) {
                    id = ((Student) item).getStudentID();
                }
            }
        }
        this.users.add(new Student(++id, firstName, lastName, patronymic));
    }

    @Override
    public List<User> getAll() {
        return this.users;
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
