/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DAO;
import dal.FilterDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Categories;
import model.Products;

/**
 *
 * @author THANH
 */
public class FilterServlet extends HttpServlet {

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
            out.println("<title>Servlet FilterServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FilterServlet at " + request.getContextPath() + "</h1>");
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
        
        String[] cid_raw = request.getParameterValues("cid_checkbox");
        int[] cid;
        if (cid_raw != null) {
            cid = new int[cid_raw.length];
            for (int i = 0; i < cid_raw.length; i++) {
                cid[i]=Integer.parseInt(cid_raw[i]);
            }
        }else{
            cid = new int[0];
        }
        
        String[] color = request.getParameterValues("color_checkbox");
        
        String up_raw = request.getParameter("max");
        
        String down_raw = request.getParameter("min");
        if(up_raw==null || up_raw.equals("")) up_raw="10000000";
        if(down_raw==null) down_raw="100000";
        int up = Integer.parseInt(up_raw.replace(",", ""));
        int down = Integer.parseInt(down_raw.replace(",", ""));
        System.out.println(up);
        System.out.println(down);
        String order = request.getParameter("getOrder");
        
        request.setAttribute("cidF", cid);
        request.setAttribute("colorF", color);
        request.setAttribute("upF", up/100);//giá max cho slider
        request.setAttribute("downF", down/100);//giá min cho slider
        request.setAttribute("upP", up);//cho page
        request.setAttribute("downP", down);//cho page
        request.setAttribute("orderF", order);
        request.setAttribute("filter", true);
        FilterDAO f = new FilterDAO();
        List<Products> listP = f.getProductsByFilter(cid, color, up, down, order);
        
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
        request.setAttribute("category", categoryList);
        request.getRequestDispatcher("home2.jsp").forward(request, response);
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
