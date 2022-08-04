package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Categories;
import java.util.Locale.Category;
import java.util.List;

public final class home2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- basic -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!-- mobile metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n");
      out.write("        <!-- site metas -->\n");
      out.write("        <title>thank</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <!-- bootstrap css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- style css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- Responsive-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <!-- fevicon -->\n");
      out.write("        <link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\n");
      out.write("        <!-- Scrollbar Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\n");
      out.write("        <!-- Tweaks for older IEs-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nouislider.css\">\n");
      out.write("        <script src=\"js/nouislider.js\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .pagination {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .pagination a {\n");
      out.write("                color: black;\n");
      out.write("                font-size: 22px;\n");
      out.write("                float: left;\n");
      out.write("                padding: 8px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .pagination a.active {\n");
      out.write("                background-color: #ee3e0f;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .pagination a:hover:not(.active) {\n");
      out.write("                background-color: #ee3e0f;\n");
      out.write("            }\n");
      out.write("            .fiter{\n");
      out.write("                display: flex;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .fiter .sub_fiter{\n");
      out.write("                padding: 5%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <!-- body -->\n");
      out.write("\n");
      out.write("    <body class=\"main-layout\">\n");
      out.write("        <!-- loader  -->\n");
      out.write("        <!--        <div class=\"loader_bg\">\n");
      out.write("                    <div class=\"loader\"><img src=\"images/loading.gif\" alt=\"#\" /></div>\n");
      out.write("                </div>-->\n");
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- end loader -->\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <!-- Sidebar  -->\n");
      out.write("                <nav id=\"sidebar\">\n");
      out.write("\n");
      out.write("                    <div id=\"dismiss\">\n");
      out.write("                        <i class=\"fa fa-arrow-left\"></i>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <ul class=\"list-unstyled components\">\n");
      out.write("\n");
      out.write("                        <li class=\"active\">\n");
      out.write("                            <a href=\"index.html\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#shoes\">Shoes</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#jewellery\">Jewellery</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#kids\">Kids and Babies</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <!-- header -->\n");
      out.write("                <header>\n");
      out.write("                    <!-- header inner -->\n");
      out.write("                    <div class=\"head_top\" style=\"padding-bottom: 0px;\">\n");
      out.write("                        <div class=\"header\">\n");
      out.write("\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-2 logo_section\">\n");
      out.write("                                        <div class=\"full\">\n");
      out.write("                                            <div class=\"center-desk\">\n");
      out.write("                                                <div class=\"logo\">\n");
      out.write("                                                    <!--                                                    <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"#\"></a>-->\n");
      out.write("                                                    <a href=\"home\"><h1 style=\"color: white\">THANK-SHOP</h1></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-10\">\n");
      out.write("                                        <div class=\"right_header_info\">\n");
      out.write("\n");
      out.write("                                            <ul>\n");
      out.write("\n");
      out.write("                                                <form action=\"home2\" id=\"search-bar\">\n");
      out.write("                                                    <li class=\"menu_iconb\">\n");
      out.write("                                                        <input style=\"margin-right: 15px;\" class=\"tetter\" placeholder=\"Search\" type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                    </li>\n");
      out.write("\n");
      out.write("                                                    <li class=\"menu_iconb\">\n");
      out.write("\n");
      out.write("                                                        <a onclick=\"document.getElementById('search-bar').submit()\"><img style=\"margin-right: 15px;\" src=\"icon/3.png\" /></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    </li> \n");
      out.write("                                                </form>\n");
      out.write("\n");
      out.write("                                                <!--<li class=\"menu_iconb\">\n");
      out.write("                                                <a href=\"#\"><img style=\"margin-right: 15px;\" src=\"icon/1.png\" alt=\"#\" />7213456789</a>\n");
      out.write("                                                </li>-->\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                <li class=\"tytyu\">\n");
      out.write("                                                    <a href=\"#\"> <img style=\"margin-right: 15px;\" src=\"icon/2.png\" alt=\"#\" /></a>\n");
      out.write("                                                </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <li>\n");
      out.write("                                                    <button type=\"button\" id=\"sidebarCollapse\">\n");
      out.write("                                                        <img src=\"images/menu_icon.png\" alt=\"#\" />\n");
      out.write("                                                    </button>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- end header inner -->\n");
      out.write("\n");
      out.write("                        <!-- end header -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- start baner -->\n");
      out.write("\n");
      out.write("                    <!-- end baner -->\n");
      out.write("                </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Categories -->\n");
      out.write("                <div class=\"Categories\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("\n");
      out.write("                        <!-- news shoes -->\n");
      out.write("\n");
      out.write("                        <!--                        <a class=\"seemore\" href=\"#\">See more</a>-->\n");
      out.write("                        <!-- end news shoes -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- Categories -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"title\">\n");
      out.write("                                    <!--<h2> Categories</h2>-->\n");
      out.write("                                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    <form id=\"f\" action=\"list\">\n");
      out.write("                                        <ul class=\"categiri\" onchange=\"document.getElementById('f').submit()\">\n");
      out.write("                                            <li ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write(" ><a href=\"home2?cid=0\">ALL</a></li> \n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--bộ lọc mở-->\n");
      out.write("                        <!--                        <div class=\"dropdown\">\n");
      out.write("                                                    <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Filter</button>\n");
      out.write("                                                    <div class=\"dropdown-menu\">\n");
      out.write("                                                         code here \n");
      out.write("                                                        <div class=\"row\">\n");
      out.write("                                                            <div class=\"col-3\">\n");
      out.write("                                                                <p>day la fiter</p>\n");
      out.write("                                                                  \n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>                       \n");
      out.write("                                                    </div>                       \n");
      out.write("                                                </div>                       -->\n");
      out.write("                        <!--bộ lọc mở end-->\n");
      out.write("                        <form action=\"filter\">\n");
      out.write("                            <div  class=\"fiter\" style=\"\">\n");
      out.write("                                <!--check box-->\n");
      out.write("                                <div>\n");
      out.write("                                    ");

                                        int[] clist = (int[]) request.getAttribute("cidF");

                                        boolean pos = false;
                                        if (clist != null) {
                                            pos = true;
                                        }

                                        List<Categories> calist = (List<Categories>) request.getAttribute("category");
                                        int index = 0;
                                    
      out.write("\n");
      out.write("                                    <h5 class=\"sub_fiter\">Hãng giày</h5>\n");
      out.write("                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_1.setParent(null);
      _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_1.setVar("c");
      int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                        ");

                                            boolean status = false;
                                            if (pos) {
                                                for (int i = 0; i < clist.length; i++) {
                                                    if (clist[i] == calist.get(index).getCategoryID()) {
                                                        status = true;
                                                    }

                                                }
                                            }
                                        
            out.write("\n");
            out.write("                                        <input type=\"checkbox\" name=\"cid_checkbox\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write('"');
            out.write(' ');
            //  c:if
            org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
            _jspx_th_c_if_5.setPageContext(_jspx_page_context);
            _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
            _jspx_th_c_if_5.setTest( pos && status);
            int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
            if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("checked");
                int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
              return;
            }
            _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
            out.write('/');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("<br/>\n");
            out.write("                                        ");

                                            index++;
                                        
            out.write("\n");
            out.write("                                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
      }
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                ");

                                    boolean b = false;
                                    boolean w = false;
                                    String[] color = (String[]) request.getAttribute("colorF");
                                    if (color != null) {
                                        for (int i = 0; i < color.length; i++) {
                                            if (color[i].equals("black")) {
                                                b = true;
                                            }
                                            if (color[i].equals("white")) {
                                                w = true;
                                            }

                                        }
                                    }
                                
      out.write("\n");
      out.write("                                <div>\n");
      out.write("                                    <h5 class=\"sub_fiter\">Màu sắc</h5>                           \n");
      out.write("                                    <input type=\"checkbox\" name=\"color_checkbox\" value=\"black\" ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_6.setPageContext(_jspx_page_context);
      _jspx_th_c_if_6.setParent(null);
      _jspx_th_c_if_6.setTest(b);
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("checked");
          int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      out.write("/>Đen<br/>                            \n");
      out.write("                                    <input type=\"checkbox\" name=\"color_checkbox\" value=\"white\" ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_7.setPageContext(_jspx_page_context);
      _jspx_th_c_if_7.setParent(null);
      _jspx_th_c_if_7.setTest(w);
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("checked");
          int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      out.write("/>Trắng<br/>                            \n");
      out.write("                                    </div>\n");
      out.write("                                    <!--khoảng giá-->\n");
      out.write("\n");
      out.write("                                    <div class=\"range\" style=\"display:flex; justify-content: right;\">\n");
      out.write("                                        <div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <h5>Khoảng giá</h5>\n");
      out.write("                                            <div id=\"slider\"></div>\n");
      out.write("                                            <input id=\"slider-margin-value-min\" name=\"min\" value=\"100000\" type=\"text\" readonly=\"\">\n");
      out.write("                                            <input id=\"slider-margin-value-max\" name=\"max\" value=\"10000000\" type=\"text\" readonly=\"\"> \n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--sắp xếp theo giá-->\n");
      out.write("\n");
      out.write("                                    <div class=\"sub_fiter\">\n");
      out.write("                                        <select name=\"getOrder\">\n");
      out.write("                                            <option value=\"none\">Sắp xếp theo</option>\n");
      out.write("                                            <option value=\"ASC\" ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write(" >Giá tăng dần</option>\n");
      out.write("                                        <option value=\"DESC\" ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write(">Giá giảm dần</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button type=\"submit\" style=\"height: 40px;width: 40px;background: gray\">Lọc</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                            <script>\n");
      out.write("                                var slider = document.getElementById('slider');\n");
      out.write("\n");
      out.write("                                noUiSlider.create(slider, {\n");
      out.write("                                    start: [");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.downF==null ? 1000 :requestScope.downF}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.upF==null ? 100000 : requestScope.upF}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("],\n");
      out.write("                                    connect: true,\n");
      out.write("                                    step: 100,\n");
      out.write("                                    range: {\n");
      out.write("                                        'min': 1000,\n");
      out.write("                                        'max': 100000\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                                var marginMin = document.getElementById('slider-margin-value-min'),\n");
      out.write("                                        marginMax = document.getElementById('slider-margin-value-max');\n");
      out.write("                                var inputs = [marginMin, marginMax];\n");
      out.write("                                slider.noUiSlider.on('update', function (values, handle) {\n");
      out.write("                                    inputs[handle].setAttribute('value', values[handle].replace(/\\D/g, \"\").replace(/\\B(?=(\\d{3})+(?!\\d))/g, \",\"));\n");
      out.write("                                    //                                inputs[handle].value = parseInt(values[handle], 10);\n");
      out.write("                                    inputs[handle].value = values[handle].replace(/\\D/g, \"\").replace(/\\B(?=(\\d{3})+(?!\\d))/g, \",\");\n");
      out.write("\n");
      out.write("\n");
      out.write("                                });\n");
      out.write("                        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- all shoes -->\n");
      out.write("                        <div id=\"shoes\" class=\"shoes-bg\">\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end all shoes -->\n");
      out.write("                        <!--<a class=\"seemore\" href=\"#\">See more</a>-->\n");
      out.write("                        <!--phần của phân trang-->\n");
      out.write("                        ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <div class=\"pagination\">\n");
      out.write("                            <!--khi chọn lọc-->\n");
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <script>\n");
      out.write("                                function movePage(pageNumber){\n");
      out.write("                                    var url=window.location.href;\n");
      out.write("                                    \n");
      out.write("                                        var newurl = url.split('&page')[0];\n");
      out.write("                                       window.location=newurl+'&page='+pageNumber; \n");
      out.write("                                    \n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- end Categories -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <section>\n");
      out.write("                <!--  save -->\n");
      out.write("\n");
      out.write("                <!-- <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"save\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("                                        <div class=\"save_box\">\n");
      out.write("                                            <h3>save up to 50%</h3>\n");
      out.write("                                            <a href=\"#\">Buy now</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> -->\n");
      out.write("                <!-- end save -->\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--  footer -->\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"footer_top\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("                                            <!-- <a href=\"index.html\"> <img class=\"logo1\" src=\"images/logo1.png\" /></a> -->\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("                                            <ul class=\"sociel\">\n");
      out.write("                                                <li> <a href=\"#\"><i class=\"fa fa-facebook-f\"></i></a></li>\n");
      out.write("                                                <li> <a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                                <li> <a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                                <li> <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 \">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xl-3 col-lg-3 col-md-6 col-sm-6 \">\n");
      out.write("                                        <div class=\"address\">\n");
      out.write("                                            <h3>Contact us </h3>\n");
      out.write("                                            <ul class=\"loca\">\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"#\"><img src=\"icon/loc.png\" alt=\"#\" /></a>145 londone\n");
      out.write("                                                    <br>uk </li>\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"#\"><img src=\"icon/call.png\" alt=\"#\" /></a>+12586954775 </li>\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"#\"><img src=\"icon/email.png\" alt=\"#\" /></a>demo@gmail.com </li>\n");
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                                        <div class=\"address\">\n");
      out.write("                                            <h3>customer service</h3>\n");
      out.write("                                            <ul class=\"Menu_footer\">\n");
      out.write("                                                <li class=\"active\"> <a href=\"#\">My account</a> </li>\n");
      out.write("                                                <li><a href=\"#\">Wishlist</a> </li>\n");
      out.write("                                                <li><a href=\"#\">My Cart</a> </li>\n");
      out.write("                                                <li><a href=\"#\">Checkout</a> </li>\n");
      out.write("                                                <li><a href=\"#\">Login</a> </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                                        <div class=\"address\">\n");
      out.write("                                            <h3>corporation</h3>\n");
      out.write("                                            <ul class=\"Links_footer\">\n");
      out.write("                                                <li class=\"active\"><a href=\"#\">My account</a> </li>\n");
      out.write("                                                <li><a href=\"#\">Wishlist</a> </li>\n");
      out.write("                                                <li><a href=\"#\">My Cart</a> </li>\n");
      out.write("                                                <li><a href=\"#\"> Checkout</a> </li>\n");
      out.write("                                                <li><a href=\"#\">Login</a> </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-lg-3 col-md-6 col-sm-6 \">\n");
      out.write("                                        <div class=\"address\">\n");
      out.write("                                            <h3>why choose us</h3>\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna </p>\n");
      out.write("                                            <form class=\"newtetter\">\n");
      out.write("                                                <input class=\"tetter\" placeholder=\"Your email\" type=\"text\" name=\"Your email\">\n");
      out.write("                                                <button class=\"submit\">Subscribe</button>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("    <!-- end footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"overlay\"></div>\n");
      out.write("\n");
      out.write("<!-- Javascript files-->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.0.0.min.js\"></script>\n");
      out.write("<script src=\"js/customJS/myjs.js\"></script>\n");
      out.write("<!-- sidebar -->\n");
      out.write("<script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("<script src=\"https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("                                function doLogout() {\n");
      out.write("                                    if (confirm(\"bạn có chắc chắn muốn logout?\")) {\n");
      out.write("                                        window.location = \"logout\";\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $(\"#sidebar\").mCustomScrollbar({\n");
      out.write("            theme: \"minimal\"\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('#dismiss, .overlay').on('click', function () {\n");
      out.write("            $('#sidebar').removeClass('active');\n");
      out.write("            $('.overlay').removeClass('active');\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('#sidebarCollapse').on('click', function () {\n");
      out.write("            $('#sidebar').addClass('active');\n");
      out.write("            $('.overlay').addClass('active');\n");
      out.write("            $('.collapse.in').toggleClass('in');\n");
      out.write("            $('a[aria-expanded=true]').attr('aria-expanded', 'false');\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $(\".fancybox\").fancybox({\n");
      out.write("            openEffect: \"none\",\n");
      out.write("            closeEffect: \"none\"\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\".zoom\").hover(function () {\n");
      out.write("\n");
      out.write("            $(this).addClass('transition');\n");
      out.write("        }, function () {\n");
      out.write("\n");
      out.write("            $(this).removeClass('transition');\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    // This example adds a marker to indicate the position of Bondi Beach in Sydney,\n");
      out.write("    // Australia.\n");
      out.write("    function initMap() {\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("            zoom: 11,\n");
      out.write("            center: {\n");
      out.write("                lat: 40.645037,\n");
      out.write("                lng: -73.880224\n");
      out.write("            },\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        var image = 'images/maps-and-flags.png';\n");
      out.write("        var beachMarker = new google.maps.Marker({\n");
      out.write("            position: {\n");
      out.write("                lat: 40.645037,\n");
      out.write("                lng: -73.880224\n");
      out.write("            },\n");
      out.write("            map: map,\n");
      out.write("            icon: image\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<!-- google map js -->\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyA8eaHt9Dh5H57Zh0xVTqxVdBFCvFMqFjQ&callback=initMap\"></script>\n");
      out.write("<!-- end google map js -->\n");
      out.write("</body>\n");
      out.write("\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null && sessionScope.account.role==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li>\n");
        out.write("                                <a href=\"check?action=manager\">Manager</a>\n");
        out.write("                            </li>                           \n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <li class=\"menu_iconb\">\n");
        out.write("                                                        <a href=\"#\" onclick=\"doLogout()\">Log out <img style=\"margin-right: 15px;\" src=\"icon/5.png\" alt=\"#\" /> </a>\n");
        out.write("                                                    </li>\n");
        out.write("                                                    <li class=\"menu_iconb\">\n");
        out.write("                                                        <a>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                                    </li>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                                                    <li class=\"menu_iconb\">\n");
        out.write("                                                        <a href=\"login\">Log in <img style=\"margin-right: 15px;\" src=\"icon/5.png\" alt=\"#\" /> </a>\n");
        out.write("                                                    </li>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("cid");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cid==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"active\"");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                                                <li ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("   ><a href=\"home2?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryID==cid}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"active\"");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.orderF eq 'ASC'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.orderF eq 'DESC'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("p");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <div class=\"col-xl-3 col-lg-3 col-md-6 col-sm-12 margintop\">\n");
          out.write("                                        <div class=\"shoes-box\">\n");
          out.write("                                            <!--<h5>Sale</h5>-->\n");
          out.write("                                            <i><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/></i>\n");
          out.write("                                            <p><span class=\"nolmal\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></p>\n");
          out.write("                                            <h4>Price: <span class=\"nolmal monney\" style=\"color: red\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.unitPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>đ</h4>\n");
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                            <div style=\"display: flex;\">\n");
          out.write("                                                <a class=\"buynow\" href=\"#\">Buy now</a>\n");
          out.write("                                                <a class=\"buynow\" href=\"#\">Add to cart</a>\n");
          out.write("                                            </div>\n");
          out.write("                                        \n");
          out.write("                                    </div>        \n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("page");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.page}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setBegin(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_3.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.numPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_3.setVar("i");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <a class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i==page?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\"movePage('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </a>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
