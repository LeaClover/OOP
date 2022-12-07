package ru.gb.oseminar.data;

public class ToDoMedium extends ToDo{

    protected final String statusMedium;
    protected Long mediumID;
    
    public ToDoMedium(Long mediumID, String toDoDate, String toDoTime, String toDoDateDeadLine, String toDoTimeDeadLine,
    String toDoAuthor, String toDoName) {
        super(toDoDate, toDoTime, toDoDateDeadLine, toDoTimeDeadLine, toDoAuthor, toDoName);
        this.mediumID = mediumID;
        this.statusMedium = "MEDIUM";
    }

    public String getStatusMedium() {
        return statusMedium;
    }

    public Long getMediumID() {
        return mediumID;
    }

    public void setMediumID(Long mediumID) {
        this.mediumID = mediumID;
    }

    @Override
    public String toString() {
        return "ID(" + mediumID + ") - " + statusMedium + " - " + super.toString();
    }
}
