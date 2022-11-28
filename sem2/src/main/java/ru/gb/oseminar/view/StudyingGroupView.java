package ru.gb.oseminar.view;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;

public class StudyingGroupView {
    
    public void sendOnController(Map<Teacher, List<Student>>studyingGroup) {
        Logger log = Logger.getAnonymousLogger();
        for(Teacher teacher: studyingGroup.keySet()) {
            log.info(String.format("Учебная группа №__, Преподаватель: %s. \n\nСписок студентов: \n", teacher.toString()));
            for(Student student: studyingGroup.get(teacher)) {
                log.info(String.format("%s", student.toString()));
            }
        }
    }
}
