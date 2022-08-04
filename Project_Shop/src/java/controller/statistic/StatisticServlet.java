/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.statistic;

import dal.StatisticDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Categories;
import model.Customer;
import model.Order;
import model.Product;
import model.Statistic.CategoryStatistic;
import model.Statistic.Income;
import model.Viewproduct;

/**
 *
 * @author THANH
 */
public class StatisticServlet extends HttpServlet {

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
            out.println("<title>Servlet StatisticServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StatisticServlet at " + request.getContextPath() + "</h1>");
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
        StatisticDAO s = new StatisticDAO();
        List<CategoryStatistic> list = s.getNumberCategories();
        request.setAttribute("dataCategory", list);
        String year_r = request.getParameter("year");
        int year;
        if (year_r == null) {
            year = 2021;
        } else {
            year = Integer.parseInt(year_r);
        }
        List<Income> listIn = s.getIncomeByYear(year);
        List<Order> orderYear = s.getYear();
        request.setAttribute("income", listIn);
        request.setAttribute("orderYear", orderYear);
        request.setAttribute("year", year);

        //bieu do 2 category mua nhieu nhat
        List<Order> date = s.getMonthYear();
        request.setAttribute("date", date);
        String date2_r = request.getParameter("month2");
        int month2,year2;
        if(date2_r==null){
            month2=date.get(0).getMonth();
            year2=date.get(0).getYear();
        }else{
            String []date2 = date2_r.split("/");
            month2= Integer.parseInt(date2[0]);
            year2= Integer.parseInt(date2[1]);
        }
        request.setAttribute("month2", month2);
        request.setAttribute("year2", year2);
        List<Categories> cate = s.getMostBoughtCategory(month2, year2);
        request.setAttribute("cate2", cate);
                
                
        //bieu do 3 customer tiem nang        
        String date3_r = request.getParameter("month3");
        int month3,year3;
        if(date3_r==null){
            month3=date.get(0).getMonth();
            year3=date.get(0).getYear();
        }else{
            String []date3 = date3_r.split("/");
            month3= Integer.parseInt(date3[0]);
            year3= Integer.parseInt(date3[1]);
        }
        request.setAttribute("month3", month3);
        request.setAttribute("year3", year3);
        List<Customer> cus3 = s.getMostCustomer(month3, year3);
        request.setAttribute("custom3", cus3);        
                
      
                
                
        //bieu do 4 view
        List<Viewproduct> ldate4 = s.getMonthYearView();
        request.setAttribute("date4", ldate4);
        String date4_r = request.getParameter("month4");
        int month4,year4;
        if(date4_r==null){
            month4=date.get(0).getMonth();
            year4=date.get(0).getYear();
        }else{
            String []date4 = date4_r.split("/");
            month4= Integer.parseInt(date4[0]);
            year4= Integer.parseInt(date4[1]);
        }
     
        request.setAttribute("month4", month4);
        request.setAttribute("year4", year4);
        List<Viewproduct> list4 = s.getViewByMothYear(month4, year4);
        request.setAttribute("listview", list4);
        //---------------------------------------------------------
        //bieu do 5
        List<Order> ldate5 = s.getMonthYear();
        request.setAttribute("date5", ldate5);
        String date5_r = request.getParameter("month5");
        int month5,year5;
        if(date5_r==null){
            month5=ldate5.get(0).getMonth();
            year5=ldate5.get(0).getYear();
        }else{
            String []date5 = date5_r.split("/");
            month5= Integer.parseInt(date5[0]);
            year5= Integer.parseInt(date5[1]);
        }
     
        request.setAttribute("month5", month5);
        request.setAttribute("year5", year5);
        List<Product> list5 = s.getMostBoughtProductMothYear(month5, year5);
        request.setAttribute("listP", list5);

        request.getRequestDispatcher("statistic.jsp").forward(request, response);
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
