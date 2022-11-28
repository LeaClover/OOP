package ru.gb.oseminar.data;

public class Teacher extends User{

    private Long teacherID;

    public Teacher(Long teacherID, String firstName, String lastName, String patronymic) {
        super(firstName, lastName, patronymic);
        this.teacherID = teacherID;
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return teacherID + " - " + super.toString();
    }
}
