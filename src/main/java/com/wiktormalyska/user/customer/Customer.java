package com.wiktormalyska.user.customer;

import com.wiktormalyska.item.Item;
import com.wiktormalyska.user.Cart;
import com.wiktormalyska.user.Order;
import com.wiktormalyska.user.User;

import java.util.List;

public class Customer extends User implements ICustomer {
    Cart cart;
    List<Order> orderHistory;

    public Customer(String login, String password) {
        super(login, password);
    }

    @Override
    public Cart getCart() {
        return cart;
    }

    @Override
    public void addToCart(Item item) {
        cart.addItem(item);
    }

    @Override
    public void removeFromCart() {
        cart.removeItem(null);
    }

    @Override
    public void checkout() {
        cart.checkout();
    }

    @Override
    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    @Override
    public void addOrderToHistory(Order order) {
        orderHistory.add(order);
    }
}
