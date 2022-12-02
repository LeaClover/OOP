package ru.gb.oseminar.data;

public class Student extends User{

    private Long studentID;
    private Long groupID;

    public Student(Long studentID, String firstName, String lastName, String patronymic, Long groupID) {
        super(firstName, lastName, patronymic);
        this.studentID = studentID;
        this.groupID = groupID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    @Override
    public String toString() {
        return studentID + " - " + super.toString() + " - Группа - " + groupID;
    }
}
