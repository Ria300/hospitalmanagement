package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>reset</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Poppins:400,500,600,800,900%7cRaleway:300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .pb-100 {\n");
      out.write("\tpadding-bottom: 100px;\n");
      out.write("}\n");
      out.write(".pt-100 {\n");
      out.write("\tpadding-top: 100px;\n");
      out.write("}\n");
      out.write(".mb-100 {\n");
      out.write("\tmargin-bottom: 100px;\n");
      out.write("}\n");
      out.write("a {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor: #333;\n");
      out.write("\t-webkit-transition: .4s;\n");
      out.write("\ttransition: .4s;\n");
      out.write("}\n");
      out.write(".section-title {\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write(".section-title p {\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tmargin-bottom: 5px;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("}\n");
      out.write(".section-title h4 {\n");
      out.write("\tfont-size: 40px;\n");
      out.write("\tfont-weight: 600;\n");
      out.write("\ttext-transform: capitalize;\n");
      out.write("\tposition: relative;\n");
      out.write("\tpadding-bottom: 20px;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("}\n");
      out.write(".section-title h4::before {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tcontent: \"\";\n");
      out.write("\twidth: 80px;\n");
      out.write("\theight: 2px;\n");
      out.write("\tbackground-color: #d8d8d8;\n");
      out.write("\tbottom: 0;\n");
      out.write("\tleft: 50%;\n");
      out.write("\tmargin-left: -40px;\n");
      out.write("}\n");
      out.write(".section-title h4::after {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tcontent: \"\";\n");
      out.write("\twidth: 50px;\n");
      out.write("\theight: 2px;\n");
      out.write("\tbackground-color: #FF7200;\n");
      out.write("\tleft: 0;\n");
      out.write("\tbottom: 0;\n");
      out.write("\tleft: 50%;\n");
      out.write("\tmargin-left: -25px;\n");
      out.write("}\n");
      out.write(".contact {\n");
      out.write("\tbackground-image: url(\"h21.jpg\");\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-position: center;\n");
      out.write("\tbackground-attachment: fixed;\n");
      out.write("\tposition: relative;\n");
      out.write("\tz-index: 2;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write(".contact-form input,\n");
      out.write("textarea {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tborder: 1px solid #555;\n");
      out.write("\tpadding: 5px 10px;\n");
      out.write("\ttext-transform: capitalize;\n");
      out.write("\tmargin-top: 15px;\n");
      out.write("\tbackground-color: transparent;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write(".contact:before {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tcontent: \"\";\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100%;\n");
      out.write("\tleft: 0;\n");
      out.write("\ttop: 0;\n");
      out.write("\tbackground-color: #333;\n");
      out.write("\tz-index: -1;\n");
      out.write("\topacity: .85;\n");
      out.write("\t-ms-filter: \"progid:DXImageTransform.Microsoft.Alpha(Opacity=85)\";\n");
      out.write("}\n");
      out.write(".single-contact {\n");
      out.write("\ttext-align: left;\n");
      out.write("\tposition: relative;\n");
      out.write("\tpadding-left: 70px;\n");
      out.write("\tmargin-bottom: 50px;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("}\n");
      out.write(".single-contact i.fa {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tleft: 0;\n");
      out.write("\ttop: 50%;\n");
      out.write("\t-webkit-transform: translateY(-50%);\n");
      out.write("\t        transform: translateY(-50%);\n");
      out.write("\tbackground-color: #FF7200;\n");
      out.write("\twidth: 40px;\n");
      out.write("\theight: 40px;\n");
      out.write("\tline-height: 40px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tborder-radius: 3px;\n");
      out.write("}\n");
      out.write(".single-contact h5 {\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("\tfont-weight: 500;\n");
      out.write("}\n");
      out.write(".single-contact p {\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("}\n");
      out.write(".contact-form input[type=\"submit\"] {\n");
      out.write("\tbackground-color: #FF7200;\n");
      out.write("\tborder: 0px;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\t-webkit-transition: .4s;\n");
      out.write("\ttransition: .4s\n");
      out.write("}\n");
      out.write(".contact-form input[type=\"submit\"]:hover {\n");
      out.write("\tbackground-color: #CC5B00\n");
      out.write("}\n");
      out.write(".contact-form input:focus, textarea:focus {\n");
      out.write("\tborder-color: #CC5B00\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("    <section class=\"contact pt-100 pb-100\" id=\"contact\">\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-xl-6 mx-auto text-center\">\n");
      out.write("                  <div class=\"section-title mb-100\">\n");
      out.write("                     <p>get in touch</p>\n");
      out.write("                     <h4>CONTACT US</h4>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row text-center\">\n");
      out.write("                  <div class=\"col-md-8\">\n");
      out.write("                     <form action=\"ContactController\" method=\"post\" class=\"contact-form\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                           <div class=\"col-xl-6\">\n");
      out.write("                              <input type=\"text\" placeholder=\"name\" name=\"name2\">\n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"col-xl-6\">\n");
      out.write("                              <input type=\"text\" placeholder=\"email\" name=\"email\">\n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"col-xl-6\">\n");
      out.write("                              <input type=\"text\" placeholder=\"subject\" name=\"subject\">\n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"col-xl-6\">\n");
      out.write("                              <input type=\"text\" placeholder=\"telephone\" name=\"phone\">\n");
      out.write("                           </div>\n");
      out.write("                           <div class=\"col-xl-12\">\n");
      out.write("                              <textarea placeholder=\"message\" cols=\"30\" rows=\"10\" name=\"tarea3\"></textarea>\n");
      out.write("                              <input type=\"submit\" value=\"send message\">\n");
      out.write("                           </div>\n");
      out.write("                        </div>\n");
      out.write("                     </form>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-4\">\n");
      out.write("                     <div class=\"single-contact\">\n");
      out.write("                        <i class=\"fa fa-map-marker\"></i>\n");
      out.write("                        <h5>Address</h5>\n");
      out.write("                        <p>Sec-12, PGI, Chandigarh</p>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"single-contact\">\n");
      out.write("                        <i class=\"fa fa-phone\"></i>\n");
      out.write("                        <h5>Phone</h5>\n");
      out.write("                        <p>(+1) 517 397 7100</p>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"single-contact\">\n");
      out.write("                        <i class=\"fa fa-envelope\"></i>\n");
      out.write("                        <h5>Email</h5>\n");
      out.write("                        <p>pgi@gmail.com</p>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </section>\n");
      out.write("</body>\n");
      out.write("</html>");
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
