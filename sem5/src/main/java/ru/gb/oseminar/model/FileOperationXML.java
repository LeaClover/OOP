package ru.gb.oseminar.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperationXML extends FileOperationImpl {

    public FileOperationXML(String fileName) {
        super(fileName);
    }

    @Override
    public List<String> readAllLines() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();
            while(line != null) {
                if (line == "<phonebook>" || line == "\t<user>" || line == "\t</user>") {
                    line = reader.readLine();
                }
                if (line == "</phonebook>") {
                    lines.add(sb.toString());
                    sb.delete(0, sb.length());
                }
                else {
                    sb.append(line);
                }
            
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    @Override
    public void saveAllLines(List<String> lines) {
        super.saveAllLines(lines);
    }
}
