package ru.gb.oseminar.controller;

import java.util.List;
import ru.gb.oseminar.model.Repository;
import ru.gb.oseminar.model.User;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        validateUserDate(user);
        repository.createUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("User not found");
    }

    public List<User> readUsers() {
        return repository.getAllUsers();
    }

    private void validateUserDate(User user) {
        if(user.getFirstName().isEmpty()) {
            throw new IllegalStateException("FirstName not found");
        }
        if(user.getLastName().isEmpty()) {
            throw new IllegalStateException("LastName not found");
        }
        if(user.getPhone().isEmpty()) {
            throw new IllegalStateException("Phone not found");
        }
    }

    public void editUser(User user) {
        validateUserDate(user);
        repository.updateUser(user);
    }

    public void deleteUser(String userID) {
        repository.deleteUser(userID);
    }
}
