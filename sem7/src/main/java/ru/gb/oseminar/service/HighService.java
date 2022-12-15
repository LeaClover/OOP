package ru.gb.oseminar.service;

import ru.gb.oseminar.interfaces.ISmoke;
import ru.gb.oseminar.interfaces.IStudy;

public class HighService implements ISmoke, IStudy{

    @Override
    public void study() {
        System.out.println("Я должен учиться");
    }

    @Override
    public void smoke() {
        System.out.println("Я бросаю курить");
    }
    
    public void prepareToExam() {
        System.out.println("Я готовлюсь к экзаменам");
    }

    public void getLove() {
        System.out.println("У меня отношения!");
    }
}
