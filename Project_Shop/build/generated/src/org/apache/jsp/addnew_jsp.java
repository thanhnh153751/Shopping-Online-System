package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addnew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script\n");
      out.write("        src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script\n");
      out.write("        src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .infor{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"manager\" style=\"text-decoration: none\"><h2>Manager Products</h2></a>\n");
      out.write("        <h1 style=\"text-align: center\">Add new Product</h1>\n");
      out.write("        <form action=\"addnew\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <table style=\"margin: 0 auto;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>next Product ID</td>\n");
      out.write("                    <td><input type=\"number\" name=\"id\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.nextID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>enter Product Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>enter Unit Price</td>\n");
      out.write("                    <td><input type=\"text\" name=\"price\" value=\"0\"/>(VNĐ)</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>enter Units In Stock</td>\n");
      out.write("                    <td><input type=\"number\" name=\"inStock\" value=\"0\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>enter Units On Order</td>\n");
      out.write("                    <td><input type=\"number\" name=\"onOrder\" value=\"0\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>enter Product Description</td>\n");
      out.write("                    <td><input type=\"text\" name=\"description\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>enter Photo</td>\n");
      out.write("                    <td><input type=\"file\" class=\"form-control\" name=\"file\" placeholder=\"Enter photo\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>enter Category</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"cid\" >             \n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"SAVE\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <p style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.alert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--            <input type=\"text\" name=\"price\" id=\"currency-field\" pattern=\"^\\d{1,3}(,\\d{3})*(\\.\\d+)?$\" value=\"\" data-type=\"currency\" placeholder=\"\"/>(VNĐ)<br/>-->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\" integrity=\"sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            // Jquery Dependency\n");
      out.write("\n");
      out.write("            $(\"input[data-type='currency']\").on({\n");
      out.write("                keyup: function () {\n");
      out.write("                    formatCurrency($(this));\n");
      out.write("                },\n");
      out.write("                blur: function () {\n");
      out.write("                    formatCurrency($(this), \"blur\");\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("            function formatNumber(n) {\n");
      out.write("                // format number 1000000 to 1,234,567\n");
      out.write("                return n.replace(/\\D/g, \"\").replace(/\\B(?=(\\d{3})+(?!\\d))/g, \",\")\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function formatCurrency(input, blur) {\n");
      out.write("                // appends $ to value, validates decimal side\n");
      out.write("                // and puts cursor back in right position.\n");
      out.write("\n");
      out.write("                // get input value\n");
      out.write("                var input_val = input.val();\n");
      out.write("\n");
      out.write("                // don't validate empty input\n");
      out.write("                if (input_val === \"\") {\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // original length\n");
      out.write("                var original_len = input_val.length;\n");
      out.write("\n");
      out.write("                // initial caret position\n");
      out.write("                var caret_pos = input.prop(\"selectionStart\");\n");
      out.write("\n");
      out.write("                // check for decimal\n");
      out.write("                if (input_val.indexOf(\".\") >= 0) {\n");
      out.write("\n");
      out.write("                    // get position of first decimal\n");
      out.write("                    // this prevents multiple decimals from\n");
      out.write("                    // being entered\n");
      out.write("                    var decimal_pos = input_val.indexOf(\".\");\n");
      out.write("\n");
      out.write("                    // split number by decimal point\n");
      out.write("                    var left_side = input_val.substring(0, decimal_pos);\n");
      out.write("                    var right_side = input_val.substring(decimal_pos);\n");
      out.write("\n");
      out.write("                    // add commas to left side of number\n");
      out.write("                    left_side = formatNumber(left_side);\n");
      out.write("\n");
      out.write("                    // validate right side\n");
      out.write("                    right_side = formatNumber(right_side);\n");
      out.write("\n");
      out.write("                    // On blur make sure 2 numbers after decimal\n");
      out.write("                    if (blur === \"blur\") {\n");
      out.write("//                        right_side += \"00\";\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    // Limit decimal to only 2 digits\n");
      out.write("                    right_side = right_side.substring(0, 2);\n");
      out.write("\n");
      out.write("                    // join number by .\n");
      out.write("                    input_val = \"\" + left_side + \".\" + right_side;\n");
      out.write("\n");
      out.write("                } else {\n");
      out.write("                    // no decimal entered\n");
      out.write("                    // add commas to number\n");
      out.write("                    // remove all non-digits\n");
      out.write("                    input_val = formatNumber(input_val);\n");
      out.write("                    input_val = \"\" + input_val;\n");
      out.write("\n");
      out.write("                    // final formatting\n");
      out.write("                    if (blur === \"blur\") {\n");
      out.write("//                        input_val += \".00\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // send updated string to input\n");
      out.write("                input.val(input_val);\n");
      out.write("\n");
      out.write("                // put caret back in the right position\n");
      out.write("                var updated_len = input_val.length;\n");
      out.write("                caret_pos = updated_len - original_len + caret_pos;\n");
      out.write("                input[0].setSelectionRange(caret_pos, caret_pos);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("d");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>    \n");
          out.write("                            ");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.newP!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("            \n");
        out.write("            <table class=\"infor\" border=\"1px\">\n");
        out.write("                <tr>\n");
        out.write("                    <th>ProductID</th>\n");
        out.write("                    <th>ProductName</th>\n");
        out.write("                    <th>image</th>\n");
        out.write("                    <th>Price</th>\n");
        out.write("                    <th>Units In Stock</th>\n");
        out.write("                    <th>Units On Order</th>\n");
        out.write("                    <th>description</th>\n");
        out.write("                </tr>\n");
        out.write("                <!---->\n");
        out.write("                <!--images/Nike-Air-Max-97-MSCHF-x-INRI-Jesus-replica-800x600.jpg-->\n");
        out.write("                <tr>\n");
        out.write("                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.newP.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.newP.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                    <td><img style=\"width: 80px;height: 60px;\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.newP.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.newP.unitPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.newP.unitsInStock}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.newP.unitsOnOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.newP.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("\n");
        out.write("\n");
        out.write("                </tr>    \n");
        out.write("\n");
        out.write("            </table>\n");
        out.write("\n");
        out.write("        ");
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
