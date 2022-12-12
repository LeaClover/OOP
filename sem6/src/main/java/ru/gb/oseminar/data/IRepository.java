package ru.gb.oseminar.data;

public abstract interface IRepository <T extends Figure> {
    
    public void add(T value);
}
