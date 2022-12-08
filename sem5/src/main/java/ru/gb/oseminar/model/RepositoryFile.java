package ru.gb.oseminar.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private UserMapper mapper = new UserMapper();
    protected FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String createUser(User user) {
        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        saveUser(user, users);
        return id;
    }

    @Override
    public void updateUser(User user) {
        deleteUser(user.getId());
        List<User> users = getAllUsers();
        saveUser(user, users);
    }

    @Override
    public void deleteUser(String userID) {
        List<User> userList = getAllUsers();
        try {
            userList.remove(findUser(userID, userList));
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Not found!");
        }
        saveUsers(userList);
    }

    private User findUser(String userID, List<User> userList) {
        for (User user : userList) {
            if (user.getId().equals(userID)) {
                return user;
            }
        }
        throw new IllegalStateException("User not found!");
    }

    private void saveUser(User user, List<User> users) {
        users.add(user);
        saveUsers(users);
    }

    protected void saveUsers(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }
}
