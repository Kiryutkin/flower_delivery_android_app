package com.vasiliyoschepkov.flowerdelivery.model;

/**
 * Заказчик
 */

public class Customer {
    private String name;
    private int phone;

    public Customer(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }
}
