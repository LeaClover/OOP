package ru.gb.oseminar.service;

import ru.gb.oseminar.interfaces.IStudy;

public class SmallService implements IStudy {

    @Override
    public void study() {
        System.out.println("Я люблю учиться");
    }
    
    public void cry() {
        System.out.println("Хочу домой к маме!");
    }
}
