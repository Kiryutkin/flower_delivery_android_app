package com.vasiliyoschepkov.flowerdelivery.model;

/**
 * Продукт
 */

public class Product {
    private final long ID;
    private String name;
    private int price;
    private TypeProduct typeProduct;

    public Product(long ID, String name, int price, TypeProduct typeProduct) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.typeProduct = typeProduct;
    }
}
