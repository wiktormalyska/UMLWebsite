package com.wiktormalyska.user.customer;

import com.wiktormalyska.item.Item;
import com.wiktormalyska.user.Cart;
import com.wiktormalyska.user.Order;

import java.util.List;

public interface ICustomer {
    Cart getCart();
    void addToCart(Item item);
    void removeFromCart();
    void checkout();
    List<Order> getOrderHistory();
    void addOrderToHistory(Order order);
}
