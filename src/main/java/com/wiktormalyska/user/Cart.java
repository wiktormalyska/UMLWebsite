package com.wiktormalyska.user;

import com.wiktormalyska.item.Item;

import java.util.List;

public class Cart implements ICart{

    private List<Item> items;


    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public void clearCart() {
        items.clear();
    }

    @Override
    public void showCart() {
        System.out.println(items.toString());
    }

    @Override
    public List<Item> checkout() {
        return items;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;

        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
