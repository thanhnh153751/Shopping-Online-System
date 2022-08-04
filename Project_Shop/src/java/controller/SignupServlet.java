/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AccountDAO;
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
public class SignupServlet extends HttpServlet {

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
            out.println("<title>Servlet SignupServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignupServlet at " + request.getContextPath() + "</h1>");
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
        AccountDAO d = new AccountDAO();

        request.getRequestDispatcher("signup.jsp").forward(request, response);

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

        String u = request.getParameter("user");
        String p = request.getParameter("pass");
        String p2 = request.getParameter("conpass");
        String check = request.getParameter("checkb");
        //custom
        String name = request.getParameter("fullname");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String img = "images/";
        //images
        Part part = request.getPart("file");
        String fileName = part.getSubmittedFileName();
        String path = getServletContext().getRealPath("/").replace("\\build", "") + "images" + File.separator + fileName;
        InputStream is = part.getInputStream();
        boolean succs = upoloadFile(is, path);

        is.close();
        if (fileName == null || fileName.equals("")) {
            img = "";
        } else {
            img += fileName;
        }

        AccountDAO d = new AccountDAO();
        Customer a = d.checkAccExist(u);

        if (a != null || u == null) {

            request.setAttribute("messSgin", "user name đã tồn tại hoặc sai vui lòng kiểm tra lại!");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (p == null || p2 == null || p.equals(p2) == false) {
            request.setAttribute("messSgin", "password không trùng khớp!");
            request.setAttribute("user", u);
            request.setAttribute("name", name);
            request.setAttribute("phone", phone);
            request.setAttribute("address", address);
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else if (check == null || u.equals("") || p.equals("")) {
            request.setAttribute("user", u);
            request.setAttribute("name", name);
            request.setAttribute("phone", phone);
            request.setAttribute("address", address);
            request.setAttribute("messSgin", "bạn cần xác nhận lại thông tin và đồng ý của yêu cầu!");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } else {

            int size = d.getMaxCusId() + 1;
            Customer cus = new Customer(size, name, address, phone, u, p,img,2);
            d.insertCus(cus);
            request.setAttribute("messSgin", "tạo account thành công!");
            request.setAttribute("login", true);
            request.getRequestDispatcher("signup.jsp").forward(request, response);
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
