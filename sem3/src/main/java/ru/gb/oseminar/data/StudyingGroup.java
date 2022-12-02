package ru.gb.oseminar.data;

import java.util.List;

public abstract class StudyingGroup {
    
    private Long studyingGroupID;
    private Teacher teacher;
    private List<Student> studentsList;
    
    public StudyingGroup(Long studyingGroupID, Teacher teacher, List<Student> studentsList) {
        this.studyingGroupID = studyingGroupID;
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    public Long getStudyingGroupID() {
        return studyingGroupID;
    }

    public void setStudyingGroupID(Long studyingGroupID) {
        this.studyingGroupID = studyingGroupID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "\n\nУчебная группа № " + studyingGroupID + ", Преподаватель - (id)" + teacher + "\nСписок студентов: \n";
    }
}
