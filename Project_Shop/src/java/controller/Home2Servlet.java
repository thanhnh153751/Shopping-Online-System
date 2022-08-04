/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CartDAO;
import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cart;
import model.Categories;
import model.Item;
import model.Product;
import model.Products;

/**
 *
 * @author THANH
 */
public class Home2Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Home2Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Home2Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAO d=new DAO();
        List<Categories> categoryList=d.getAllCategories();
        
        String name=request.getParameter("name");     
        String cid_raw=request.getParameter("cid");
        try {
      
        //phân trang

        
        int cid;
        if(cid_raw==null){
            cid_raw="0";
        }
        cid=Integer.parseInt(cid_raw);
        List<Products> listP = d.getProductsByCid(cid);//thực hiện chọn category


        if( name!=null ){//nếu thực hiện seach
           listP = d.getListProductsBySearch(name); 
            
        }      
 
        
        request.setAttribute("category", categoryList);
        request.setAttribute("cid", cid);
        
        int page, numperpage=8;
        int size=listP.size();
        int numPage=(size%8==0?(size/8):(size/8)+1);
        String xpage=request.getParameter("page");
        if(xpage==null){
            page=1;
        }else{
            page=Integer.parseInt(xpage);
        }
        int start,end;
        start=(page-1)*numperpage;
        end=Math.min(page*numperpage, size);
        List<Products> listPage = d.getListByPage(listP, start, end);
        request.setAttribute("product", listPage);
        request.setAttribute("page", page);
        request.setAttribute("numPage", numPage);
            
        request.setAttribute("key", name);
            
        //phần shopping cart
        CartDAO c = new CartDAO();
        List<Product> listp = c.getAll();
        Cookie[] arr = request.getCookies();
        String txt = "";
        if (arr != null) {
            for (Cookie o : arr) {
                if (o.getName().equals("cart")) {
                    txt += o.getValue();
                }
            }
        }
        Cart cart = new Cart(txt, listp);
        List<Item> listItem = cart.getItems();
        int n;
        if (listItem != null) {
            n = listItem.size();
        } else {
            n = 0;
        }
        request.setAttribute("size", n);
        String url = request.getRequestURI();
        
        request.setAttribute("url", url);
         
            request.getRequestDispatcher("home2.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
