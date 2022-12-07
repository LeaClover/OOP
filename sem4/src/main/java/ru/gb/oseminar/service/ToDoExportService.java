package ru.gb.oseminar.service;

import java.io.FileWriter;

public class ToDoExportService {
    
    public void exportToCSV(String text) throws Exception {
        FileWriter file = new FileWriter("C:/OOP/sem4/src/main/java/ru/gb/oseminar/text/ToDoListSAVE.csv");
        file.write(text);
        file.close();
    }
}
