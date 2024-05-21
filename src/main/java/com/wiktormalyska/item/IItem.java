package com.wiktormalyska.item;

public interface IItem {
    String getName();
    double getPrice();
    int getQuantity();
    int getId();
    void setQuantity(int quantity);
}
