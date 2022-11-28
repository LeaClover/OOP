package ru.gb.oseminar.data;

public class Student extends User{

    private Long studentID;

    public Student(Long studentID, String firstName, String lastName, String patronymic) {
        super(firstName, lastName, patronymic);
        this.studentID = studentID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return studentID + " - " + super.toString();
    }
}
