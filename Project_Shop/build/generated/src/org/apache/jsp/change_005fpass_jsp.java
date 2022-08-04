package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class change_005fpass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.1/css/all.css\" integrity=\"sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            /* Coded with love by Mutiullah Samim */\n");
      out.write("            body,\n");
      out.write("            html {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                height: 100%;\n");
      out.write("                background: #60a3bc !important;\n");
      out.write("            }\n");
      out.write("            .user_card {\n");
      out.write("                height: 502px;\n");
      out.write("                width: 550px;\n");
      out.write("                margin-top: auto;\n");
      out.write("                margin-bottom: auto;\n");
      out.write("                background: #f39c12;\n");
      out.write("                position: relative;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("                padding: 10px;\n");
      out.write("                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("                -webkit-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("                -moz-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("                border-radius: 5px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .brand_logo_container {\n");
      out.write("                position: absolute;\n");
      out.write("                height: 170px;\n");
      out.write("                width: 170px;\n");
      out.write("                top: -75px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                background: #60a3bc;\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .brand_logo {\n");
      out.write("                height: 150px;\n");
      out.write("                width: 150px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                border: 2px solid white;\n");
      out.write("            }\n");
      out.write("            .form_container {\n");
      out.write("                margin-top: 100px;\n");
      out.write("            }\n");
      out.write("            .login_btn {\n");
      out.write("                width: 100%;\n");
      out.write("                background: #c0392b !important;\n");
      out.write("                color: white !important;\n");
      out.write("            }\n");
      out.write("            .login_btn:focus {\n");
      out.write("                box-shadow: none !important;\n");
      out.write("                outline: 0px !important;\n");
      out.write("            }\n");
      out.write("            .login_container {\n");
      out.write("                padding: 0 2rem;\n");
      out.write("            }\n");
      out.write("            .input-group-text {\n");
      out.write("                background: #c0392b !important;\n");
      out.write("                color: white !important;\n");
      out.write("                border: 0 !important;\n");
      out.write("                border-radius: 0.25rem 0 0 0.25rem !important;\n");
      out.write("            }\n");
      out.write("            .input_user,\n");
      out.write("            .input_pass:focus {\n");
      out.write("                box-shadow: none !important;\n");
      out.write("                outline: 0px !important;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox .custom-control-input:checked~.custom-control-label::before {\n");
      out.write("                background-color: #c0392b !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container h-100\">\n");
      out.write("            <div class=\"d-flex justify-content-center h-100\">\n");
      out.write("                <div class=\"user_card\">\n");
      out.write("                    <div class=\"d-flex justify-content-center\">\n");
      out.write("                        <div class=\"brand_logo_container\">\n");
      out.write("                            <img src=\"https://mpng.subpng.com/20180329/zue/kisspng-computer-icons-user-profile-person-5abd85306ff7f7.0592226715223698404586.jpg\" class=\"brand_logo\" alt=\"Logo\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex justify-content-center form_container\">\n");
      out.write("                        <form action=\"change_pass\" method=\"post\">\n");
      out.write("                            \n");
      out.write("                            <!--phần acc-->\n");
      out.write("                            <div class=\"input-group mb-3\">\n");
      out.write("                                <div class=\"input-group-append\">\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\" name=\"user\" class=\"form-control input_user\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"account name\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group mb-2\">\n");
      out.write("                                <div class=\"input-group-append\">\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"password\" name=\"pass\" class=\"form-control input_pass\" value=\"\" placeholder=\"password\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group mb-2\">\n");
      out.write("                                <div class=\"input-group-append\">\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"password\" name=\"conpass\" class=\"form-control input_pass\" value=\"\" placeholder=\"confirm password\">\n");
      out.write("                            </div>                           \n");
      out.write("\n");
      out.write("                            <div class=\"d-flex justify-content-center mt-3 login_container\">\n");
      out.write("                                <button type=\"submit\" name=\"button\" class=\"btn login_btn\">Change</button>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                            \n");
      out.write("                        </form>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"custom-control\">\n");
      out.write("                            <label class=\"\" for=\"customControlInline\" style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--\t\t\t\t<div class=\"mt-4\">\n");
      out.write("                                                            <div class=\"d-flex justify-content-center links\">\n");
      out.write("                                                                    Don't have an account? <a href=\"#\" class=\"ml-2\">Sign Up</a>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"d-flex justify-content-center links\">\n");
      out.write("                                                                    <a href=\"#\">Forgot your password?</a>\n");
      out.write("                                                            </div>\n");
      out.write("                                                    </div>-->\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess eq 'ok'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                   <div class=\"d-flex justify-content-center mt-3 login_container\">\n");
        out.write("                                       <a href=\"login\"> <button name=\"button\" class=\"btn login_btn\">login</button></a>\n");
        out.write("                                </div> \n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
