package ru.gb.oseminar.view;

import java.util.List;
import java.util.logging.Logger;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

public class UserView {

    public void sendOnController(List<User> users) {
        Logger log = Logger.getAnonymousLogger();
        for(User user: users) {
            if(user instanceof Teacher) {
                log.info("Преподаватель" + user.toString());
            }
            if(user instanceof Student) {
                log.info("Студент" + user.toString());
            }
        }
    }

    public void sendOnControllerSTD(List<Student> stud) {
        Logger log = Logger.getAnonymousLogger();
        log.info("\nСписок студентов:\n");
        for(Student st: stud) {
            log.info(st.toString());
        }
    }
}
