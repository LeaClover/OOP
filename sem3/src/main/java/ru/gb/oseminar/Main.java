package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;

public class Main {

    public static void main(String[] args) {
        Controller contr = new Controller();
        contr.createTeacher("Ivan", "Ivanov", "Ivanovich");
        contr.createUser("Olesya", "Rakhmanina", "Dmitrievna");
        contr.createUser("Alex", "Alexanrov", "Igorevich");
        contr.createUser("Egor", "Habarov", "Antonovich");
        contr.createStudyingGroups();
        
        contr.createTeacher("Petr", "Petrov", "Petrovich");
        contr.createUser("Karina", "Rakhmanina", "Dmitrievna");
        contr.createUser("Evgeniy", "Alexanrov", "Igorevich");
        contr.createUser("Anna", "Habarova", "Antonovna");
        contr.createStudyingGroups();
        
        contr.createTeacher("Semen", "Semenov", "Semenovich");
        contr.createUser("Anna", "Rakhmanina", "Dmitrievna");
        contr.createUser("Kristina", "Alexanrova", "Evgenevna");
        contr.createUser("Vladislav", "Rakhmanin", "Aleksandrov");
        contr.createStudyingGroups();

        contr.showStudyingGroup(contr.getStudyingGroup());
        contr.showSortStudyingGroup(contr.getStudyingGroup());
    }   
}
