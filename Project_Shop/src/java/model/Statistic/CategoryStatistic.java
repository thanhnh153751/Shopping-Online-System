/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Statistic;

/**
 *
 * @author THANH
 */
public class CategoryStatistic {
    private int categoryID;
    private String categoryName;
    private int numberCategory;

    public CategoryStatistic() {
    }

    public CategoryStatistic(int categoryID, String categoryName, int numberCategory) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.numberCategory = numberCategory;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getNumberCategory() {
        return numberCategory;
    }

    public void setNumberCategory(int numberCategory) {
        this.numberCategory = numberCategory;
    }
    
}
