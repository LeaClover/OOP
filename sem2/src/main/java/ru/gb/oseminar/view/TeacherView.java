package ru.gb.oseminar.view;

import java.util.List;
import java.util.logging.Logger;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

public class TeacherView {

    public void sendOnController(List<User> users) {
        Logger log = Logger.getAnonymousLogger();
        for(User user: users) {
            if(user instanceof Teacher) {
                log.info(user.toString());
            }
        }
    }
}
