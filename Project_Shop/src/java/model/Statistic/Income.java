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
public class Income {
    private int total;
    private int month;
    private int year;

    public Income() {
    }

    public Income(int total, int month, int year) {
        this.total = total;
        this.month = month;
        this.year = year;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
