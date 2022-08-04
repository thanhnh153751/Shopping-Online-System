/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DAO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Categories;
import model.Products;

/**
 *
 * @author THANH
 */
@MultipartConfig
public class UpdateProductServlet extends HttpServlet {

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
            out.println("<title>Servlet UpdateProductServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateProductServlet at " + request.getContextPath() + "</h1>");
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
        String id_raw = request.getParameter("id");
        try {
            int id = Integer.parseInt(id_raw);
            DAO d = new DAO();
            Products p = d.getProductsByPid(id);
            List<Categories> categoryList = d.getAllCategories();
            request.setAttribute("category", categoryList);
            request.setAttribute("product", p);
            request.getRequestDispatcher("update.jsp").forward(request, response);
        } catch (NumberFormatException e) {
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
        request.setCharacterEncoding("UTF-8");
        String id_raw = request.getParameter("id");
        String name = request.getParameter("name");

        String price_raw = request.getParameter("price");
        String inStock_raw = request.getParameter("inStock");
        String onOder_raw = request.getParameter("onOrder");
        String descrip = request.getParameter("description");
        String img = "images/";
        String cid_raw = request.getParameter("cid");
        int pid, inStock, onOder, cid,price;
        DAO d = new DAO();
        try {
            pid = Integer.parseInt(id_raw);
            cid = Integer.parseInt(cid_raw);
            price = Integer.parseInt(price_raw);
            inStock = Integer.parseInt(inStock_raw);
            onOder = Integer.parseInt(onOder_raw);
            //images
            Part part = request.getPart("file");
            String fileName = part.getSubmittedFileName();
            String path = getServletContext().getRealPath("/").replace("\\build", "") + "images" + File.separator + fileName;
            InputStream is = part.getInputStream();
            boolean succs = upoloadFile(is, path);
            if(fileName.equals("") || fileName == null){
               Products p = d.getProductsByPid(pid);
               img = p.getImage();
            }else{
            img += fileName;
                
            }

            Categories c = new Categories(cid, "");
            Products pp = new Products(pid, name, price, inStock, onOder, img, descrip, c);
            d.update(pp);
            response.sendRedirect("manager");
        } catch (NumberFormatException e) {
        }

    }

    private boolean upoloadFile(InputStream is, String path) {
        boolean test = false;
        try {
            byte[] byt = new byte[1024];
            int read = 0;

            FileOutputStream fops = new FileOutputStream(path);
            while ((read = is.read(byt)) != -1) {
                fops.write(byt, 0, read);
            }
            fops.close();
            test = true;
        } catch (Exception e) {
        }
        return test;
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
