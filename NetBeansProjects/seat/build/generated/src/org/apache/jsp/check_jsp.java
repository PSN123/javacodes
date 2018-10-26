package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class check_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

int c,j;
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
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<style>\n");
      out.write(" @charset \"UTF-8\";\n");
      out.write("@import url(https://fonts.googleapis.com/css?family=Raleway);\n");
      out.write("* {\n");
      out.write("  font-family: \"Raleway\", sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  height: 100vh;\n");
      out.write("  width: 100%;\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: center;\n");
      out.write("  align-items: center;\n");
      out.write("  flex-direction: column;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-size: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("label input[type=\"checkbox\"] {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("label input[type=\"checkbox\"] + .label-text:before {\n");
      out.write("  display: inline-block;\n");
      out.write("  transition: all 0.2s ease-in-out;\n");
      out.write("  margin: -6px 15px 0 0;\n");
      out.write("  vertical-align: middle;\n");
      out.write("  width: 30px;\n");
      out.write("  height: 30px;\n");
      out.write("  background: #ecf0f1;\n");
      out.write("  border: 2px solid #3498db;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  color: #ecf0f1;\n");
      out.write("  content: \"\";\n");
      out.write("}\n");
      out.write("label input[type=\"checkbox\"]:checked + .label-text:before {\n");
      out.write("  background: #FF4C4C;\n");
      out.write("  text-align: center;\n");
      out.write("  line-height: 1em;\n");
      out.write("  color: #ecf0f1;\n");
      out.write("  content: \"B\";\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("/*       .seat-select{\n");
      out.write("        height: 50px;\n");
      out.write("        width:30px;\n");
      out.write("        cursor:pointer;\n");
      out.write("       position:relative;\n");
      out.write("   transition: transform .2s;  Animation \n");
      out.write("    \n");
      out.write("       }\n");
      out.write("   \n");
      out.write("    .seat-select:hover {\n");
      out.write("    -ms-transform: scale(1.5);  //IE 9 \n");
      out.write("    -webkit-transform: scale(1.5); // Safari 3-8\n");
      out.write("    transform: scale(1.5); \n");
      out.write("     background-color:#049def;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=checkbox]:checked \n");
      out.write("{\n");
      out.write("              animation-name: rubberBand;\n");
      out.write("      animation-duration: 1000ms;\n");
      out.write("      animation-fill-mode: both;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("@keyframes rubberBand {\n");
      out.write("  0% {\n");
      out.write("    -webkit-transform: scale3d(1, 1, 1);\n");
      out.write("            transform: scale3d(1, 1, 1);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  30% {\n");
      out.write("    -webkit-transform: scale3d(1.25, 0.75, 1);\n");
      out.write("            transform: scale3d(1.25, 0.75, 1);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  40% {\n");
      out.write("    -webkit-transform: scale3d(0.75, 1.25, 1);\n");
      out.write("            transform: scale3d(0.75, 1.25, 1);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  50% {\n");
      out.write("    -webkit-transform: scale3d(1.15, 0.85, 1);\n");
      out.write("            transform: scale3d(1.15, 0.85, 1);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  65% {\n");
      out.write("    -webkit-transform: scale3d(.95, 1.05, 1);\n");
      out.write("            transform: scale3d(.95, 1.05, 1);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  75% {\n");
      out.write("    -webkit-transform: scale3d(1.05, .95, 1);\n");
      out.write("            transform: scale3d(1.05, .95, 1);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  100% {\n");
      out.write("    -webkit-transform: scale3d(1, 1, 1);\n");
      out.write("            transform: scale3d(1, 1, 1);\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".rubberBand {\n");
      out.write("  -webkit-animation-name: rubberBand;\n");
      out.write("          animation-name: rubberBand;\n");
      out.write("}*/\n");
      out.write("\n");
      out.write("       </style>\n");
      out.write("</head>\n");
      out.write("      \n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-md-8\" style=\"background-color: lavender; font-size:20px; text-align: center; \">partytime\n");
      out.write(" <div class=\"panel-header\"></div>\n");
      out.write(" <div class=\"panel-body\">   \n");
      out.write(" <center>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("    <div class=\"container\" style=\"margin-top: 5%;\">\n");
      out.write("        ");
      out.write("\n");
      out.write("   \n");
      out.write("          \n");
      out.write("      ");

int a=Integer.parseInt(request.getParameter("row")) ;
int b=Integer.parseInt(request.getParameter("Coloums")) ;
         
   for (c= 65; c <= 64+a; c++){
       
        for(j=1;j<b+1;j++){
            
      out.write("\n");
      out.write("\n");
      out.write("          <label for=\"checkbox\">\n");
      out.write("            <input id=\"checkbox\" type=\"checkbox\" name=\"checkbox\"  id=\"");
      out.print((char)c+""+j);
      out.write("\" value=\"");
      out.print((char)c+""+j+",200");
      out.write('"');
      out.write('>');
      out.print((char)c+""+j);
      out.write("\n");
      out.write("<span class=\"label-text\"></span>\n");
      out.write("</label> \n");
      out.write("\n");
      out.write("  ");

              
}System.out.println();

      out.write("\n");
      out.write("<br>\n");

}     

     
      out.write("  \n");
      out.write("     </div>\n");
      out.write("</center>\n");
      out.write("</div></div>\n");
      out.write("     \n");
      out.write("     <div class=\"col-md-4\">\n");
      out.write("     <h4><b>No.of Tickets:</b><span id=\"name\"></span> </h4>\n");
      out.write("                            <h4><b>Amount:</b><span id=\"price\"></span></h4>\n");
      out.write("                       </div>\n");
      out.write("    \n");
      out.write("</div></div>\n");
      out.write("   <script>\n");
      out.write("         \n");
      out.write("               var seatname;\n");
      out.write("  var seatprice = 0;\n");
      out.write("  var seatvalue;\n");
      out.write("var temp=[];\n");
      out.write("var count=1;\n");
      out.write("\n");
      out.write("  $(function()\n");
      out.write("  {\n");
      out.write("     $('.seat-select').click(function ()\n");
      out.write("     {\n");
      out.write("              if($('input[type=checkbox]:checked').length>=0  && $(this).is(':checked')) \n");
      out.write("              {\n");
      out.write("                  \n");
      out.write("                      seatprice = 0;\n");
      out.write("        seatname=0;\n");
      out.write("      \n");
      out.write("        $('input[type=checkbox]:checked').each(function (index, value) { \n");
      out.write(" \n");
      out.write("          \n");
      out.write("        seatvalue=$(this).attr('value');\n");
      out.write("          console.log(seatvalue.split(\",\"));\n");
      out.write("          temp =seatvalue.split(\",\");\n");
      out.write("          seatname +=parseInt(temp[0].length-1);\n");
      out.write("\n");
      out.write("         seatprice += parseInt(temp[1]);\n");
      out.write("         \n");
      out.write("         console.log(seatname);\n");
      out.write("         console.log(seatprice);\n");
      out.write("\n");
      out.write("        $(\"#name\").text(seatname);\n");
      out.write("        $(\"#price\").text(seatprice);\n");
      out.write("\n");
      out.write("         });\n");
      out.write("        \n");
      out.write("        }     \n");
      out.write("    else\n");
      out.write("   {\n");
      out.write("       \n");
      out.write("            seatvalue=$(this).attr('value');\n");
      out.write("           temp =seatvalue.split(\",\");\n");
      out.write("          seatname -= parseInt(temp[0].length-1);\n");
      out.write("\n");
      out.write("         seatprice-= parseInt(temp[1]);\n");
      out.write("         \n");
      out.write("        $(\"#name\").text(seatname);\n");
      out.write("        $(\"#price\").text(seatprice);\n");
      out.write("    }\n");
      out.write("     }); \n");
      out.write("  });\n");
      out.write("\n");
      out.write("    \n");
      out.write("     </script>   \n");
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
