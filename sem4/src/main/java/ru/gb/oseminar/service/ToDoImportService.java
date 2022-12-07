package ru.gb.oseminar.service;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoImportService {

    public List<String> importFromCSV() throws Exception {
        List<String> list = new ArrayList<>();
        FileReader file = new FileReader("C:/OOP/sem4/src/main/java/ru/gb/oseminar/text/ToDoListLOAD.csv");
        Scanner sc = new Scanner(file);
        file.read();
        while(sc.hasNextLine()) {
            list.add(sc.nextLine());
        }
        file.close();
        sc.close();
        return list;
    }
}
