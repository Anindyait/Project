/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2022-12-24 14:01:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("			$(\"#header\").load(\"header.html\");\r\n");
      out.write("			$(\"#footer\").load(\"footer.html\");\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("    <!--DOB-->\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        var Days = [31,28,31,30,31,30,31,31,30,31,30,31];// index => month [0-11]\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    var option = '<option selected value=\"\" disabled>day</option>';\r\n");
      out.write("    var selectedDay=\"day\";\r\n");
      out.write("    for (var i=1;i <= Days[0];i++){ //add option days\r\n");
      out.write("        option += '<option value=\"'+ i + '\">' + i + '</option>';\r\n");
      out.write("    }\r\n");
      out.write("    $('#day').append(option);\r\n");
      out.write("    $('#day').val(selectedDay);\r\n");
      out.write("\r\n");
      out.write("    var option = '<option selected disabled value=\"\" >month</option>';\r\n");
      out.write("    var selectedMon =\"month\";\r\n");
      out.write("    for (var i=1;i <= 12;i++){\r\n");
      out.write("        option += '<option value=\"'+ i + '\">' + i + '</option>';\r\n");
      out.write("    }\r\n");
      out.write("    $('#month').append(option);\r\n");
      out.write("    $('#month').val(selectedMon);\r\n");
      out.write("\r\n");
      out.write("    var option = '<option selected disabled value=\"\">month</option>';\r\n");
      out.write("    var selectedMon =\"month\";\r\n");
      out.write("    for (var i=1;i <= 12;i++){\r\n");
      out.write("        option += '<option value=\"'+ i + '\">' + i + '</option>';\r\n");
      out.write("    }\r\n");
      out.write("    $('#month2').append(option);\r\n");
      out.write("    $('#month2').val(selectedMon);\r\n");
      out.write("  \r\n");
      out.write("    var d = new Date();\r\n");
      out.write("    var option = '<option selected disabled value=\"\">year</option>';\r\n");
      out.write("    selectedYear =\"year\";\r\n");
      out.write("    for (var i=1930;i <= d.getFullYear();i++){// years start i\r\n");
      out.write("        option += '<option value=\"'+ i + '\">' + i + '</option>';\r\n");
      out.write("    }\r\n");
      out.write("    $('#year').append(option);\r\n");
      out.write("    $('#year').val(selectedYear);\r\n");
      out.write("});\r\n");
      out.write("function isLeapYear(year) {\r\n");
      out.write("    year = parseInt(year);\r\n");
      out.write("    if (year % 4 != 0) {\r\n");
      out.write("	      return false;\r\n");
      out.write("	  } else if (year % 400 == 0) {\r\n");
      out.write("	      return true;\r\n");
      out.write("	  } else if (year % 100 == 0) {\r\n");
      out.write("	      return false;\r\n");
      out.write("	  } else {\r\n");
      out.write("	      return true;\r\n");
      out.write("	  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function change_year(select)\r\n");
      out.write("{\r\n");
      out.write("    if( isLeapYear( $(select).val() ) )\r\n");
      out.write("	  {\r\n");
      out.write("		    Days[1] = 29;\r\n");
      out.write("		    \r\n");
      out.write("    }\r\n");
      out.write("    else {\r\n");
      out.write("        Days[1] = 28;\r\n");
      out.write("    }\r\n");
      out.write("    if( $(\"#month\").val() == 2)\r\n");
      out.write("		    {\r\n");
      out.write("			       var day = $('#day');\r\n");
      out.write("			       var val = $(day).val();\r\n");
      out.write("			       $(day).empty();\r\n");
      out.write("			       var option = '<option value=\"day\">day</option>';\r\n");
      out.write("			       for (var i=1;i <= Days[1];i++){ //add option days\r\n");
      out.write("				         option += '<option value=\"'+ i + '\">' + i + '</option>';\r\n");
      out.write("             }\r\n");
      out.write("			       $(day).append(option);\r\n");
      out.write("			       if( val > Days[ month ] )\r\n");
      out.write("			       {\r\n");
      out.write("				          val = 1;\r\n");
      out.write("			       }\r\n");
      out.write("			       $(day).val(val);\r\n");
      out.write("		     }\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("function change_month(select) {\r\n");
      out.write("    var day = $('#day');\r\n");
      out.write("    var val = $(day).val();\r\n");
      out.write("    $(day).empty();\r\n");
      out.write("    var option = '<option value=\"day\">day</option>';\r\n");
      out.write("    var month = parseInt( $(select).val() ) - 1;\r\n");
      out.write("    for (var i=1;i <= Days[ month ];i++){ //add option days\r\n");
      out.write("        option += '<option value=\"'+ i + '\">' + i + '</option>';\r\n");
      out.write("    }\r\n");
      out.write("    $(day).append(option);\r\n");
      out.write("    if( val > Days[ month ] )\r\n");
      out.write("    {\r\n");
      out.write("        val = 1;\r\n");
      out.write("    }\r\n");
      out.write("    $(day).val(val);\r\n");
      out.write("}\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Sign Up</title>\r\n");
      out.write("    \r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Bootstrap/CSS/style1.css\">\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"font\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("    <div id=\"header\"></div>\r\n");
      out.write("   	<div class=\"header-adjustment\"></div>\r\n");
      out.write("        <div class = \"form-holder\">\r\n");
      out.write("            <h2 style=\"font-size: 45px;\">Fill up your details...</h2>\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"server-side-check\" ");
      out.print( request.getAttribute("existing_phone") );
      out.write(" >Phone no. already exists!</div>\r\n");
      out.write("            <div class=\"server-side-check\" ");
      out.print( request.getAttribute("existing_email") );
      out.write(" >Email ID already exists!</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <form action=\"Register\" name=\"form1\" class=\"needs-validation\" onsubmit=\"return pwd_validation()\" novalidate method=\"post\">\r\n");
      out.write("                <div class=\"row g-2 input-row\">\r\n");
      out.write("                    <div class=\"col-sm\" style=\"padding-right: 20px;\">\r\n");
      out.write("                        <div class=\"form-floating mb-3\" >\r\n");
      out.write("                            <input name=\"first-name\" type = \"text\" class = \"form-control\"  id = \"first-name\" placeholder=\"Mike\" required>\r\n");
      out.write("                            <label for = \"first-name\" style=\"opacity:70%;\">First name</label> \r\n");
      out.write("                            <div class=\"invalid-feedback\">\r\n");
      out.write("                                Enter first name\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"valid-feedback\">\r\n");
      out.write("                                Looks good!\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm\">\r\n");
      out.write("                        <div class=\"form-floating mb-3\" >\r\n");
      out.write("                            <input name=\"last-name\" type = \"text\" class = \"form-control\"  id = \"last-name\" placeholder=\"Hunt\" required>\r\n");
      out.write("                            <label for = \"last-name\" style=\"opacity:70%;\">Last name</label>\r\n");
      out.write("                            <div class=\"invalid-feedback\">\r\n");
      out.write("                                Enter last name\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"valid-feedback\">\r\n");
      out.write("                                Looks good!\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row g-2 input-row\">\r\n");
      out.write("                    <div class=\"col-sm\"  style=\"padding-right: 20px;\">\r\n");
      out.write("                        <div class=\"form-floating mb-3\" >\r\n");
      out.write("                             <input name=\"email\" type = \"email\" class = \"form-control\"  id = \"email\" placeholder=\"mikehunt@panda.com\" required>\r\n");
      out.write("                             <label for = \"email\" style=\"opacity:70%;\">Email ID</label> \r\n");
      out.write("\r\n");
      out.write("                             <div class=\"invalid-feedback\">\r\n");
      out.write("                                Enter valid email ID\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"valid-feedback\">\r\n");
      out.write("                                Looks good!\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm\">\r\n");
      out.write("                            <div class=\"form-floating mb-3\" >\r\n");
      out.write("                                <input name=\"phone\" type = \"tel\" class = \"form-control\"  id = \"phone\" pattern=\"^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$\" placeholder=\"123456789\" required>\r\n");
      out.write("                                <label for = \"phone\" style=\"opacity:70%;\">Phone No.</label> \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"invalid-feedback\">\r\n");
      out.write("                                    Enter valid phone no.\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"valid-feedback\">\r\n");
      out.write("                                    Looks good!\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row g-2 input-row\">\r\n");
      out.write("                            <div class=\"col-sm\" style=\"padding-right: 20px;\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <label class=\"form-label\" style=\"opacity:90%;\">DOB</label>\r\n");
      out.write("                                    <div class=\"col-sm\">\r\n");
      out.write("                                        <select id =\"day\" class=\"form-select\" name = \"dd\" required>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-sm\">    \r\n");
      out.write("                                        <select  id =\"month\" class=\"form-select\" name = \"mm\" onchange=\"change_month(this)\" required>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-sm\">\r\n");
      out.write("                                        <select id =\"year\" class=\"form-select\" name = \"yyyy\" onchange=\"change_year(this)\" required>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"col-sm\">\r\n");
      out.write("                                <label class=\"form-label\" style=\"opacity:90%;\">Gender</label>\r\n");
      out.write("                                <select id =\"gender\" class=\"form-select\" name = \"gender\" required>\r\n");
      out.write("                                    <option selected value=\"\" disabled>Choose...</option>\r\n");
      out.write("                                    <option value=\"male\">Male</option>\r\n");
      out.write("                                    <option value=\"female\">Female</option>\r\n");
      out.write("                                    <option value=\"others\">Casio WS-1400H-4AVDF-D272</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <div class=\"invalid-feedback\">\r\n");
      out.write("                                    Enter your gender\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"valid-feedback\">\r\n");
      out.write("                                    Looks good!\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"row g-2 input-row\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <label for=\"exampleFormControlTextarea1\" class=\"form-label\" style=\"opacity:70%;\">Address</label>\r\n");
      out.write("                                <textarea name=\"address\" class=\"form-control\" id=\"exampleFormControlTextarea1\" rows=\"3\" required></textarea>\r\n");
      out.write("                                <div class=\"invalid-feedback\">\r\n");
      out.write("                                    Enter your address\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"valid-feedback\">\r\n");
      out.write("                                    Looks good!\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row g-2 input-row\" style=\"padding-top: 30px;\">\r\n");
      out.write("                            <div class=\"col-sm\" style=\"padding-right: 20px;\">\r\n");
      out.write("                                <div class=\"form-floating mb-3\">\r\n");
      out.write("                                    <input name=\"password\" type = \"password\" class = \"form-control\"  id = \"password1\" placeholder=\"1234\" required>\r\n");
      out.write("                                    <label for = \"password\" style=\"opacity:70%;\">Password</label> \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm\">\r\n");
      out.write("                                <div class=\"form-floating mb-3\" >\r\n");
      out.write("                                    <input type = \"password\" class = \"form-control\"  id = \"password2\" placeholder=\"1234\" required>\r\n");
      out.write("                                    <label for = \"confirm-password\" style=\"opacity:70%;\">Confirm Password</label> \r\n");
      out.write("                                    <span class=\"invalid-feedback\" id=\"pwd-match\">\r\n");
      out.write("                                        \r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"col-sm\" style=\"padding: 20px 1px;\">\r\n");
      out.write("                            <div class=\"form-floating mb-3\" >\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-dark form-submit\">Sign in</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                \r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!---->\r\n");
      out.write("<script>\r\n");
      out.write("    // Example starter JavaScript for disabling form submissions if there are invalid fields\r\n");
      out.write("(() => {\r\n");
      out.write("'use strict'\r\n");
      out.write("\r\n");
      out.write("// Fetch all the forms we want to apply custom Bootstrap validation styles to\r\n");
      out.write("const forms = document.querySelectorAll('.needs-validation')\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// Loop over them and prevent submission\r\n");
      out.write("Array.from(forms).forEach(form => {\r\n");
      out.write("  form.addEventListener('submit', event => {\r\n");
      out.write("\r\n");
      out.write("    if (!form.checkValidity()) {\r\n");
      out.write("      event.preventDefault()\r\n");
      out.write("      event.stopPropagation()\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    form.classList.add('was-validated')\r\n");
      out.write("\r\n");
      out.write("  }, false)\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("})()\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    function pwd_validation(){\r\n");
      out.write("        var pw1 = document.getElementById(\"password1\").value;\r\n");
      out.write("        var pw2 = document.getElementById(\"password2\").value;\r\n");
      out.write("\r\n");
      out.write("        if(pw1 != pw2){\r\n");
      out.write("\r\n");
      out.write("            document.getElementById(\"pwd-match\").innerHTML=\"Password didn't match\";\r\n");
      out.write("            document.getElementById(\"password1\").value=\"\";\r\n");
      out.write("            document.getElementById(\"password2\").value=\"\";\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        else{\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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