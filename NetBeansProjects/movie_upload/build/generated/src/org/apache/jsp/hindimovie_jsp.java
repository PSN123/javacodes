package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hindimovie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("        @font-face {\n");
      out.write("    font-family: myFirstFont;\n");
      out.write("    src: url(sansation_light.woff);\n");
      out.write("}\n");
      out.write("h1:hover{\n");
      out.write("    font-family: serif;\n");
      out.write("    font-style: oblique;\n");
      out.write("    cursor: pointer;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("   <div class=\"card bg-primary text-white\">         \n");
      out.write("<div class=\"card-header\">\n");
      out.write("    <h1>Upload Movie Details</h1>\n");
      out.write("</div></div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <form  action=\"uploader\" method=\"post\" enctype=\"multipart/form-data\">   \n");
      out.write("                  <div class=\"form-group\">  \n");
      out.write("                      <label class=\"control-label \">Movie Title:</label>\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"Enter movie name here\" name=\"movie\">\n");
      out.write("                   </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">  \n");
      out.write("                      <label class=\"control-label \">Poster:</label>\n");
      out.write("                  <input class=\"form-control\" type=\"file\"  name=\"poster\">\n");
      out.write("                   </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">  \n");
      out.write("                      <label class=\"control-label \">Banner:</label>\n");
      out.write("                  <input class=\"form-control\" type=\"file\"  name=\"banner\">\n");
      out.write("                   </div>\n");
      out.write("            <div class=\"card bg-primary\">\n");
      out.write("                    <div class=\"card-footer\"> \n");
      out.write("                    <input type=\"submit\" class=\"btn btn-lg btn-primary\" value=\"Submit\" > \n");
      out.write("               </div></div>\n");
      out.write("                    </form>\n");
      out.write("            </div>\n");
      out.write("               </div>\n");
      out.write("  \n");
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
