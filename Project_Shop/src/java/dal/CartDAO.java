/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Cart;
import model.Customer;
import model.Item;
import model.Product;

/**
 *
 * @author THANH
 */
public class CartDAO extends DBContext {

    public Customer getAccount(String user, String pass) {
        String sql = "select * from Customers where username=? and password=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Customer(rs.getInt("CustomerID"), rs.getString("ContactName"),
                        rs.getString("Address"), rs.getString("Phone"), rs.getString("Username"),
                        rs.getString("Password"), rs.getString("image"), rs.getInt("Role"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Products";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("UnitPrice"),
                        rs.getInt("UnitsInStock"), rs.getInt("UnitsOnOrder"), rs.getInt("CategoryID"), rs.getString("image"), rs.getString("description"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public Product getProductById(int id) {
        String sql = "select * from Products where ProductID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
              return new Product(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("UnitPrice"),
                        rs.getInt("UnitsInStock"), rs.getInt("UnitsOnOrder"), rs.getInt("CategoryID"), rs.getString("image"), rs.getString("description"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public void addOrder(Customer c, Cart cart) {
//        LocalDate curDate = LocalDate.now();
//        String date = curDate.toString();
        try {
            //add order
            String sql = "insert into Orders values(?,null,GETDATE(),null,null,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, c.getCustomerID());
//            st.setString(2, date);
            st.setInt(2, cart.getTotalMoney());
            st.executeUpdate();
            //lay id cua order vua add
            String sql1 = "select top 1 OrderID from Orders order by OrderID  desc";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery();
            //add bang OrderDetail
            if (rs.next()) {
                int oid = rs.getInt("OrderID");
                for (Item i : cart.getItems()) {
                    String sql2 = "insert into [Orders Details] values(?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);
                    st2.setInt(1, oid);
                    st2.setInt(2, i.getProduct().getProductID());
                    st2.setInt(3, i.getQuantity());
                    st2.setInt(4, i.getPrice());
                    st2.executeUpdate();
                }
            }
            //cap nhat lai so luong san pham
            String sql3 = "update Products set UnitsInStock=UnitsInStock-? where ProductID=?";
            PreparedStatement st3 = connection.prepareStatement(sql3);
            for (Item i : cart.getItems()) {
                st3.setInt(1, i.getQuantity());
                st3.setInt(2, i.getProduct().getProductID());
                st3.executeUpdate();
            }
        } catch (SQLException e) {

        }
    }
}
