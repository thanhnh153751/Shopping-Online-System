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
public class Categories {
    private int categoryID;
    private String categoryName;
    private String description;
    private int total;

    public Categories() {
    }

    public Categories(int CategoryID, String CategoryName) {
        this.categoryID = CategoryID;
        this.categoryName = CategoryName;
    }

    public Categories(int categoryID, String categoryName, int total) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.total = total;
    }
    

    public Categories(int categoryID, String categoryName, String description) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.description = description;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.categoryID = CategoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.categoryName = CategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
