/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Customer;
import model.Item;
import model.Order;
import model.Product;

/**
 *
 * @author THANH
 */
public class HistoryOrderDAO extends DBContext {

    public List<Order> getOrderHistoryCustomer(int cid) {

        List<Order> order = new ArrayList<>();
        String sql1 = "select * from Orders o where CustomerID=? order by o.OrderDate desc";
        String sql2 = "select p.*,od.OrderID,od.Quantity "
                + "from [Orders Details] od inner join Products p on od.ProductID=p.ProductID where OrderID=?";
        try {
            PreparedStatement st1 = connection.prepareStatement(sql1);
            st1.setInt(1, cid);
            ResultSet rs1 = st1.executeQuery();
            while (rs1.next()) {
                List<Item> item = new ArrayList<>();
                int odID = rs1.getInt("OrderId");
                PreparedStatement st2 = connection.prepareStatement(sql2);
                st2.setInt(1, odID);
                ResultSet rs2 = st2.executeQuery();
                while (rs2.next()) {
                    Product p = new Product(rs2.getInt("ProductID"), rs2.getString("ProductName"), rs2.getInt("UnitPrice"),
                            rs2.getInt("UnitsInStock"), rs2.getInt("UnitsOnOrder"), rs2.getInt("CategoryID"), rs2.getString("image"), rs2.getString("description"));
                    Item i = new Item(p, rs2.getInt("Quantity"), rs2.getInt("UnitPrice"));
                    item.add(i);

                }
                Order o = new Order(odID, cid, rs1.getString("OrderDate"), rs1.getInt("totalmoney"), item);
                order.add(o);
            }

        } catch (Exception e) {
        }
        return order;
    }

    public List<Customer> getAllOrderHistory() {
        List<Customer> customer = new ArrayList<>();
        String sql = "select * from Customers";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("CustomerId");
                List<Order> order = getOrderHistoryCustomer(id);
                Customer c = new Customer(id, rs.getString("ContactName"), rs.getString("Address"), rs.getString("Phone"), rs.getString("Username"), rs.getInt("status"), order);
                customer.add(c);
            }

        } catch (Exception e) {
        }
        return customer;
    }

    public static void main(String[] args) {
        HistoryOrderDAO d = new HistoryOrderDAO();
        List<Order> order = d.getOrderHistoryCustomer(5);
//        for (Order order1 : order) {
//            System.out.println(order1.getTotalmoney());
//            for (Item item : order1.getItems()) {
//                System.out.println(item.getProduct().getProductName());
//                System.out.println(item.getQuantity());
//                System.out.println(item.getPrice());
//            }
//        }
//        List<Customer> all = d.getAllOrderHistory();
//        for (Customer customer : all) {
//            System.out.println(customer.getContactName());
//            for (Order order1 : customer.getOders()) {
//                System.out.println("Tong tien"+order1.getTotalmoney());
//                for (Item item : order1.getItems()) {
//                    System.out.println(item.getProduct().getProductName());
//                    System.out.println(item.getQuantity());
//                    System.out.println(item.getPrice());
//                }
//            }
//            System.out.println("----------------------------------");
//        }

    }
}
