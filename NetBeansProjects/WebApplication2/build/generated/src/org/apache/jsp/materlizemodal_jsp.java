package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class materlizemodal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css\">\n");
      out.write("   <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("   <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("      \n");
      out.write("  <!-- Compiled and minified JavaScript -->\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("      <input type=\"text\" placeholder=\"enter your suffering\" id=\"search\"/>\n");
      out.write("    <input type=\"button\" id=\"search_it\" value=\"search\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<script>\n");
      out.write("        $(document).ready(function ()\n");
      out.write("        {\n");
      out.write("                 $('#search_it').click(function ()\n");
      out.write("                {\n");
      out.write("                    var data=$('#search').val();\n");
      out.write("        function callApi()\n");
      out.write("  {\n");
      out.write("      $.getJSON('https://www.googleapis.com/youtube/v3/search?key=AIzaSyA4WfDOOcQVvG9qfsf-erOK5nCY51ZoOUA&part=snippet&maxResults=5&q='+data+'&type=video').\n");
      out.write("              then(function (response) \n");
      out.write("      {\n");
      out.write("         console.log(response.items);\n");
      out.write("\n");
      out.write("         for( x in response.items )\n");
      out.write("        {\n");
      out.write("             $(\"#abc\").append(\"<iframe width='600' height='480' src='https://www.youtube.com/embed/\"+response.items[x].id.videoId+\"' frameborder='0' allow='autoplay; encrypted-media' allowfullscreen></iframe>\");\n");
      out.write("             console.log(response.items[x].id.videoId);\n");
      out.write("             \n");
      out.write("     $(\"#video_id\").append()\n");
      out.write("        }\n");
      out.write("             \n");
      out.write("\n");
      out.write("    });\n");
      out.write("  }\n");
      out.write("             callApi();     \n");
      out.write("                });\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        });\n");
      out.write("         \n");
      out.write("      \n");
      out.write("        </script>\n");
      out.write("    <body>\n");
      out.write("<a class=\"waves-effect waves-light btn modal-trigger\" href=\"#modal1\">modal</a>\n");
      out.write("<div id=\"modal1\" class=\"modal bottom-sheet\"> \n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("<div id=\"abc\"></div>\n");
      out.write("</div>\n");
      out.write("<div class=\"modal-footer\" >\n");
      out.write("    <a href=\"#\" class=\"modal-action modal-close waves-effect btn-flat\">Agree</a>\n");
      out.write("</div>  \n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("       $('.modal').modal(); \n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    \n");
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
