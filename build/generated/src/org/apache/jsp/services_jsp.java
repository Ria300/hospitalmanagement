package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class services_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700,900\" rel=\"stylesheet\">\n");
      out.write("      <link href=\"https://fonts.googleapis.com/css?family=Oleo+Script\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("          \n");
      out.write("        .pb-60 {\n");
      out.write("\tpadding-bottom: 60px;\n");
      out.write("}\n");
      out.write(".pt-60 {\n");
      out.write("\tpadding-top: 60px;\n");
      out.write("}\n");
      out.write(".mb-60 {\n");
      out.write("\tmargin-bottom: 60px;\n");
      out.write("}\n");
      out.write("p {\n");
      out.write("\tfont-weight: 300;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("}\n");
      out.write(".section-title p {\n");
      out.write("\tfont-size: 24px;\n");
      out.write("\tfont-family: Oleo Script;\n");
      out.write("\tmargin-bottom: 0px;\n");
      out.write("}\n");
      out.write(".section-title h4 {\n");
      out.write("\tfont-size: 40px;\n");
      out.write("\ttext-transform: capitalize;\n");
      out.write("\tcolor: #FF5E18;\n");
      out.write("\tposition: relative;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tpadding-bottom: 25px;\n");
      out.write("}\n");
      out.write(".section-title h4::before {\n");
      out.write("\twidth: 80px;\n");
      out.write("\theight: 1.5px;\n");
      out.write("\tbottom: 0;\n");
      out.write("\tleft: 50%;\n");
      out.write("\tmargin-left: -40px;\n");
      out.write("}\n");
      out.write(".section-title h4::before, .section-title h4::after {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tcontent: \"\";\n");
      out.write("\tbackground-color: #FF5E18;\n");
      out.write("}\n");
      out.write(".section-title h4::after {\n");
      out.write("\twidth: 40px;\n");
      out.write("\theight: 1.5px;\n");
      out.write("\tbottom: -5px;\n");
      out.write("\tleft: 50%;\n");
      out.write("\tmargin-left: -20px;\n");
      out.write("}\n");
      out.write(".single_service.service_right {\n");
      out.write("\tpadding-right: 70px;\n");
      out.write("\tpadding-left: 0;\n");
      out.write("\ttext-align: right;\n");
      out.write("}\n");
      out.write(".single_service.service_right img {\n");
      out.write("\tright: 0;\n");
      out.write("\tleft: auto;\n");
      out.write("\tmargin-top: 0;\n");
      out.write("}\n");
      out.write(".single_service:nth-child(1), .single_service:nth-child(2) {\n");
      out.write("\tborder-bottom: 1px dashed #333;\n");
      out.write("\tpadding-bottom: 15px;\n");
      out.write("}\n");
      out.write(".single_service img {\n");
      out.write("\tmax-width: 45px;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tleft: 0;\n");
      out.write("\ttop: 0;\n");
      out.write("}\n");
      out.write(".single_service {\n");
      out.write("\tposition: relative;\n");
      out.write("\tpadding-left: 70px;\n");
      out.write("\tmargin-bottom: 35px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("<section class=\"services pt-60 pb-60\" id=\"services\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-xl-12\">\n");
      out.write("                  <div class=\"section-title text-center mb-60\">\n");
      out.write("                     <p>Best place for friends & family</p>\n");
      out.write("                     <h4>our services</h4>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-md-4 col-sm-12\">\n");
      out.write("                  <div class=\"single_service service_right\">\n");
      out.write("                     <img src=\"http://infinityflamesoft.com/html/restarunt-preview/assets/img/services/service-1.png\" alt=\"\">\n");
      out.write("                     <h4>Online Reservations</h4>\n");
      out.write("                     <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"single_service service_right\">\n");
      out.write("                     <img src=\"http://infinityflamesoft.com/html/restarunt-preview/assets/img/services/service-2.png\" alt=\"\">\n");
      out.write("                     <h4>Popular Dishes</h4>\n");
      out.write("                     <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"single_service service_right\">\n");
      out.write("                     <img src=\"http://infinityflamesoft.com/html/restarunt-preview/assets/img/services/service-3.png\" alt=\"\">\n");
      out.write("                     <h4>Online Order</h4>\n");
      out.write("                     <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-md-4 col-sm-12 text-center\">\n");
      out.write("                  <div class=\"single_mid\">\n");
      out.write("                     <img src=\"http://infinityflamesoft.com/html/restarunt-preview/assets/img/service_mid.png\" alt=\"\">\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-md-4 col-sm-12\">\n");
      out.write("                  <div class=\"single_service\">\n");
      out.write("                     <img src=\"http://infinityflamesoft.com/html/restarunt-preview/assets/img/services/service-4.png\" alt=\"\">\n");
      out.write("                     <h4>24/7 Service</h4>\n");
      out.write("                     <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"single_service\">\n");
      out.write("                     <img src=\"http://infinityflamesoft.com/html/restarunt-preview/assets/img/services/service-5.png\" alt=\"\">\n");
      out.write("                     <h4>Candle Light Dinner</h4>\n");
      out.write("                     <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"single_service\">\n");
      out.write("                     <img src=\"http://infinityflamesoft.com/html/restarunt-preview/assets/img/services/service-6.png\" alt=\"\">\n");
      out.write("                     <h4>Special Local Foods</h4>\n");
      out.write("                     <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </section>\n");
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
