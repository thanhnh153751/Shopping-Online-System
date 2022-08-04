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
import model.Categories;
import model.Products;

/**
 *
 * @author THANH
 */
public class FilterDAO extends DBContext{
        public List<Products> getProductsByFilter(int[] cid,String[] color,int up,int down,String orderby) {
           
        List<Products> list = new ArrayList<>();
        String sql = "select p.*,c.CategoryName from Products p inner join Categories c on p.CategoryID=c.CategoryID where ";
            for (int i = 0; i < cid.length; i++) {
                if(i==0) sql+="(";
                sql+="p.CategoryID="+cid[i];
                if(i!=cid.length-1 ){
                    sql+=" or ";
                }else{
                    
                    sql+=") and ";
                }
            }
            if(color!=null)
            for (int i = 0; i < color.length; i++) {
                sql+="p.description like ?";                
                if(i!=color.length-1 ){
                    sql+=" or ";
                }else{
                    sql+=" and ";
                }
            }
            
            sql+="(p.UnitPrice between "+down+" and "+up+") ";
            if(!orderby.equals("none")){
                sql+="order by p.UnitPrice "+orderby;
            }
               System.out.println(sql);     
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            if(color!=null)
            for (int i = 0; i < color.length; i++) {
               st.setString(i+1, "%"+color[i]+"%");                
            }

            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                Categories c = new Categories(rs.getInt("CategoryID"), rs.getString("CategoryName"));
                Products p = new Products(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("UnitPrice"), rs.getInt("UnitsInStock"), rs.getInt("UnitsOnOrder"), rs.getString("image"), rs.getString("description"), c);
                list.add(p);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}
