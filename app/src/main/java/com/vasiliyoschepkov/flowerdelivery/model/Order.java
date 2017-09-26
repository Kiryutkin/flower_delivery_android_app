package com.vasiliyoschepkov.flowerdelivery.model;

import java.util.Date;
import java.util.List;

/**
 * Заказ
 */

public class Order {
    private final long ID;

    private List<Product> product;

    private User courier;
    private Customer customer;

    private String addressDeivery;
    private String addressExportOrder;

    private String comment;

    private Date orderDate;
    private Date deliveryDate;

    private Status status;

    public Order(long ID, List<Product> product, User courier, Customer customer, String addressDeivery, Date orderDate, Status status) {
        this.ID = ID;
        this.product = product;
        this.courier = courier;
        this.customer = customer;
        this.addressDeivery = addressDeivery;
        this.orderDate = orderDate;
        this.status = status;
    }


}
