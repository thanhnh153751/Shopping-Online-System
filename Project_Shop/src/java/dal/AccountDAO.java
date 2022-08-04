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
import model.Customer;

/**
 *
 * @author THANH
 */
public class AccountDAO extends DBContext {

    public List<Customer> getAllCustomer() {
        List<Customer> list = new ArrayList<>();
        String sql = "select * from Customers";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Customer(rs.getInt("CustomerID"), rs.getString("ContactName"), rs.getString("Address"), rs.getString("Phone"), rs.getString("Username"), rs.getString("Password"), rs.getString("image"), rs.getInt("Role"),rs.getInt("status")));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public Customer check(String user, String pass) {
        String sql = "select * from Customers where username=? and password=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Customer(rs.getInt("CustomerID"), rs.getString("ContactName"), rs.getString("Address"), rs.getString("Phone"), rs.getString("Username"), rs.getString("Password"), rs.getString("image"), rs.getInt("Role"));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public Customer checkStatus(String user, String pass) {
        String sql = "select * from Customers where username=? and password=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Customer(rs.getInt("CustomerID"), rs.getString("ContactName"), rs.getString("Address"), rs.getString("Phone"), rs.getString("Username"), rs.getString("Password"), rs.getString("image"), rs.getInt("Role"),rs.getInt("status"));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Customer checkAccExist(String user) {
        String sql = "select * from Customers where username=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void insertCus(Customer c) {

        String sql = "insert into Customers values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, c.getCustomerID());
            st.setString(2, c.getContactName());
            st.setString(3, c.getAddress());
            st.setString(4, c.getPhone());
            st.setString(5, c.getUsername());
            st.setString(6, c.getPassword());
            st.setString(7, c.getImage());
            st.setInt(8, 2);//2 là role của user

            st.executeUpdate();//1 - 0
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Customer getCustomer(int id) {
        String sql = "select * from Customers where CustomerID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));

            }
        } catch (Exception e) {
        }
        return null;
    }
    public Customer getCustomerAndStatus(int id) {
        String sql = "select * from Customers where CustomerID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8),rs.getInt(9));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public void update(Customer c) {
        String sql = "update Customers set ContactName=?,Address=?,Phone=?,Username=?,image=? where CustomerID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, c.getContactName());
            st.setString(2, c.getAddress());
            st.setString(3, c.getPhone());
            st.setString(4, c.getUsername());
            st.setString(5, c.getImage());
            st.setInt(6, c.getCustomerID());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void updateStatus(Customer c) {
        String sql = "update Customers set status=? where CustomerID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, (c.getStatus() == 1) ? 0 : 1);
            st.setInt(2, c.getCustomerID());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void changePassword(String u, String p) {
        String sql = "update Customers set Password=? where Username=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p);
            st.setString(2, u);
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteCus(int id) {
        String sql = "update Customers set status=-1 where CustomerID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();//tra ve 1 - 0

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public int getMaxCusId() {
        String sql = "select max(CustomerID) from Customers";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                return id;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return 1;
    }

//            public static void main(String[] args) {
//        AccountDAO d = new AccountDAO();
//            System.out.println(d.getMaxCusId());
//
//    }
}
