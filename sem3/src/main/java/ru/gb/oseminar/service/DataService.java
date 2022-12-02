package ru.gb.oseminar.service;

import java.util.List;
import ru.gb.oseminar.data.User;

public interface DataService {

    void createUser(String firstName, String lastName, String patronymic);
    List<User> getAll();
    void deleteUser(Long id);
}
