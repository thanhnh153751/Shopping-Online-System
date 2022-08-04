/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author THANH
 */
public class Order {
    private int orderID;
    private int customerID;
    private int shipperID;
    private String orderDate;
    private String requiredDate;
    private String shippedDate;
    private int totalmoney;
    private List<Item> items;
    private int month;
    private int year;
    
    public Order() {
    }

    public Order(int month, int year) {       
        this.month = month;
        this.year = year;
    }
    

    public Order(int orderID, int customerID, int shipperID, String orderDate, String requiredDate, String shippedDate, int totalmoney) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.shipperID = shipperID;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.totalmoney = totalmoney;
    }
    public Order(String orderDate) {//get year
        this.orderDate = orderDate;       
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    

    public Order(int orderID, int customerID, String orderDate, int totalmoney, List<Item> items) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.orderDate = orderDate;
        this.totalmoney = totalmoney;
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getShipperID() {
        return shipperID;
    }

    public void setShipperID(int shipperID) {
        this.shipperID = shipperID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(String requiredDate) {
        this.requiredDate = requiredDate;
    }

    public String getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }

    public int getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(int totalmoney) {
        this.totalmoney = totalmoney;
    }
    
}
