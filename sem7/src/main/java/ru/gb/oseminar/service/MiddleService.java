package ru.gb.oseminar.service;

import ru.gb.oseminar.interfaces.ISmoke;
import ru.gb.oseminar.interfaces.IStudy;

public class MiddleService implements ISmoke, IStudy{

    @Override
    public void study() {
        System.out.println("Я ненавижу учиться");
    }

    @Override
    public void smoke() {
        System.out.println("Я начинаю курить");
    }
    
    public void leaveSchool() {
        System.out.println("Я прогулял урок");
    }
}
