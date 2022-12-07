package ru.gb.oseminar.data;

public class ToDoLow extends ToDo{

    private final String statusLow = "LOW";;
    private Long lowID;

    public ToDoLow(Long lowID, String toDoDate, String toDoTime, String toDoDateDeadLine, String toDoTimeDeadLine,
            String toDoAuthor, String toDoName) {
        super(toDoDate, toDoTime, toDoDateDeadLine, toDoTimeDeadLine, toDoAuthor, toDoName);
        this.lowID = lowID;
    }

    public String getStatusLow() {
        return statusLow;
    }

    public Long getLowID() {
        return lowID;
    }

    public void setLowID(Long lowID) {
        this.lowID = lowID;
    }

    @Override
    public String toString() {
        return "ID(" + lowID + ") - " + statusLow + " - " + super.toString();
    }
}
