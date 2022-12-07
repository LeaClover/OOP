package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;
import ru.gb.oseminar.data.ToDo;

public class Main {
    public static <T extends ToDo> void main(String[] args ) throws Exception {
        
        Controller<T> contr = new Controller<>();
        contr.createToDoLow("16.12.2022", "11:30", "10.02.2022", "11:30", "РРР", "ДЕЛАТЬ!111");
        contr.createToDoMedium("06.12.2021", "17:30", "30.12.2022", "01:30", "РРР", "ДЕЛАТЬ!222");
        contr.createToDoUrgent("11.11.2022", "18:30", "11.02.2023", "12:30", "РРР", "ДЕЛАТЬ!333");
        contr.createToDoLow("06.01.2021", "15:30", "21.12.2022", "15:30", "РРР", "ДЕЛАТЬ!444");
        contr.createToDoMedium("01.12.2022", "01:30", "11.01.2023", "17:30", "РРР", "ДЕЛАТЬ!55");
        contr.createToDoMedium("05.10.2022", "19:30", "31.12.2022", "21:30", "РРР", "ДЕЛАТЬ!6");
        contr.createToDoGroup(contr.getLowToDoLIst(), contr.getMedToDoLIst(), contr.getUrgentToDoLIst());
        contr.writeFile(contr.getToDoGroup());
        contr.readFile();
    }
}
