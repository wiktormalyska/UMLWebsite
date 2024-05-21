package com.wiktormalyska.user;

import com.wiktormalyska.item.Item;

import java.util.List;

public interface ICart {
    void addItem(Item item);
    void removeItem(Item item);
    void clearCart();
    void showCart();
    List<Item> checkout();
    double getTotalPrice();
}
