/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author THANH
 */
public class OrderDetail {
    private int unitPrice;
    private int quantity;
    private int orderID;
    private int productID;

    public OrderDetail() {
    }

    public OrderDetail(int unitPrice, int quantity, int orderID, int productID) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.orderID = orderID;
        this.productID = productID;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
    
}
