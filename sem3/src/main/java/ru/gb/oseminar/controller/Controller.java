package ru.gb.oseminar.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyingGroup;
import ru.gb.oseminar.data.StudyingGroupComparator;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.StudyingGroupService;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.service.UsersService;
import ru.gb.oseminar.view.StudyingGroupView;
import ru.gb.oseminar.view.TeacherView;
import ru.gb.oseminar.view.UserView;

public class Controller {
    
    private final UsersService userService = new UsersService();
    private final UserView userView = new UserView();
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    private final StudyingGroupService studyingGroupService = new StudyingGroupService();
    private final StudyingGroupView studyingGroupView = new StudyingGroupView();

    public void createUser(String firstName, String lastName, String patronimyc) {
        userService.createUser(firstName, lastName, patronimyc);
    }

    public void createTeacher(String firstName, String lastName, String patronymic) {
        teacherService.createTeacher(firstName, lastName, patronymic);
    }
    
    public Teacher getTeacher() {
        return teacherService.getTeacher();
    }

    public List<Student> getStudentsList() {
        return userService.getAllStud();
    }

    public void showStudList(List<Student> stud) {
        userView.sendOnControllerSTD(stud);
    }

    public List<Student> getListOfAllStud() {
        return userService.getAllStudentsOfUSerList();
    }

    public List<Teacher> getListOfAllTeachers() {
        return teacherService.getAllTeachers();
    }

    public void showTeacherList(List<Teacher> teachers) {
        teacherView.sendOnController(teachers);
    }

    public List<StudyingGroup> getStudyingGroup() {
        return studyingGroupService.getAllStGr();
    }

    public void showStudyingGroup(List<StudyingGroup> studyingGroups) {
        studyingGroupView.sendOnController(studyingGroupService.getAllStGr());
    }

    public void createStudyingGroups() {
        studyingGroupService.createStudyingGroups(teacherService.getTeacher(), userService.getAllStud());
        studyingGroupService.setGroupID(studyingGroupService.getAllStGr());
        userService.clearStudList(userService.getAllStud());
    }

    public void showSortStudyingGroup(List<StudyingGroup> studyingGroups) {
        List<Student> sortListWithGroup = new ArrayList<>();
        for(StudyingGroup studGrop: studyingGroups) {
            for(Student stud: studGrop.getStudentsList()) {
                sortListWithGroup.add(stud);
            }
        }
        Collections.sort(sortListWithGroup, new StudyingGroupComparator());
        userView.sendOnControllerSTD(sortListWithGroup);
    }

    public List<User> getUserList() {
        return userService.getAll();
    }

    public void showUserList(List<User> users) {
        userView.sendOnController(users);
    }

    public void showSortStudents(List<Student> students) {
        Collections.sort(students, new StudyingGroupComparator());
        userView.sendOnControllerSTD(students);
    }
}
