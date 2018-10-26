package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class facebook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#eeeff4;\">\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse \" style=\"height:85px;background-color:#3b5998;\">\n");
      out.write("   \n");
      out.write("  <div class=\"row\">\n");
      out.write("\n");
      out.write("  <div class=\"col-lg-5\"> \n");
      out.write(" <div class=\"navbar-header\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\" style=\"color:white; margin-left:150px;margin-top:25px;font-size:40px;font-family:klavika Bold;\">\n");
      out.write("  <b>facebook</b></a>\n");
      out.write("  </div>\n");
      out.write(" </div> \n");
      out.write("   \n");
      out.write(" <div class=\"col-lg-3\">\n");
      out.write(" <form><label style=\"color:white;font-size:10px; margin-left:37%\">Username or phone</label> \n");
      out.write(" <input  type=\"text\" placeholder=\"enter email or phone\" required style=\"margin-left:37%;margin-top:-1px\";></input></form> \n");
      out.write("  </div> \t\n");
      out.write(" <div class=\"col-lg-3\"> \n");
      out.write("<form><label style=\"color:white; margin-left:1%; margin-top:15px; \">Password</label><br> \n");
      out.write(" <input  type=\"text\" placeholder=\"password\" required style=\"margin-right:20%;\"></input> \n");
      out.write("  <input  type=\"button\" value=\"log in\" style=\"float:right;background-color:#3b5998;margin-right:40px;color:white;\">  \n");
      out.write(" <a href=\"#\" style=\" margin-left:10px;text-size:1px;color:white;\">forgot password?</a></form> \n");
      out.write("</div> \n");
      out.write("</div> \n");
      out.write("</nav>\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-lg-6\"> \n");
      out.write("<b style=\"font-size:25px;\"> Facebook helps you connect and share with<br> the people in your life.</b>\n");
      out.write("<div class=\"container\">\n");
      out.write("<img src=\"Capture.png\" class=\"img-rounded\" alt=\"not found\" width=\"50%\" height=\"30%\" style=\"padding-right:60px;\">\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-lg-6\">\n");
      out.write("<h1 style=\"margin-top:-10px;\">Create an account</h1>\n");
      out.write("<small >it's free and always be.</small><br>\n");
      out.write("<input type=\"text\" placeholder=\"Name\" style=\"margin-top:10px\">\n");
      out.write("<input type=\"text\" placeholder=\"Surname\" style=\"margin-top:10px\"><br>\n");
      out.write("<input type=\"text\" placeholder=\"Mobile Number or Email address\"  style=\"margin-top:10px;float:right;width:350px;\"><br>\n");
      out.write("<input type=\"text\" placeholder=\"New Password\"  style=\"margin-top:10px;float:right;width:350px;\"><br>\n");
      out.write("<h4 style=\"padding-top:10px; padding-bottom:-0px; font-size:20px \">Birthday</h4>\n");
      out.write("<select id=\"p\">\n");
      out.write("<option >0</option> \n");
      out.write(" <option >1</option> \n");
      out.write("<option >2</option> \n");
      out.write(" <option >3</option>\n");
      out.write(" <option >4</option> \n");
      out.write("<option >5</option> \n");
      out.write("<option >6</option> \n");
      out.write(" <option >7</option> \n");
      out.write(" <option >8</option> \n");
      out.write(" <option >9</option> \n");
      out.write("<option >10</option> \n");
      out.write("<!-- <option >11</option> -->\n");
      out.write("<!-- <option >12</option> -->\n");
      out.write("<!-- <option >13</option> -->\n");
      out.write("<!-- <option >14</option> -->\n");
      out.write("<!-- <option >15</option> -->\n");
      out.write("<!-- <option >16</option> -->\n");
      out.write("<!-- <option >17</option> -->\n");
      out.write("<!-- <option >18</option> -->\n");
      out.write("<!-- <option >19</option> -->\n");
      out.write("<!-- <option >20</option> -->\n");
      out.write("<!-- <option >21</option> -->\n");
      out.write("<!-- <option >22</option> -->\n");
      out.write("<!-- <option >23</option> -->\n");
      out.write("<!-- <option >24</option> -->\n");
      out.write("<!-- <option >25</option> -->\n");
      out.write("<!-- <option >26</option> -->\n");
      out.write("<!-- <option >27</option> -->\n");
      out.write("<!-- <option >28</option> -->\n");
      out.write("<!-- <option >29</option> -->\n");
      out.write("<!-- <option >30</option> -->\n");
      out.write("<!-- <option >31</option> -->\n");
      out.write("</select>\n");
      out.write("<select>\n");
      out.write("<option>Jan</option>\n");
      out.write("<option>Feb</option>\n");
      out.write("<option>Mar</option>\n");
      out.write("<option>Apr</option>\n");
      out.write("<option>Jun</option>\n");
      out.write("<option>Jul</option>\n");
      out.write("<option>Aug</option>\n");
      out.write("<option>Sep</option>\n");
      out.write("<option>Oct</option>\n");
      out.write("<option>Nov</option>\n");
      out.write("<option>Dec</option>\n");
      out.write("</select>\n");
      out.write("<select>\n");
      out.write("<option>2012</option>\n");
      out.write("<option>2013</option>\n");
      out.write("<option>2014</option>\n");
      out.write("<option>2015</option>\n");
      out.write("<option>2016</option>\n");
      out.write("<option>2017</option>\n");
      out.write("<option>2018</option>\n");
      out.write("<option>2019</option>\n");
      out.write("<option>2020</option>\n");
      out.write("<option>2021</option>\n");
      out.write("<option>2022</option>\n");
      out.write("<option>2023</option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<a href=\"#\" style=\"font-size:10px; \">why do I need to provide my date of birth.</a><br>\n");
      out.write("\n");
      out.write("<div class=\"radio\"\t>\n");
      out.write("<label><input type=\"radio\">Female</label>\n");
      out.write("<label><input type=\"radio\" style=\"margin-right:5px;\">Male</label>\n");
      out.write("</div>\n");
      out.write("<small style=\"color:grey;\">by clicking Create an account, you agree to our <a href=\"#\">Terms</a> and<br>\n");
      out.write("confirm that you have read our <a href=\"#\">Data Policy</a>,including our <a href=\"#\">Cookie <br> USe Policy.</a>\n");
      out.write("you may receive SMS message notifications from</br>\n");
      out.write("Facebook and can opt out at ant time.\n");
      out.write("</small></br> \n");
      out.write("<button class=\"btn  btn-success btn-lg\" style=\"margin-top:10px;margin-bottom:15px\"><b>Create an account</b></button>\n");
      out.write("</button><br>\n");
      out.write("<p style=\"color:grey; padding-top:5px;\" ><a href=\"#\">Create a page</a>  for a celebrity, band or business.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("<nav class=\"navbav navbar-inverse\" style=\"background-color:white;height:100px; margin-top:50px; \">\n");
      out.write("  <div class=\"container\">\n");
      out.write(" <p style=\"color:grey;margin-top:5;\">English(UK)\n");
      out.write(" <a href=\"#\" style=\"margin-left:15px;\">हिन्दी </a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">ਪੰਜਾਬੀ </a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">اردو</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">বাংলা  </a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">मराठी</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">తెలుగు  </a>\n");
      out.write("<a href=\"#\"style=\"margin-left:15px;\">ગુજરાતી</a>\n");
      out.write("<a href=\"#\"style=\"margin-left:15px;\">ಕನ್ನಡ </a>\n");
      out.write("<a href=\"#\"style=\"margin-left:15px;\"> മലയാളം</a>\n");
      out.write("<button class=\"btn\" onclick=\"alert('add your choice')\"><b>+</b></button>\n");
      out.write("</p><hr>\n");
      out.write("<p>\n");
      out.write("<a href=\"#\">Sign up</a> \n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">log in</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Messenger</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Facebook Lite</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Mobile</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Finds Friends</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">People</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Pages</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Places</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Games</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Locations</a></p>\n");
      out.write("<p>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Celebrities</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">MarketPlace</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Groups</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Recipes</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Sports</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Moments</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Instagram</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">About</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Create Advert </a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Create Page</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Developers</a></p>\n");
      out.write("<p>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Careers</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Privacy</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Cookies</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Adchoice</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Terms</a>\n");
      out.write("<a href=\"#\" style=\"margin-left:15px;\">Help</a>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("<p><abbr title=\"This page created By pradeep singh negi\">@copyright-2017 \t</abbr>NIItian</p>\n");
      out.write("</nav></footer>\n");
      out.write("\n");
      out.write("\n");
      out.write(" </body>\n");
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
