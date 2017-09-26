package com.vasiliyoschepkov.flowerdelivery.model;

import java.util.List;

/**
 * Блок заказов
 */

public class BlockOrder {
    private final long ID;
    private List<Order> orderList;
    private int orderPrice;

    public BlockOrder(long ID, List<Order> orderList, int orderPrice) {
        this.ID = ID;
        this.orderList = orderList;
        this.orderPrice = orderPrice;
    }
}
