/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pradeep Negi
 */
public class UI extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">");
            out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
            out.println("<style>"
                    + "#form{font-size:15;"
                    + "}</style> ");
            
            out.println("</head>");
            out.println("<body style=\"background-color:#eeeff4;\">");
            
out.println("<nav class='navbar navbar-inverse ' style='height:85px;background-color:#3b5998;\'>");
out.println("  <div class='row'>");

out.println("  <div class='col-lg-5'>"); 
out.println(" <div class='navbar-header'>");
out.println("  <a class='navbar-brand' href='#' style='color:white; margin-left:150px;margin-top:25px;font-size:40px;font-family:klavika Bold;'>");
out.println("  <b>facebook</b></a>");
out.println("</div>");  
out.println("</div>"); 

out.println("< <div class=\"col-lg-3\">\n" +
" <form><label style=\"color:white;font-size:15px; margin-left:37%; margin-top:11px; \">Username or phone</label> \n" +
" <input  type=\"text\" placeholder=\"enter email or phone\" required style=\"margin-left:37%;margin-top:-1px\";></input></form> \n" +
"  </div> 	\n" +
" <div class=\"col-lg-3\"> \n" +
"<form><label style=\"color:white; margin-left:1%; margin-top:15px; \">Password</label><br> \n" +
" <input  type=\"text\" placeholder=\"password\" required style=\"margin-right:20%;\"></input> \n" +
"  <input  type=\"button\" value=\"log in\" style=\"float:right;background-color:#3b5998;margin-right:40px;color:white;\">  \n" +
" <a href=\"#\" style=\" margin-left:10px;text-size:1px;color:white;\">forgot password?</a></form> \n" +
"\n" +
"</div> \n" +
" </div> \n" +
"\n" +
" \n" +
"  \n" +
" </nav>");
out.println("<div class=\"container\">\n" +
"<div class=\"row\">\n" +
"<div class=\"col-lg-6\"> \n" +
"<b style=\"font-size:25px;\"> Facebook helps you connect and share with<br> the people in your life.</b>\n" +
"<div class=\"container\">\n" +
"<img src=\"Capture.png\" class=\"img-rounded\" alt=\"not found\" width=\"50%\" height=\"30%\" style=\"padding-right:60px;\">\n" +
"</div>\n" +
"</div>\n" +
"<div class=\"col-lg-6\">\n" +
"<h1 style=\"margin-top:-10px;\">Create an account</h1>\n" +
"<small >it's free and always be.</small><br>\n" +
"<input type=\"text\" placeholder=\"Name\" style=\"margin-top:10px\">\n" +
"<input type=\"text\" placeholder=\"Surname\" style=\"margin-top:10px\"><br>\n" +
"<input type=\" text\" placeholder=\"Mobile Number or Email address\"  style=\"margin-top:10px;float-right;width:350px;\"><br>\n" +
"<input type=\"text\" placeholder=\"New Password\"  style=\"margin-top:10px;float-right;width:350px;\"><br>\n" +
"<h4 style=\"padding-top:10px; padding-bottom:-0px; font-size:20px \">Birthday</h4>\n" +
"<select id=\"p\">\n" +
"<option >0</option> \n" +
" <option >1</option> \n" +
"<option >2</option> \n" +
" <option >3</option>\n" +
" <option >4</option> \n" +
"<option >5</option> \n" +
"<option >6</option> \n" +
" <option >7</option> \n" +
" <option >8</option> \n" +
" <option >9</option> \n" +
"<option >10</option> \n" +
"<!-- <option >11</option> -->\n" +
"<!-- <option >12</option> -->\n" +
"<!-- <option >13</option> -->\n" +
"<!-- <option >14</option> -->\n" +
"<!-- <option >15</option> -->\n" +
"<!-- <option >16</option> -->\n" +
"<!-- <option >17</option> -->\n" +
"<!-- <option >18</option> -->\n" +
"<!-- <option >19</option> -->\n" +
"<!-- <option >20</option> -->\n" +
"<!-- <option >21</option> -->\n" +
"<!-- <option >22</option> -->\n" +
"<!-- <option >23</option> -->\n" +
"<!-- <option >24</option> -->\n" +
"<!-- <option >25</option> -->\n" +
"<!-- <option >26</option> -->\n" +
"<!-- <option >27</option> -->\n" +
"<!-- <option >28</option> -->\n" +
"<!-- <option >29</option> -->\n" +
"<!-- <option >30</option> -->\n" +
"<!-- <option >31</option> -->\n" +
"</select>\n" +
"<select>\n" +
"<option>Jan</option>\n" +
"<option>Feb</option>\n" +
"<option>Mar</option>\n" +
"<option>Apr</option>\n" +
"<option>Jun</option>\n" +
"<option>Jul</option>\n" +
"<option>Aug</option>\n" +
"<option>Sep</option>\n" +
"<option>Oct</option>\n" +
"<option>Nov</option>\n" +
"<option>Dec</option>\n" +
"</select>\n" +
"<select>\n" +
"<option>2012</option>\n" +
"<option>2013</option>\n" +
"<option>2014</option>\n" +
"<option>2015</option>\n" +
"<option>2016</option>\n" +
"<option>2017</option>\n" +
"<option>2018</option>\n" +
"<option>2019</option>\n" +
"<option>2020</option>\n" +
"<option>2021</option>\n" +
"<option>2022</option>\n" +
"<option>2023</option>\n" +
"</select>\n" +
"\n" +
"<a href=\"#\" style=\"font-size:10px; \">why do I need to provide my date of birth.</a><br>\n" +
"\n" +
"<div class=\"radio\"	>\n" +
"<label><input type=\"radio\">Female</label>\n" +
"<label><input type=\"radio\" style=\"margin-right:5px;\">Male</label>\n" +
"</div>\n" +
"<small style=\"color:grey;\">by clicking Create an account, you agree to our <a href=\"#\">Terms</a> and<br>\n" +
"confirm that you have read our <a href=\"#\">Data Policy</a>,including our <a href=\"#\">Cookie <br> USe Policy.</a>\n" +
"you may receive SMS message notifications from</br>\n" +
"Facebook and can opt out at ant time.\n" +
"</small></br> \n" +
"<button class=\"btn  btn-success btn-lg\" style=\"margin-top:10px;margin-bottom:15px\"><b>Create an account</b></button>\n" +
"</button><br>\n" +
"<p style=\"color:grey; padding-top:5px;\" ><a href=\"#\">Create a page</a>  for a celebrity, band or business.</p>\n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"</div>\n" +
"</div>\n" );
out.println("<footer>\n" +
"<nav class=\"navbav navbar-inverse\" style=\"background-color:white;height=100px; margin-top:50px; \">\n" +
"  <div class=\"container\">\n" +
" <p style=\"color:grey;margin-top:5;\">English(UK)\n" +
" <a href=\"#\" style=\"margin-left:15px;\">हिन्दी </a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">ਪੰਜਾਬੀ </a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">اردو</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">বাংলা  </a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">मराठी</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">తెలుగు  </a>\n" +
"<a href=\"#\"style=\"margin-left:15px;\">ગુજરાતી</a>\n" +
"<a href=\"#\"style=\"margin-left:15px;\">ಕನ್ನಡ </a>\n" +
"<a href=\"#\"style=\"margin-left:15px;\"> മലയാളം</a>\n" +
"<button class=\"btn\" onclick=\"alert('add your choice')\"><b>+</b></button>\n" +
"</p><hr>\n" +
"<p>\n" +
"<a href=\"#\">Sign up</a> \n" +
"<a href=\"#\" style=\"margin-left:15px;\">log in</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Messenger</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Facebook Lite</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Mobile</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Finds Friends</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">People</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Pages</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Places</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Games</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Locations</a></p>\n" +
"<p>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Celebrities</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">MarketPlace</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Groups</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Recipes</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Sports</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Moments</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Instagram</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">About</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Create Advert </a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Create Page</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Developers</a></p>\n" +
"<p>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Careers</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Privacy</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Cookies</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Adchoice</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Terms</a>\n" +
"<a href=\"#\" style=\"margin-left:15px;\">Help</a>\n" +
"</p>\n" +
"\n" +
"\n" +
" \n" +
"  \n" +
"</div>\n" +
"<p><abbr title=\"This page created By pradeep singh negi\">@copyright-2017 	</abbr>NIItian</p>\n" +
"</nav></footer>\n" +
"\n" +
"\n" +
" </body>\n" +
"</html>");





//out.println("<style>{ background-color:blue;}</style> ");
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
