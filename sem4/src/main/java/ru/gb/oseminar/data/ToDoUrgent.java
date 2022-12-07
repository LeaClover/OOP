package ru.gb.oseminar.data;

public class ToDoUrgent extends ToDo{

    protected final String statusUrgent;
    protected Long urgentID;

    public ToDoUrgent(Long urgentID, String toDoDate, String toDoTime, String toDoDateDeadLine, String toDoTimeDeadLine,
    String toDoAuthor, String toDoName) {
        super(toDoDate, toDoTime, toDoDateDeadLine, toDoTimeDeadLine, toDoAuthor, toDoName);
        this.urgentID = urgentID;
        this.statusUrgent = "ALARM";
    }

    public String getStatusUrgent() {
        return statusUrgent;
    }

    public Long getUrgentID() {
        return urgentID;
    }

    public void setUrgentID(Long urgentID) {
        this.urgentID = urgentID;
    }

    @Override
    public String toString() {
        return "ID(" + urgentID + ") - " + statusUrgent + " - " + super.toString();
    }
}
