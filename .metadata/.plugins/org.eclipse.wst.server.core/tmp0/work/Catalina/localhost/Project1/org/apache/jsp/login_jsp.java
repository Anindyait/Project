/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2022-12-24 19:01:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"ISO-8859-1\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.js\"\r\n");
      out.write("			integrity=\"sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=\"\r\n");
      out.write("			crossorigin=\"anonymous\">\r\n");
      out.write("	</script>\r\n");
      out.write("	<script>\r\n");
      out.write("		$(function () {\r\n");
      out.write("			$(\"#header\").load(\"header.jsp\");\r\n");
      out.write("			$(\"#footer\").load(\"footer.html\");\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Signed up</title>\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Bootstrap/CSS/style1.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"font\">\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<div id=\"header\"></div>\r\n");
      out.write("			   <div class=\"header-adjustment\"></div>\r\n");
      out.write("\r\n");
      out.write("			   <div class = \"login-bg\">\r\n");
      out.write("					<h2 style=\"opacity:90%;\">Login</h2>\r\n");
      out.write("					\r\n");
      out.write("                    <br>\r\n");
      out.write("					\r\n");
      out.write("                    <div class=\"server-side-check\" style=\"text-align: left;\" ");
      out.print( request.getAttribute("wrong_password"));
      out.write(" >Incorrect Password!</div>\r\n");
      out.write("                    <div class=\"server-side-check\" style=\"text-align: left;\" ");
      out.print( request.getAttribute("wrong_email"));
      out.write(" >Email ID not found!</div>\r\n");
      out.write("                    <br>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    <form action=\"Login\" name=\"form1\" class=\"needs-validation\" novalidate method=\"post\">\r\n");
      out.write("                        <div class=\"form-floating mb-3\" >\r\n");
      out.write("                            <input name=\"email\" type = \"email\" class = \"form-control\"  id = \"email\" placeholder=\"mikehunt@panda.com\" required>\r\n");
      out.write("                            <label for = \"email\" style=\"opacity:70%;\">Email ID</label> \r\n");
      out.write("\r\n");
      out.write("                            <div class=\"invalid-feedback\" style=\"text-align: left;\">\r\n");
      out.write("                               Enter valid email ID\r\n");
      out.write("                           </div>\r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div class=\"form-floating mb-3\">\r\n");
      out.write("                            <input name=\"password\" type = \"password\" class = \"form-control\"  id = \"password1\" placeholder=\"1234\" required>\r\n");
      out.write("                            <label for = \"password\" style=\"opacity:70%;\">Password</label>\r\n");
      out.write("                            <div class=\"invalid-feedback\" style=\"text-align: left;\">\r\n");
      out.write("                                Enter password\r\n");
      out.write("                            </div> \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-dark form-submit\">Login</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <a href=\"Register\">\r\n");
      out.write("                                    <div type=\"sub\" class=\"btn btn-outline-dark form-submit\">Sign in</div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("		   		</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            // Example starter JavaScript for disabling form submissions if there are invalid fields\r\n");
      out.write("        (() => {\r\n");
      out.write("        'use strict'\r\n");
      out.write("        \r\n");
      out.write("        // Fetch all the forms we want to apply custom Bootstrap validation styles to\r\n");
      out.write("        const forms = document.querySelectorAll('.needs-validation')\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        // Loop over them and prevent submission\r\n");
      out.write("        Array.from(forms).forEach(form => {\r\n");
      out.write("          form.addEventListener('submit', event => {\r\n");
      out.write("        \r\n");
      out.write("            if (!form.checkValidity()) {\r\n");
      out.write("              event.preventDefault()\r\n");
      out.write("              event.stopPropagation()\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("            form.classList.add('was-validated')\r\n");
      out.write("        \r\n");
      out.write("          }, false)\r\n");
      out.write("        })\r\n");
      out.write("        \r\n");
      out.write("        })()\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("	</body>\r\n");
      out.write("	</html>");
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
