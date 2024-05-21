package com.wiktormalyska.item;

public abstract class Item implements IItem {
    private String name;
    private double price;
    private int quantity;
    private int id;

    public Item(int id, String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
