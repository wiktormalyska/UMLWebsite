package com.wiktormalyska.user;

import com.wiktormalyska.item.Item;
import com.wiktormalyska.user.customer.Customer;
import com.wiktormalyska.user.Cart;

import java.util.List;

public class Order {
    Cart cart;
    double totalPrice;
    Customer customer;

    public Order(Cart cart, double totalPrice, Customer customer) {
        this.cart = cart;
        this.totalPrice = totalPrice;
        this.customer = customer;
    }
}
