package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Styles -->\n");
      out.write("        <style>\n");
      out.write("        #chartdiv {\n");
      out.write("          width: 100%;\n");
      out.write("          height: 500px;\n");
      out.write("        }\n");
      out.write("        #chartdiv2 {\n");
      out.write("          width: 100%;\n");
      out.write("          height: 500px;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- HTML -->\n");
      out.write("        <div id=\"chartdiv\"></div>\n");
      out.write("        <div id=\"chartdiv2\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Resources -->\n");
      out.write("<script src=\"https://cdn.amcharts.com/lib/5/index.js\"></script>\n");
      out.write("<script src=\"https://cdn.amcharts.com/lib/5/percent.js\"></script>\n");
      out.write("<script src=\"https://cdn.amcharts.com/lib/5/themes/Animated.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Chart code -->\n");
      out.write("<script>\n");
      out.write("am5.ready(function() {\n");
      out.write("\n");
      out.write("// Create root element\n");
      out.write("// https://www.amcharts.com/docs/v5/getting-started/#Root_element\n");
      out.write("var root = am5.Root.new(\"chartdiv\");\n");
      out.write("\n");
      out.write("// Set themes\n");
      out.write("// https://www.amcharts.com/docs/v5/concepts/themes/\n");
      out.write("root.setThemes([\n");
      out.write("  am5themes_Animated.new(root)\n");
      out.write("]);\n");
      out.write("\n");
      out.write("// Create chart\n");
      out.write("// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/\n");
      out.write("var chart = root.container.children.push(\n");
      out.write("  am5percent.PieChart.new(root, {\n");
      out.write("    endAngle: 270\n");
      out.write("  })\n");
      out.write(");\n");
      out.write("\n");
      out.write("// Create series\n");
      out.write("// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/#Series\n");
      out.write("var series = chart.series.push(\n");
      out.write("  am5percent.PieSeries.new(root, {\n");
      out.write("    valueField: \"value\",\n");
      out.write("    categoryField: \"category\",\n");
      out.write("    endAngle: 270\n");
      out.write("  })\n");
      out.write(");\n");
      out.write("\n");
      out.write("series.states.create(\"hidden\", {\n");
      out.write("  endAngle: -90\n");
      out.write("});\n");
      out.write("\n");
      out.write("// Set data\n");
      out.write("// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/#Setting_data\n");
      out.write("series.data.setAll([{\n");
      out.write("  category: \"Lithuania\",\n");
      out.write("  value: 501.9\n");
      out.write("}, {\n");
      out.write("  category: \"Czechia\",\n");
      out.write("  value: 301.9\n");
      out.write("}, {\n");
      out.write("  category: \"Ireland\",\n");
      out.write("  value: 201.1\n");
      out.write("}, {\n");
      out.write("  category: \"Germany\",\n");
      out.write("  value: 165.8\n");
      out.write("}, {\n");
      out.write("  category: \"Australia\",\n");
      out.write("  value: 139.9\n");
      out.write("}, {\n");
      out.write("  category: \"Austria\",\n");
      out.write("  value: 128.3\n");
      out.write("}, {\n");
      out.write("  category: \"UK\",\n");
      out.write("  value: 99\n");
      out.write("}]);\n");
      out.write("\n");
      out.write("series.appear(1000, 100);\n");
      out.write("\n");
      out.write("}); // end am5.ready()\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Char222222222222222222222222222222222222222222222222222222222222222222222222222of amchar-->\n");
      out.write("<!--<script src=\"https://cdn.amcharts.com/lib/5/index.js\"></script>-->\n");
      out.write("<script src=\"https://cdn.amcharts.com/lib/5/percent.js\"></script>\n");
      out.write("<!--<script src=\"https://cdn.amcharts.com/lib/5/themes/Animated.js\"></script>-->\n");
      out.write("<script>\n");
      out.write("    /**\n");
      out.write(" * ---------------------------------------\n");
      out.write(" * This demo was created using amCharts 5.\n");
      out.write(" * \n");
      out.write(" * For more information visit:\n");
      out.write(" * https://www.amcharts.com/\n");
      out.write(" * \n");
      out.write(" * Documentation is available at:\n");
      out.write(" * https://www.amcharts.com/docs/v5/\n");
      out.write(" * ---------------------------------------\n");
      out.write(" */\n");
      out.write("\n");
      out.write("// Create root element\n");
      out.write("// https://www.amcharts.com/docs/v5/getting-started/#Root_element\n");
      out.write("var root2 = am5.Root.new(\"chartdiv2\");\n");
      out.write("\n");
      out.write("\n");
      out.write("// Set themes\n");
      out.write("// https://www.amcharts.com/docs/v5/concepts/themes/\n");
      out.write("root2.setThemes([\n");
      out.write("  am5themes_Animated.new(root2)\n");
      out.write("]);\n");
      out.write("\n");
      out.write("\n");
      out.write("// Create chart\n");
      out.write("// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/\n");
      out.write("var chart2 = root2.container.children.push(am5percent.PieChart.new(root2, {\n");
      out.write("  layout: root2.verticalLayout\n");
      out.write("}));\n");
      out.write("\n");
      out.write("\n");
      out.write("// Create series\n");
      out.write("// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/#Series\n");
      out.write("var series2 = chart2.series.push(am5percent.PieSeries.new(root2, {\n");
      out.write("  valueField: \"value\",\n");
      out.write("  categoryField: \"category\"\n");
      out.write("}));\n");
      out.write("\n");
      out.write("\n");
      out.write("// Set data\n");
      out.write("// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/#Setting_data\n");
      out.write("series2.data.setAll([\n");
      out.write("  { value: 10, category: \"One\" },\n");
      out.write("  { value: 9, category: \"Two\" },\n");
      out.write("  { value: 6, category: \"Three\" },\n");
      out.write("  { value: 5, category: \"Four\" },\n");
      out.write("  { value: 4, category: \"Five\" },\n");
      out.write("  { value: 3, category: \"Six\" },\n");
      out.write("  { value: 1, category: \"Seven\" },\n");
      out.write("]);\n");
      out.write("\n");
      out.write("\n");
      out.write("// Create legend\n");
      out.write("// https://www.amcharts.com/docs/v5/charts/percent-charts/legend-percent-series/\n");
      out.write("var legend2 = chart2.children.push(am5.Legend.new(root2, {\n");
      out.write("  centerX: am5.percent(50),\n");
      out.write("  x: am5.percent(50),\n");
      out.write("  marginTop: 15,\n");
      out.write("  marginBottom: 15\n");
      out.write("}));\n");
      out.write("\n");
      out.write("legend2.data.setAll(series2.dataItems);\n");
      out.write("\n");
      out.write("\n");
      out.write("// Play initial series animation\n");
      out.write("// https://www.amcharts.com/docs/v5/concepts/animations/#Animation_of_series\n");
      out.write("series2.appear(1000, 100);\n");
      out.write("</script>\n");
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
