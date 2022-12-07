package ru.gb.oseminar.data;

public class ToDo {
    
    private String toDoDate;
    private String toDoTime;
    private String toDoDateDeadLine;
    private String toDoTimeDeadLine;
    private String toDoAuthor;
    private String toDoName;

    public ToDo(String toDoDate, String toDoTime, String toDoDateDeadLine, String toDoTimeDeadLine,
            String toDoAuthor, String toDoName) {
        this.toDoDate = toDoDate;
        this.toDoTime = toDoTime;
        this.toDoDateDeadLine = toDoDateDeadLine;
        this.toDoTimeDeadLine = toDoTimeDeadLine;
        this.toDoAuthor = toDoAuthor;
        this.toDoName = toDoName;
    }

    public String getToDoTime() {
        return toDoTime;
    }

    public void setToDoTime(String toDoTime) {
        this.toDoTime = toDoTime;
    }

    public String getToDoDate() {
        return toDoDate;
    }

    public void setToDoDate(String toDoDate) {
        this.toDoDate = toDoDate;
    }

    public String getToDoDateDeadLine() {
        return toDoDateDeadLine;
    }

    public void setToDoDateDeadLine(String toDoDateDeadLine) {
        this.toDoDateDeadLine = toDoDateDeadLine;
    }

    public String getToDoTimeDeadLine() {
        return toDoTimeDeadLine;
    }

    public void setToDoTimeDeadLine(String toDoTimeDeadLine) {
        this.toDoTimeDeadLine = toDoTimeDeadLine;
    }

    public String getToDoAuthor() {
        return toDoAuthor;
    }

    public void setToDoAuthor(String toDoAuthor) {
        this.toDoAuthor = toDoAuthor;
    }

    public String getToDoName() {
        return toDoName;
    }

    public void setToDoName(String toDoName) {
        this.toDoName = toDoName;
    }

    @Override
    public String toString() {
        return " " + toDoName + " - Создана: " + toDoDate + " " + toDoTime + " - Дедлайн: " 
        + toDoDateDeadLine + " " + toDoTimeDeadLine + " - Автор: " + toDoAuthor;
    }
}
