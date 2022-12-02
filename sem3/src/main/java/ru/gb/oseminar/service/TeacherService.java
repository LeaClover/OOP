package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.List;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

public class TeacherService extends UsersService{

    protected Teacher teacher;
    protected List<User> users;

    public TeacherService() {
        this.teacher = super.teacher;
        this.users = super.users;
    }

    public void createTeacher(String firstName, String lastName, String patronymic) {
        super.createUser(firstName, lastName, patronymic);
        Long id = 0L;
        for(User item: this.users) {
            if(item instanceof Teacher) {
                if(id < ((Teacher) item).getTeacherID()) {
                    id = ((Teacher) item).getTeacherID();
                }
            }
        }
        this.teacher = new Teacher(++id, firstName, lastName, patronymic);
        super.users.add(this.teacher);
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> teacherList = new ArrayList<>();
        for(User user: super.users) {
            if(user instanceof Teacher) {
                teacherList.add((Teacher)user);
            }
        }
        return teacherList;
    }

    public void deleteTeacher(Long id) {
        super.deleteUser(id);
        for(User item: super.users) {
            if(item instanceof Teacher) {
                if(id.equals(((Teacher) item).getTeacherID())) {
                    super.users.remove(item);
                }
            }
        }
    }
}
