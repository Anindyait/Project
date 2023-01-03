/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2023-01-02 05:32:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Header</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"Pics/panda.png\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/13deb536c6.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Bootstrap/CSS/style1.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <script>\r\n");
      out.write("        const icon = document.getElementsByClassName('.icon');\r\n");
      out.write("        const search = document.getElementsByClassName('.search');\r\n");
      out.write("\r\n");
      out.write("        search.onclick = function(){\r\n");
      out.write("            search.classList.toggle('active')\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            $(\".dropdown-toggle\").dropdown();\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <div class=\"font\">\r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg header\">\r\n");
      out.write("            <!--Store name and Logo-->\r\n");
      out.write("\r\n");
      out.write("            <a class=\"navbar-brand\" style=\"text-decoration:none\" href=\"#\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <img class=\"brand-img\" src=\"Pics/panda.png\" height=\"65\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <div class=\"brand-name\">Panda Shop</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!--Collapsed NavBars toggle-->\r\n");
      out.write("            <div class=\"menu-button-padding\">\r\n");
      out.write("                <button class=\"navbar-toggler round\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#NavBar\" aria-expanded=\"false\" aria-controls=\"#NavBar\" aria-label=\"Toggle navigation\" ><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("            <!--Actual NavBar-->\r\n");
      out.write("            <div class=\"collapse navbar-collapse nav-part\" id=\"NavBar\">\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"navbar-nav\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link nav-link1 active\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"aboutUs.html\" class=\"nav-link nav-link1 active\">About Us</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a href=\"ProductList\" class=\"nav-link nav-link1 active\">Products</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                        <div class=\"nav-link nav-link1 dropdown-toggle active\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                            Dropdown\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"dropdown-menu\" style=\"border-radius:20px;\">\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Action</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Another action</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("             \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"nav-item right-icons\">\r\n");
      out.write("            <i class=\"fa-solid fa-magnifying-glass fa-xl\" data-bs-toggle=\"modal\" data-bs-target=\"#searchModal\"></i>\r\n");
      out.write("\r\n");
      out.write("            <!--Search Modal-->\r\n");
      out.write("            <div class=\"modal fade search\" id=\"searchModal\" tabindex=\"-1\" aria-labelledby=\"searchModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                <div class=\"modal-dialog\">\r\n");
      out.write("                    <div class=\"modal-content search\">\r\n");
      out.write("                        <form>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <input name=\"search-text\" type = \"text\" class = \"form-control\"  id = \"search-text\" placeholder=\"Search...\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-2\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn bamboo rounded-5\"><i class=\"fa-solid fa-magnifying-glass fa-lg\"></i></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"col-1\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\" style=\"margin-top:6px; margin-left:-15px;\"></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <a href=\"#cart\" class=\"right-links\"><i class=\"fa fa-cart-shopping fa-xl right-cons\"></i></a>\r\n");
      out.write("\r\n");
      out.write("            <!-- <input type=\"button\"  value=\"   \" data-bs-toggle=\"collapse\" class=\"btn btn-secondary login-button round\"/> -->\r\n");
      out.write("            <a href=\"Profile\" class=\"right-links\"><i class=\"fa-solid fa-user fa-xl right-cons\"></i></a>\r\n");
      out.write("            <a href=\"Profile\" class=\"right-links\"><img class =\"profile-icon\" src=\"Pics/icons8-male-user-50.png\" class=\"profile-icon\" hidden></a>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
