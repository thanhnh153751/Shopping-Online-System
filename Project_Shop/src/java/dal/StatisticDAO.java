/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Categories;
import model.Customer;
import model.Order;
import model.Product;
import model.Statistic.CategoryStatistic;
import model.Statistic.Income;
import model.Viewproduct;

/**
 *
 * @author THANH
 */
public class StatisticDAO extends DBContext {

    public List<CategoryStatistic> getNumberCategories() {
        List<CategoryStatistic> list = new ArrayList<>();
        String sql = "select c.CategoryID,c.CategoryName,COUNT(p.CategoryID) as 'numberCategory' from Categories c inner join Products p on c.CategoryID=p.CategoryID\n"
                + "Group by c.CategoryID,c.CategoryName";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new CategoryStatistic(rs.getInt(1), rs.getString(2), rs.getInt(3)));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Income> getIncomeByYear(int year) {
        List<Income> list = new ArrayList<>();
        String sql = "select SUM(o.totalmoney) as Total, MONTH(o.OrderDate) as 'Month', YEAR(o.OrderDate) as 'Year' from Orders o\n"
                + " where YEAR(o.OrderDate)=?\n"
                + " group by MONTH(o.OrderDate), YEAR(o.OrderDate)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Income(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Order> getYear() {
        List<Order> list = new ArrayList<>();
        String sql = "select YEAR(o.OrderDate) as year from Orders o Group by YEAR(o.OrderDate)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getString(1)));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Order> getMonthYear() {
        List<Order> list = new ArrayList<>();
        String sql = "select MONTH(od.OrderDate) as 'month',YEAR(od.OrderDate) as 'year' from Orders od\n"
                + "group by MONTH(od.OrderDate),YEAR(od.OrderDate) order by YEAR(od.OrderDate) desc,MONTH(od.OrderDate) desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt("month"), rs.getInt("year")));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Viewproduct> getMonthYearView() {
        List<Viewproduct> list = new ArrayList<>();
        String sql = "select MONTH(v.viewdate) as 'month',YEAR(v.viewdate) as 'year' from ViewProduct v\n"
                + "group by MONTH(v.viewdate),YEAR(v.viewdate) \n"
                + "order by YEAR(v.viewdate) desc,MONTH(v.viewdate) desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Viewproduct(rs.getInt("month"), rs.getInt("year")));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Viewproduct> getViewByMothYear(int moth, int year) {//view products
        List<Viewproduct> list = new ArrayList<>();
        String sql = "select v.ProductID,p.ProductName,p.image,SUM(v.[view]) as 'sumview',MONTH(v.viewdate) as 'month',YEAR(v.viewdate) as 'year' from Products p inner join ViewProduct v on p.ProductID = v.ProductID\n"
                + "where MONTH(v.viewdate)=? and YEAR(v.viewdate)=?\n"
                + "group by v.ProductID,p.ProductName,p.image,MONTH(v.viewdate),YEAR(v.viewdate) order by SUM(v.[view]) desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, moth);
            st.setInt(2, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Viewproduct(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getString("image"), rs.getInt("sumview"), moth, year));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Product> getMostBoughtProductMothYear(int moth, int year) {//view products
        List<Product> list = new ArrayList<>();
        String sql = "select p.ProductID,p.ProductName,p.image,SUM(o.Quantity) as 'totalquantity' from Products p inner join [Orders Details] o on p.ProductID=o.ProductID \n"
                + "inner join Orders od on o.OrderID=od.OrderID where MONTH(od.OrderDate)=? and YEAR(od.OrderDate)=?\n"
                + "group by p.ProductID, p.ProductName,p.image\n"
                + "order by SUM(o.Quantity) desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, moth);
            st.setInt(2, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getString("image"), rs.getInt("totalquantity")));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Categories> getMostBoughtCategory(int month, int year) {
        List<Categories> list = new ArrayList<>();
        String sql = "select c.CategoryName,p.CategoryID,SUM(o.Quantity) as 'totalquantity' from Products p inner join [Orders Details] o on p.ProductID=o.ProductID \n"
                + "inner join Categories c on p.CategoryID = c.CategoryID inner join  Orders od on o.OrderID=od.OrderID where MONTH(od.OrderDate)=? and YEAR(od.OrderDate)=?\n"
                + "group by p.CategoryID, c.CategoryName";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, month);
            st.setInt(2, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Categories(rs.getInt("CategoryID"), rs.getString("CategoryName"), rs.getInt("totalquantity")));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Customer> getMostCustomer(int month, int year) {
        List<Customer> list = new ArrayList<>();
        String sql = "select SUM(o.totalmoney) as Total, o.CustomerID,c.Username,c.[image] from Orders o inner join Customers c on o.CustomerID=c.CustomerID where MONTH(o.OrderDate)=? and YEAR(o.OrderDate)=?\n"
                + "group by o.CustomerID ,c.Username,c.[image] order by SUM(o.totalmoney) desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, month);
            st.setInt(2, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Customer(rs.getInt("CustomerID"), rs.getString("Username"), rs.getString("image"), rs.getInt("Total")));
            }
        } catch (SQLException e) {
        }
        return list;
    }

//    public static void main(String[] args) {
//        StatisticDAO d = new StatisticDAO();
//        List<Product> l= d.getMostBoughtProductMothYear(3, 2022);
//        for (Product v : l) {
//            System.out.println(v.getProductName() +"-"+v.getTotal());
//        }
//    }
}
