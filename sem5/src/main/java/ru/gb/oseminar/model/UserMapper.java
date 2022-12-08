package ru.gb.oseminar.model;

public class UserMapper {
    
    public String map(User user) {
        return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(",");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }

    public String mapXML(User user) {
        return String.format("<phonebook>\n\t<user>\n\t\t<id>%s</id>\n\t\t<first name>%s</first name>\n\t\t<last name>%S</last name>\n\t\t<phone>%s</phone>\n\t</user>\n</phonebook>",
        user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User mapXML(String line) {
        String str = line.replaceAll("<phonebook>\n\t", "").replaceAll("\n</phonebook>", "").replaceAll("<user>", "").replaceAll("\n</user>", "");
        String[] lines = str.split("\n\t\t");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
