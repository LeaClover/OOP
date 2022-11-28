package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

public class TeacherService extends UsersService{

    private Teacher teacher;
    public TeacherService() {
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
        this.users.add(this.teacher);
    }

    public void deleteTeacher(Long id) {
        super.deleteUser(id);
        for(User item: users) {
            if(item instanceof Teacher) {
                if(id.equals(((Teacher) item).getTeacherID())) {
                    this.users.remove(item);
                }
            }
        }
    }
}
