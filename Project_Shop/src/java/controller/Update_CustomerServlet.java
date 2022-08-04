/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AccountDAO;
import dal.DAO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.Customer;

/**
 *
 * @author THANH
 */
@MultipartConfig
public class Update_CustomerServlet extends HttpServlet {

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
            out.println("<title>Servlet Update_CustomerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Update_CustomerServlet at " + request.getContextPath() + "</h1>");
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
        String user_name = request.getParameter("id");
        try {
            AccountDAO d = new AccountDAO();
            Customer c = d.checkAccExist(user_name);
            request.setAttribute("customer", c);
            request.getRequestDispatcher("update_customer.jsp").forward(request, response);
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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        AccountDAO d = new AccountDAO();
        //custom
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String u = request.getParameter("user");
        String uOld = request.getParameter("userOld");
        String ID = request.getParameter("id");
        int cusID = Integer.parseInt(ID);
        String img = "images/";
        //images
        Part part = request.getPart("file");
        String fileName = part.getSubmittedFileName();
        String path = getServletContext().getRealPath("/").replace("\\build", "") + "images" + File.separator + fileName;
        InputStream is = part.getInputStream();
        boolean succs = upoloadFile(is, path);

        is.close();
        if (fileName == null || fileName.equals("")) {
            img = d.getCustomer(cusID).getImage();
        } else {
            img += fileName;
        }

        
        if(  !u.equals(uOld) && d.checkAccExist(u) != null){
            request.setAttribute("mess", "username đã tồn tại,vui lòng chọn lại!");
             Customer c = d.checkAccExist(uOld);
            request.setAttribute("customer", c);
            request.getRequestDispatcher("update_customer.jsp").forward(request, response);
        }
        else{
        Customer cus = new Customer(cusID, name, address, phone, u,d.checkAccExist(uOld).getPassword(), img,d.getCustomer(cusID).getRole());
        d.update(cus);
        //drop session cũ và tạo lại
        HttpSession session=request.getSession();
        Customer a=(Customer)session.getAttribute("account");
        session.removeAttribute("account");
        session.setAttribute("account", cus);
        
        request.setAttribute("customer", cus);
        
        Customer cus2 = d.getCustomerAndStatus(cusID);
            request.setAttribute("check", cus2);
        request.getRequestDispatcher("customer_infor.jsp").forward(request, response);
        
        }
        
    }
    
    private boolean upoloadFile(InputStream is, String path) {
        boolean test = false;
        try {
            byte[] byt = new byte[1024];
            int read = 0;

            OutputStream fops = new FileOutputStream(path);
            while ((read = is.read(byt)) != -1) {
                fops.write(byt, 0, read);
            }
            fops.flush();

            fops.close();
            is.close();
//            try {
//                  TimeUnit.SECONDS.sleep(2);                
//            } catch (InterruptedException ex) {
//               
//            }
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
