package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Jhon", "Jhonson", (byte) 43);
        userService.saveUser("Mia", "Bush", (byte) 23);
        userService.saveUser("Vladimir", "Lukashenko", (byte) 69);
        userService.saveUser("Bob", "Snader", (byte) 13);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}