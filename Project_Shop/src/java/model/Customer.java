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
public class Customer {
    private int customerID;
    private String contactName;
    private String address;
    private String phone;
    private String username;
    private String password;
    private String image;
    private int role;
    private int status;
    private int total;
    private List<Order> oders;
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public Customer() {
    }

    public Customer(int customerID, String contactName, String address, String phone, String username, String password, String image, int role) {
        this.customerID = customerID;
        this.contactName = contactName;
        this.address = address;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.image = image;
        this.role = role;
    }
    public Customer(int customerID, String contactName, String address, String phone, String username, String password, String image, int role,int status) {
        this.customerID = customerID;
        this.contactName = contactName;
        this.address = address;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.image = image;
        this.role = role;
        this.status=status;
    }

    public Customer(int customerID, String contactName, String address, String phone, String username, int status, List<Order> oders) {
        this.customerID = customerID;
        this.contactName = contactName;
        this.address = address;
        this.phone = phone;
        this.username = username;
        
        
        
        this.status = status;
        this.oders = oders;
    }

    public Customer(int customerID, String username, String image, int total) {
        this.customerID = customerID;
        this.username = username;
        this.image = image;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    

    public List<Order> getOders() {
        return oders;
    }

    public void setOders(List<Order> oders) {
        this.oders = oders;
    }
    

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
    
}
