package ru.gb.oseminar.view;

import java.util.List;
import java.util.logging.Logger;
import ru.gb.oseminar.data.User;

public class UserView {

    public void sendOnController(List<User> users) {
        Logger log = Logger.getAnonymousLogger();
        for(User user: users) {
            log.info(user.toString());
        }
    }
}
