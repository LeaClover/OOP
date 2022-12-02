package ru.gb.oseminar.view;

import java.util.List;
import java.util.logging.Logger;
import ru.gb.oseminar.data.Teacher;

public class TeacherView {

    public void sendOnController(List<Teacher> teachers) {
        Logger log = Logger.getAnonymousLogger();
        for(Teacher item: teachers) {
            log.info(item.toString());
        }
    }
}
