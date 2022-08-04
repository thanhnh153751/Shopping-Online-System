package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.1/css/all.css\" integrity=\"sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \t/* Coded with love by Mutiullah Samim */\n");
      out.write("\t\tbody,\n");
      out.write("\t\thtml {\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("\t\t\theight: 100%;\n");
      out.write("\t\t\tbackground: #60a3bc !important;\n");
      out.write("\t\t}\n");
      out.write("\t\t.user_card {\n");
      out.write("\t\t\theight: 400px;\n");
      out.write("\t\t\twidth: 350px;\n");
      out.write("\t\t\tmargin-top: auto;\n");
      out.write("\t\t\tmargin-bottom: auto;\n");
      out.write("\t\t\tbackground: #f39c12;\n");
      out.write("\t\t\tposition: relative;\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tjustify-content: center;\n");
      out.write("\t\t\tflex-direction: column;\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t\tbox-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("\t\t\t-webkit-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("\t\t\t-moz-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("\t\t\tborder-radius: 5px;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\t\t.brand_logo_container {\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\theight: 170px;\n");
      out.write("\t\t\twidth: 170px;\n");
      out.write("\t\t\ttop: -75px;\n");
      out.write("\t\t\tborder-radius: 50%;\n");
      out.write("\t\t\tbackground: #60a3bc;\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t}\n");
      out.write("\t\t.brand_logo {\n");
      out.write("\t\t\theight: 150px;\n");
      out.write("\t\t\twidth: 150px;\n");
      out.write("\t\t\tborder-radius: 50%;\n");
      out.write("\t\t\tborder: 2px solid white;\n");
      out.write("\t\t}\n");
      out.write("\t\t.form_container {\n");
      out.write("\t\t\tmargin-top: 100px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.login_btn {\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\tbackground: #c0392b !important;\n");
      out.write("\t\t\tcolor: white !important;\n");
      out.write("\t\t}\n");
      out.write("\t\t.login_btn:focus {\n");
      out.write("\t\t\tbox-shadow: none !important;\n");
      out.write("\t\t\toutline: 0px !important;\n");
      out.write("\t\t}\n");
      out.write("\t\t.login_container {\n");
      out.write("\t\t\tpadding: 0 2rem;\n");
      out.write("\t\t}\n");
      out.write("\t\t.input-group-text {\n");
      out.write("\t\t\tbackground: #c0392b !important;\n");
      out.write("\t\t\tcolor: white !important;\n");
      out.write("\t\t\tborder: 0 !important;\n");
      out.write("\t\t\tborder-radius: 0.25rem 0 0 0.25rem !important;\n");
      out.write("\t\t}\n");
      out.write("\t\t.input_user,\n");
      out.write("\t\t.input_pass:focus {\n");
      out.write("\t\t\tbox-shadow: none !important;\n");
      out.write("\t\t\toutline: 0px !important;\n");
      out.write("\t\t}\n");
      out.write("\t\t.custom-checkbox .custom-control-input:checked~.custom-control-label::before {\n");
      out.write("\t\t\tbackground-color: #c0392b !important;\n");
      out.write("\t\t}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \t<div class=\"container h-100\">\n");
      out.write("\t\t<div class=\"d-flex justify-content-center h-100\">\n");
      out.write("\t\t\t<div class=\"user_card\">\n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-center\">\n");
      out.write("\t\t\t\t\t<div class=\"brand_logo_container\">\n");
      out.write("\t\t\t\t\t\t<img src=\"https://cdn.freebiesupply.com/logos/large/2x/pinterest-circle-logo-png-transparent.png\" class=\"brand_logo\" alt=\"Logo\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-center form_container\">\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group mb-3\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group-append\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"\" class=\"form-control input_user\" value=\"\" placeholder=\"username\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group mb-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group-append\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"\" class=\"form-control input_pass\" value=\"\" placeholder=\"password\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"custom-control custom-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"custom-control-input\" id=\"customControlInline\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"customControlInline\">Remember me</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"d-flex justify-content-center mt-3 login_container\">\n");
      out.write("\t\t\t\t \t<button type=\"button\" name=\"button\" class=\"btn login_btn\">Login</button>\n");
      out.write("\t\t\t\t   </div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t<div class=\"mt-4\">\n");
      out.write("\t\t\t\t\t<div class=\"d-flex justify-content-center links\">\n");
      out.write("\t\t\t\t\t\tDon't have an account? <a href=\"#\" class=\"ml-2\">Sign Up</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"d-flex justify-content-center links\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Forgot your password?</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
