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
public class Viewproduct {
    int productId;
    String productName ;
    String images;
    int totalView;
    int month;
    int year;

    public Viewproduct() {
    }


    public Viewproduct(int productId, String productName, String images, int totalView, int month, int year) {
        this.productId = productId;
        this.productName = productName;
        this.images = images;
        this.totalView = totalView;
        this.month = month;
        this.year = year;
    }
    public Viewproduct(int month, int year) {
        this.month = month;
        this.year = year;
    }
    
    

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
    

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getTotalView() {
        return totalView;
    }

    public void setTotalView(int totalView) {
        this.totalView = totalView;
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
    
}
