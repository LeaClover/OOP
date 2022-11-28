package ru.gb.oseminar.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;

public class StudyingGroupService {

    final Map<Teacher, List<Student>> studyingGroup;

    public StudyingGroupService() {
        this.studyingGroup = new HashMap<>();
    }
    
    public Map<Teacher, List<Student>> createStudyingGroup(Teacher teacher, List<Student> students) {
        this.studyingGroup.put(teacher, students);
        return studyingGroup;
    }
}
