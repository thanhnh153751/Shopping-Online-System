/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;


/**
 *
 * @author THANH
 */
public class CheckLoginServlet extends HttpServlet {

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
            out.println("<title>Servlet CheckLoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CheckLoginServlet at " + request.getContextPath() + "</h1>");
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
        String action=request.getParameter("action");
        HttpSession session=request.getSession();
        Customer a=(Customer)session.getAttribute("account");
        
        if(a==null){
//            PrintWriter out=response.getWriter();
//            out.println("access denied");
            response.sendRedirect("login");
        }else{
            if((action.equals("manager"))){
               request.getRequestDispatcher("manager").forward(request, response);
            }
            if((action.equals("managerCategory"))){
               request.getRequestDispatcher("managercategory").forward(request, response);
            }
            if((action.equals("managerCustomer"))){
               request.getRequestDispatcher("managercustom").forward(request, response);
            }
            if((action.equals("statistic"))){
               request.getRequestDispatcher("statistic").forward(request, response);
            }
//            if((action.equals("detail"))){
//                String entryId=request.getParameter("id");
//                request.setAttribute("entryId", entryId);
//               request.getRequestDispatcher("detail").forward(request, response);
//            }
            
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
