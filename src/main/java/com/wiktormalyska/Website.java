package com.wiktormalyska;


import com.wiktormalyska.database.DatabaseController;
import com.wiktormalyska.user.User;
import com.wiktormalyska.user.admin.Admin;
import com.wiktormalyska.user.customer.Customer;

import java.util.List;

public class Website {
    public static void main(String[] args) {
        User user = login("customer2", "customer");
    }

    public static void createAccount(String login, String password, boolean isAdmin) {
        User newUser;
        if (isAdmin) {
            newUser = new Admin(login, password);
        } else {
            newUser = new Customer(login, password);
        }
        DatabaseController.addUser(newUser);
    }

    public static User login(String login, String password) {
        User user = DatabaseController.getUser(login);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else if (user != null && !user.getPassword().equals(password)){
            System.out.println("Wrong password");
            return null;
        }else{
            createAccount(login, password, false);
            return DatabaseController.getUser(login);
        }

    }

}