package ru.gb.oseminar.controller;

import java.util.ArrayList;
import java.util.List;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.StudyingGroupService;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.service.UsersService;
import ru.gb.oseminar.view.StudyingGroupView;

public class Controller {
    
    private final UsersService userService = new UsersService();
    private final TeacherService teacherService = new TeacherService();
    private final StudyingGroupService studyingGroupService = new StudyingGroupService();
    private final StudyingGroupView studyingGroupView = new StudyingGroupView();

    public void createUser(String firstName, String lastName, String patronimyc) {
        userService.createUser(firstName, lastName, patronimyc);
    }

    public void createTeacher(String firstName, String lastName, String patronymic) {
        teacherService.createTeacher(firstName, lastName, patronymic);
    }

    public void createStudyingGroup(Teacher teacher, List<Student> students) {
        studyingGroupView.sendOnController(studyingGroupService.createStudyingGroup(teacher, students));
    }
    
    public Teacher getTeacher() {
        List<User> users = teacherService.getAll();
        for(User item: users) {
            if(item instanceof Teacher) {
                return (Teacher) item;
            }
        }
        throw new IllegalAccessError("Not found!");
    }

    public List<Student> getStudentsList() {
        List<User> users = userService.getAll();
        List<Student> stud = new ArrayList<>();
        for(User item: users) {
            if(item instanceof Student) {
                stud.add((Student)item);
            }
        }
        return stud;
    }
}
