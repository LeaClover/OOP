package ru.gb.oseminar.view;

import java.util.List;
import java.util.logging.Logger;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudentType;
import ru.gb.oseminar.service.HighService;
import ru.gb.oseminar.service.MiddleService;
import ru.gb.oseminar.service.SmallService;

public class StudentView {

    private HighService hs = new HighService();
    private MiddleService ms = new MiddleService();
    private SmallService ss = new SmallService();

    public void sendOnConsole(List<Student> studentList) {
        Logger log = Logger.getAnonymousLogger();
        for(Student student: studentList) {
            StudentType type = student.getType();
            switch (type) {
                case HIGH:
                    log.info(student.toString());
                    hs.study();;
                    hs.smoke();
                    hs.prepareToExam();
                    hs.getLove();
                    break;
                case MIDDLE:
                    log.info(student.toString());
                    ms.study();;
                    ms.smoke();
                    ms.leaveSchool();
                    break;
                case SMALL:
                    log.info(student.toString());
                    ss.study();
                    ss.cry();
                    break;
            }
        }
    }  
}
