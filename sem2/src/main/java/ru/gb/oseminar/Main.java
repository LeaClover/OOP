package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;

public class Main {

    public static void main(String[] args) {
        Controller contr = new Controller();
        contr.createTeacher("Ivan", "Ivanov", "Ivanovich");
        contr.createUser("Olesya", "Rakhmanina", "Dmitrievna");
        contr.createUser("Alex", "Alexanrov", "Igorevich");
        contr.createUser("Egor", "Habarov", "Antonovich");
        contr.getStudentsList();
        contr.createStudyingGroup(contr.getTeacher(), contr.getStudentsList());
    }   
}
