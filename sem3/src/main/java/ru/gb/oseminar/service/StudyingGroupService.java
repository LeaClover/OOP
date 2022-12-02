package ru.gb.oseminar.service;

import java.util.ArrayList;
import java.util.List;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyingGroup;
import ru.gb.oseminar.data.Teacher;

public class StudyingGroupService extends UsersService {

    private final List<StudyingGroup> studyingGroup;
    List<Student> students;
    Teacher teacher;

    public StudyingGroupService() {
        this.studyingGroup = new ArrayList<StudyingGroup>();
    }

    public void createStudyingGroups(Teacher teacher, List<Student> students) {
        Long id = 0L;
        for(StudyingGroup item: studyingGroup) {
            if(id < ((StudyingGroup) item).getStudyingGroupID()) {
                id = ((StudyingGroup) item).getStudyingGroupID();
            }
        }
        List<Student> st = new ArrayList<>(students);
        studyingGroup.add(new StudyingGroup(++id, teacher, st) {
        });
    }

    public void setGroupID(List<StudyingGroup> studGroupList) {
        for (StudyingGroup studGroup: studGroupList) {
            Long id = studGroup.getStudyingGroupID();
            for(Student stud: studGroup.getStudentsList()) {
                stud.setGroupID(id);
            }
        }
    }

    public List<StudyingGroup> getAllStGr() {
        return this.studyingGroup;
    }
}
