package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/actors.html");
  }

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
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>JSP Page</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<link href=\"ullu/owl.theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"ullu/owl.carousel.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"ullu/owl.carousel.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"ullu/owl.transitions.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link href=\"css/seat.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/carosel-top.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/text.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  </head>\n");
      out.write("<style>\n");
      out.write("b{\n");
      out.write("font-family:cursive;\n");
      out.write("font-size: 20px;\n");
      out.write("}\n");
      out.write("#img{\n");
      out.write("position: absolute;\n");
      out.write("left: 0px;\n");
      out.write("top: 0px;\n");
      out.write("z-index: 2;\n");
      out.write("margin-top:12%; \n");
      out.write("margin-left:1%;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#btn{\n");
      out.write("position:absolute;\n");
      out.write("left: 0px;\n");
      out.write("top: 0px;\n");
      out.write("z-index: 1;\n");
      out.write("margin-top:10%; \n");
      out.write("margin-left:50%;\n");
      out.write("transition: transform.2s;\n");
      out.write("\n");
      out.write("}\n");
      out.write("#btn:hover{\n");
      out.write("transform: scale(1.5);\n");
      out.write("} \n");
      out.write(".caption{\n");
      out.write("position: absolute;\n");
      out.write("left: 0px;\n");
      out.write("top: 0px;\n");
      out.write("margin-top:20%;\n");
      out.write("margin-left:20%;\n");
      out.write("cursor: pointer;\n");
      out.write("font-size:20px;       \n");
      out.write("z-index:1;            \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("$(document).ready(function(){\n");
      out.write("\n");
      out.write("$(\"#owl\").owlCarousel({\n");
      out.write("    autoPlay:3000,\n");
      out.write("    pagination:false,\n");
      out.write("    items:4,\n");
      out.write("    itemsDesktop:[1199,3],\n");
      out.write("    itemsDesktopSmall:[979,3]\n");
      out.write("\n");
      out.write("});\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(document).ready(function(){\n");
      out.write("\n");
      out.write("\n");
      out.write("    var movie_id;\n");
      out.write("   $.getJSON(\"https://api.themoviedb.org/3/search/movie?api_key=370be6972dc90780d69d3fb2e0571d2a&query=pari\").then(function (response)\n");
      out.write("   {\n");
      out.write("       movie_id=response.result[0].id;\n");
      out.write("       \n");
      out.write("       $.getJSON(\"https://api.themoviedb.org/3/movie/\"+response.result[0].id+\"/images?api_key=370be6972dc90780d69d3fb2e0571d2a\").then(function (response)\n");
      out.write("       {\n");
      out.write("          console.log(\"chal ja bhai :\"+ response); \n");
      out.write("       });\n");
      out.write("   }); \n");
      out.write("\n");
      out.write("\n");
      out.write("});\n");
      out.write("\n");
      out.write("   \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"top\">\n");
      out.write("<img id=\"back\" class=\"img-responsive\" src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/v1520072765/blacky_fs8xfb.jpg\" alt=\"not found\" Style=\"width:100%; height:auto; opacity:0.8;\">      \n");
      out.write("<div class=\"bg\">\n");
      out.write("<li href=\"#\" id=\"btn\" class=\"fa fa-play-circle\" role=\"button\" data-toggle=\"modal\" data-target=\"#custom-modal\" style=\"font-size:100px;color:silver;\"></li>   \n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"custom-modal\" role=\"dialog\" >\n");
      out.write("<div class=\"modal-dialog \" style=\"width:100%; height:auto; \">\n");
      out.write("<div class=\"modal-content\" style=\"background-color:black; \">\n");
      out.write("<div class=\"modal-header\">\n");
      out.write("<button type=\"button\" class=\"close\" data-dismiss=\"modal\">close</button>\n");
      out.write("</div>\n");
      out.write("<div class=\"modal-body\">\n");
      out.write("<center><iframe id=\"video\" style=\"width:100%; height:500px\" src=\"https://www.youtube.com/embed/xjDjIWPwcPU?rel=0&amp;autoplay=1\" autoplay:1 color:white ></iframe></center>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"caption\">\n");
      out.write("<div class=\" label label-info \" style=\"margin-left:10%; color:white;\">Action</div>   \n");
      out.write("<div class=\" label label-info\" style=\"margin-left:10%; color:white; \">Adventure</div>   \n");
      out.write("<div class=\" label label-info\" style=\"margin-left:10%; color:white; \">Fantasy</div>   \n");
      out.write("</div>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("<img class=\"img-responsive\" id=\"img\" src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/c_scale,q_99,w_241/v1520160948/poster_kgkl4b.jpg\" alt=\"not found\" Style=\"width:20%; height:auto;\" >\n");
      out.write("</div>\n");
      out.write("<br><br><br><br><br>        \n");
      out.write("\n");
      out.write("<div class=\"container-fluid\" >        \n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("<h2><span>Please Select a Theater</span></h2>\t\n");
      out.write("\n");
      out.write("<div class=\"panel panel-default\">\n");
      out.write("\n");
      out.write("<div class=\"panel-header\" style=\"background-color:lavender; font-family:cursive; font-size:35px;text-align:center;  \"><B>Ticket Available</b></div>\n");
      out.write("\n");
      out.write("<div class=\"panel-body\">\n");
      out.write("<p><b>Saket PVR  </b>\n");
      out.write("<a href=\"#\"class=\"btn btn-lg\" onclick=\"openNav()\">  9:10 am</a> \n");
      out.write("<a href=\"#\"class=\"btn btn-lg\" onclick=\"openNav()\">  9:10 am</a> \n");
      out.write("<a href=\"#\"class=\"btn btn-lg\" onclick=\"openNav()\">  9:10 am</a> \n");
      out.write("<a href=\"#\"class=\"btn btn-lg\" onclick=\"openNav()\">  9:10 am</a> \n");
      out.write("<a href=\"#\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">book now</a>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("<div class=\"col-sm-4\" >\n");
      out.write("\n");
      out.write("<div class=\"card bg-primary text-white\">\n");
      out.write("<div class=\"card-header\" style=\"font-size:30px\" >Cast & Crew</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"card-body\">\n");
      out.write("<b><i><h3>Plot</h3></i></b>\n");
      out.write("<div class=\"text text-muted\" style=\"font-size:20px;  \" >\n");
      out.write("<i> After the death of his father, T'Challa returns home to the African nation of Wakanda to take his rightful place as king. When a powerful enemy suddenly reappears, T'Challa's mettle as king -- and as Black Panther -- gets tested when he's drawn into a conflict that puts the fate of Wakanda and the entire world at risk. Faced with treachery and danger, the young king must rally his allies and release the full power of Black Panther to defeat his foes and secure the safety of his people.</i>    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div></div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-4\">\n");
      out.write("<div class=\"card\" style=\"background-color: lavender;\">\n");
      out.write("<div class=\"card-header\"></div>\n");
      out.write("<div class=\"card-body\">\n");
      out.write("<button class=\"btn btn-block btn-danger\">CORPORATE BOOKING</button>\n");
      out.write("</div>\n");
      out.write("<h4>Related News</h4>\n");
      out.write("<b>An Ancient Time Warrior of Waganda</b>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-lg-12 col-sm-12\">\n");
      out.write("    <div class=\"text bg-primary\"><h1>Cast</h1></div> \n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<link href=\"ullu/owl.theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"ullu/owl.carousel.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<script src=\"ullu/owl.carousel.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"ullu/owl.transitions.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<script>\r\n");
      out.write("            \r\n");
      out.write("   $(document).ready(function(){\r\n");
      out.write("  \r\n");
      out.write("        $(\"#owl\").owlCarousel({\r\n");
      out.write("            autoPlay:3000,\r\n");
      out.write("            pagination:false,\r\n");
      out.write("            items:4,\r\n");
      out.write("            itemsDesktop:[1199,3],\r\n");
      out.write("            itemsDesktopSmall:[979,3]\r\n");
      out.write("            \r\n");
      out.write("        });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("  <body>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"owl\" class=\"owl-carousel owl-theme\" style=\"max-height:200px; z-index:-1;  \">\r\n");
      out.write("    <div class=\"item\"><img src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/v1515837735/hmcdtnvumi5wshd5n3wp.jpg\" alt=\"404\" width=\"300px\" height=\"200px\"></div>\r\n");
      out.write("    <div class=\"item\"><img src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/v1515837735/hmcdtnvumi5wshd5n3wp.jpg\" alt=\"404\" width=\"300px\" height=\"200px\"></div>\r\n");
      out.write("    <div class=\"item\"><img src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/v1515837735/hmcdtnvumi5wshd5n3wp.jpg\" alt=\"404\" width=\"300px\" height=\"200px\"></div>\r\n");
      out.write("    <div class=\"item\"><img src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/v1515837735/hmcdtnvumi5wshd5n3wp.jpg\" alt=\"404\" width=\"300px\" height=\"200px\"></div>\r\n");
      out.write("    <div class=\"item\"><img src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/v1515837735/hmcdtnvumi5wshd5n3wp.jpg\" alt=\"404\" width=\"300px\" height=\"200px\"></div>\r\n");
      out.write("    <div class=\"item\"><img src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/v1515837735/hmcdtnvumi5wshd5n3wp.jpg\" alt=\"404\" width=\"300px\" height=\"200px\"></div>\r\n");
      out.write("    <div class=\"item\"><img src=\"http://res.cloudinary.com/warmachinewarrior/image/upload/v1515837735/hmcdtnvumi5wshd5n3wp.jpg\" alt=\"404\" width=\"300px\" height=\"200px\"></div>\r\n");
      out.write("   \r\n");
      out.write("</div>\r\n");
      out.write("<!--  <center><a href=\"#\" id=\"prev\">Prev</a> | <a href=\"#\" id=\"next\">Next</a></center>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("<div class=\"card-footer\">\n");
      out.write("<div class=\"text text bg-primary\"><h1>Crew</h1></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("   <!--            \n");
      out.write("</div>-->\n");
      out.write("\n");
      out.write("<!--        \n");
      out.write("   -->\n");
      out.write("<!--            <p><b>DLF Promnade Vsant Kunj</b>\n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  11:10 am</a> \n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  2:10 pm</a> \n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  5:10 pm</a> \n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  7:10 pm</a></p><hr> \n");
      out.write("\n");
      out.write("    <p><b>DLf Select City Walk</b>\n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  11:10 am</a> \n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  2:10 pm</a> \n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  5:10 pm</a> \n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  7:10 pm</a></p><hr> \n");
      out.write("\n");
      out.write("    <p><b>Ambience Mall Gurugram</b>\n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  11:10 am</a> \n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  2:10 pm</a> \n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  5:10 pm</a> \n");
      out.write("   <a href=\"#\"class=\"btn btn-lg\">  7:10 pm</a></p><hr> -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("<div class=\"modal-dialog \" style=\"width:80%; height:auto;\">\n");
      out.write("<div class=\"modal-content\">\n");
      out.write("<div class=\"modal-header\">\n");
      out.write("  <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("  <h4 class=\"modal-title\">Modal Header</h4>\n");
      out.write("</div>\n");
      out.write("<div class=\"modal-body\">\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("<nav class=\"navbar navbar-default \" style=\"background-color:black; text-align:center;  \" >\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("<div class=\"navbar-header\">\n");
      out.write("</div>\n");
      out.write("<!-- <ul class=\"nav navbar-nav pull-right\"> -->\n");
      out.write("<!-- <li class=\"active\"><a href=\"#\">Home</a></li> -->\n");
      out.write("<!-- <li><a href=\"#\">Page 1</a></li> -->\n");
      out.write("<!-- <li><a href=\"#\">Page 2</a></li> -->\n");
      out.write("<!-- <li><a href=\"#\">Page 3</a></li> -->\n");
      out.write("<!-- </ul> -->\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("<marquee direction=\"left\" style=\"font-size:20px;\">\n");
      out.write("<span style=\"font-size:20px;\"><b><i>Watch Awesome Movie</b></i></span>\n");
      out.write("<span style=\"font-size:20px; color:blue;\"><i>Exclusive Shows</i></span>\n");
      out.write("<span style=\"font-size:20px; \"><u>Action</u></span>\n");
      out.write("<span style=\"font-size:20px;\"><b>Drama</b></span>\n");
      out.write("<span style=\"font-size:20px;\">Comedy</span>\n");
      out.write("<span style=\"font-size:20px; color:red;\">Romance</span>\n");
      out.write("<span style=\"font-size:20px;\"><u><i><b>only on Dekho Movie Dil se<b/></i></u></span>\n");
      out.write("</marquee>   \n");
      out.write("\n");
      out.write("<div class=\"col-sm-8\" > \n");
      out.write("\n");
      out.write("<div class=\"card\" style=\"\">\n");
      out.write("<div class=\"card-header\">\n");
      out.write("<center><label style=\"font-size:40px;background-color:Black;color:white;margin-top:0.5%; \">ALL Eyes Here</label></center>          </div>\n");
      out.write("<div class=\"card-body\" style=\"margin-top:1%;\">\n");
      out.write("<input id=\"three\" type=\"checkbox\">\n");
      out.write("<label for=\"three\">C1</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"card-footer\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div> \n");
      out.write("\n");
      out.write("<div class=\"col-sm-4\">\n");
      out.write("<h1 style=\"text-align:center; color:black; box-shadow: 5px 10px 70px #333333;\">BlankSpace</h1> \n");
      out.write("</div> \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Use any element to open/show the overlay navigation menu -->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function openNav() {\n");
      out.write("document.getElementById(\"myNav\").style.width = \"100%\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Close when someone clicks on the \"x\" symbol inside the overlay */\n");
      out.write("function closeNav() {\n");
      out.write("document.getElementById(\"myNav\").style.width = \"0%\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</body>\n");
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