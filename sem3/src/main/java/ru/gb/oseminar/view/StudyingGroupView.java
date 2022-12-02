package ru.gb.oseminar.view;

import java.util.List;
import java.util.logging.Logger;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyingGroup;

public class StudyingGroupView {
    
    public void sendOnController(List<StudyingGroup> studyingGroup) {
        Logger log = Logger.getAnonymousLogger();
        for(StudyingGroup studGroup: studyingGroup) {
            log.info(studGroup.toString());
            for(Student item: studGroup.getStudentsList()) {
                log.info(item.toString());
            }
        }
    }
}
