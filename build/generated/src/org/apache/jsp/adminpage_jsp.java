package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>reset</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Tangerine\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("form {border: 3px solid #f1f1f1;}\n");
      out.write(".navbar {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("   width:1500;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("h1 {\n");
      out.write("  padding: 12px 40px;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write(".navbar a {\n");
      out.write("  float: right;\n");
      out.write("  font-size: 20px;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 40px 26px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".navbar a:hover, .dropdown:hover .dropbtn {\n");
      out.write("  background-color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("body, html \n");
      out.write("{\n");
      out.write("    height: 100%;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg-img {\n");
      out.write("    \n");
      out.write("    background-image: url(\"h21.jpg\");\n");
      out.write("    height: 600px;\n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("    position: relative;\n");
      out.write("    top: -20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    position: absolute;\n");
      out.write("    left: 0;\n");
      out.write("    margin: 10px;\n");
      out.write("    max-width: 400px;\n");
      out.write("    padding: 15px;\n");
      out.write("    background-color: white;\n");
      out.write("}\n");
      out.write(".imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);\n");
      out.write("  max-width: 400px;\n");
      out.write("  margin: auto;\n");
      out.write("  text-align: center;\n");
      out.write("  font-family: arial;\n");
      out.write("  float:left;\n");
      out.write("  background-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title {\n");
      out.write("  color: black;\n");
      out.write("  font-size: 23px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"navbar\">\n");
      out.write("        <a href=\"main.jsp\">LOGOUT</a>\n");
      out.write("<a href=\"#home\">VIEW CONTACTS</a>\n");
      out.write("    <a href=\"home29.jsp\">VIEW BILLS</a>\n");
      out.write("  <a href=\"#home\">VIEW FEEDBACKS</a>\n");
      out.write(" \n");
      out.write("<h1 style=\"font-family:courier;\">HOSPITAL  MANAGEMENT</h1></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       <div class=\"bg-img\">\n");
      out.write("          \n");
      out.write("           <br><br>\n");
      out.write("          \n");
      out.write("<div class=\"card\">\n");
      out.write("  <img src=\"h32.png\" alt=\"John\" style=\"width:100%;height:300px;\">\n");
      out.write("  <h1 style=\"color:black\">ADMIN</h1>\n");
      out.write("  <p class=\"title\">Managing Activities</p>\n");
      out.write("  <h3 style=\"color:black\">Doctors and Patients added by Admin </h3>\n");
      out.write("  <div style=\"margin: 24px 0;\">\n");
      out.write("    <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a> \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
