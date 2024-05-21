package com.wiktormalyska.database;

import com.wiktormalyska.item.Item;
import com.wiktormalyska.item.transistor.NPNTransistor;
import com.wiktormalyska.item.transistor.PNPTransistor;
import com.wiktormalyska.user.Order;
import com.wiktormalyska.user.Cart;
import com.wiktormalyska.user.User;
import com.wiktormalyska.user.admin.Admin;
import com.wiktormalyska.user.customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class DatabaseController {
    private static List<User> userDB = new ArrayList<>(List.of(
            new Customer("customer", "customer"),
            new Admin("admin", "admin")
    ));

    private static List<Item> itemDB = new ArrayList<>(List.of(
            new NPNTransistor(0, "NPN Transistor", 1.0, 10),
            new PNPTransistor(1 , "PNP Transistor", 1.0, 10)
    ));

    private static List<Order> orderDB = new ArrayList<>();

    public static void initOrderDB(){
        orderDB = new ArrayList<>();
        for (User user : userDB) {
            if (user instanceof Customer) {
                Customer customer = (Customer) user;
                orderDB.add(new Order(customer.getCart(),customer.getCart().getTotalPrice(), customer));
            }
        }
    }

    //User

    public static User getUser(String login){
        for (User user : userDB) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }
    public static List<User> getUsers(){
        return userDB;
    }

    public static void addUser(User user){
        userDB.add(user);
    }
    public static void removeUser(User user){
        userDB.remove(user);
    }
    public static void editUser(User oldUser, User newUser){
        userDB.set(userDB.indexOf(oldUser), newUser);
    }


    //Items
    public static Item getItem(int id){
        return itemDB.get(id);
    }

    public static List<Item> getItems(){
        return itemDB;
    }

    public static void addItem(Item item){
        itemDB.add(item);
    }
    public static void removeItem(Item item){
        itemDB.remove(item);
    }
    public static void editItem(Item oldItem, Item newItem){
        itemDB.set(itemDB.indexOf(oldItem), newItem);
    }

}


