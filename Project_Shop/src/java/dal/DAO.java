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
import model.Products;

/**
 *
 * @author THANH
 */
public class DAO extends DBContext {

    public List<Categories> getAllCategories() {
        List<Categories> list = new ArrayList<>();
        String sql = "select * from Categories";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Categories(rs.getInt("CategoryID"), rs.getString("CategoryName")));
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Products> getProductsByCid(int cid) {
        List<Products> list = new ArrayList<>();
        String sql = "select p.ProductID,p.ProductName,p.UnitPrice,p.UnitsInStock,p.UnitsOnOrder,p.image,p.description,c.CategoryID,c.CategoryName from Products p inner join Categories c\n"
                + "on p.CategoryID=c.CategoryID";
        if (cid != 0) {
            sql += " where c.CategoryID=" + cid;
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Categories c = new Categories(rs.getInt("CategoryID"), rs.getString("CategoryName"));
                Products p = new Products(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("UnitPrice"), rs.getInt("UnitsInStock"), rs.getInt("UnitsOnOrder"), rs.getString("image"), rs.getString("description"), c);
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Products getProductsByPid(int pid) {
        String sql = "select p.*,c.CategoryName from Products p inner join Categories c "
                + "on p.CategoryID=c.CategoryID where p.ProductID=" + pid;

        try {
            PreparedStatement st = connection.prepareStatement(sql);
//            st.setInt(1, pid);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Categories c = new Categories(rs.getInt("CategoryID"), rs.getString("CategoryName"));
                Products p = new Products(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("UnitPrice"), rs.getInt("UnitsInStock"), rs.getInt("UnitsOnOrder"), rs.getString("image"), rs.getString("description"), c);
                return p;
            }

        } catch (Exception e) {
        }
        return null;
    }

    public String getImageByPid2(int pid) {
        String sql = "select image from Products where ProductID=" + pid;

        try {
            PreparedStatement st = connection.prepareStatement(sql);
//            st.setInt(1, pid);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                System.out.println("Nullpoirt");
                return rs.getString("image");
            }

        } catch (Exception e) {
        }
        return null;
    }

    public Categories getCategoryById(int id) {
        String sql = "select * from Categories where CategoryID=" + id;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Categories c = new Categories(rs.getInt("CategoryID"), rs.getString("CategoryName"), rs.getString("Description"));
                return c;
            }

        } catch (Exception e) {
        }
        return null;
    }

    public List<Products> getNewProducts() {
        List<Products> list = new ArrayList<>();
        String sql = "select top 4 p.ProductID,p.ProductName,p.UnitPrice,p.UnitsInStock,p.UnitsOnOrder,p.image,p.description,c.CategoryID,c.CategoryName\n"
                + "from Products p inner join Categories c\n"
                + "on p.CategoryID=c.CategoryID\n"
                + "order by ProductID desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Categories c = new Categories(rs.getInt("CategoryID"), rs.getString("CategoryName"));
                Products p = new Products(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("UnitPrice"), rs.getInt("UnitsInStock"), rs.getInt("UnitsOnOrder"), rs.getString("image"), rs.getString("description"), c);
                list.add(p);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<Products> getListProducts() {
        List<Products> list = new ArrayList<>();
        String sql = "select p.ProductID,p.ProductName,p.UnitPrice,p.UnitsInStock,p.UnitsOnOrder,p.image,p.description,c.CategoryID,c.CategoryName from Products p inner join Categories c\n"
                + "on p.CategoryID=c.CategoryID";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Categories c = new Categories(rs.getInt("CategoryID"), rs.getString("CategoryName"));
                Products p = new Products(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("UnitPrice"), rs.getInt("UnitsInStock"), rs.getInt("UnitsOnOrder"), rs.getString("image"), rs.getString("description"), c);
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void insert(Products c) {

        String sql = "insert into Products values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, c.getProductID());
            st.setString(2, c.getProductName());
            st.setInt(3, c.getUnitPrice());
            st.setInt(4, c.getUnitsInStock());
            st.setInt(5, c.getUnitsOnOrder());
            st.setInt(6, c.getCategori().getCategoryID());
            st.setString(7, c.getImage());
            st.setString(8, c.getDescription());
            st.executeUpdate();//1 - 0
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insertCategory(String name, String des) {

        String sql = "insert into Categories values(?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, des);
            st.executeUpdate();//1 - 0
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(int id) {
        String sql = "delete from Products where ProductID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();//tra ve 1 - 0

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public int getMaxId() {
        String sql = "select max(ProductID) from Products";
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
        return 0;
    }

    public void update(Products p) {
        String sql = " update Products set ProductName=?,UnitPrice=?,UnitsInStock=?,UnitsOnOrder=?,CategoryID=?,image=?,description=? where ProductID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getProductName());
            st.setInt(2, p.getUnitPrice());
            st.setInt(3, p.getUnitsInStock());
            st.setInt(4, p.getUnitsOnOrder());
            st.setInt(5, p.getCategori().getCategoryID());
            st.setString(6, p.getImage());
            st.setString(7, p.getDescription());
            st.setInt(8, p.getProductID());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateCategory(Categories p) {
        String sql = "update Categories set CategoryName=?,Description=? where CategoryID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getCategoryName());
            st.setString(2, p.getDescription());
            st.setInt(3, p.getCategoryID());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteCategory(int id) {
        String sql = "delete from Categories where CategoryID=?";
        String sql2 = "delete from Products where CategoryID=?";
        try {
            PreparedStatement st2 = connection.prepareStatement(sql2);
            st2.setInt(1, id);
            st2.executeUpdate();
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();//tra ve 1 - 0

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<Products> getListProductsBySearch(String key) {
        List<Products> list = new ArrayList<>();
        String sql = "select p.ProductID,p.ProductName,p.UnitPrice,p.UnitsInStock,p.UnitsOnOrder,p.image,p.description,c.CategoryID,c.CategoryName from Products p inner join Categories c\n"
                + "on p.CategoryID=c.CategoryID";
        if (key != "" || key != null) {
            sql += " where p.ProductName like ? or p.description like ?";
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + key + "%");
            st.setString(2, "%" + key + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Categories c = new Categories(rs.getInt("CategoryID"), rs.getString("CategoryName"));
                Products p = new Products(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("UnitPrice"), rs.getInt("UnitsInStock"), rs.getInt("UnitsOnOrder"), rs.getString("image"), rs.getString("description"), c);
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Products> getListByPage(List<Products> list, int start, int end) {
        ArrayList<Products> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }

    public static void main(String[] args) {
        DAO d = new DAO();
//        List<Products> list = d.getNewProducts();
//        for (Products s : list) {
//            System.out.println(s.getProductID());
//        }

//        System.out.println(d.getMaxId());
    }
}
