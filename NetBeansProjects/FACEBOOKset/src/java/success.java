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
public class success extends HttpServlet {

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
String u=(String)request.getAttribute("username");

            out.println("hello "+u);
        out.println("<html>\n" +
"    <head>\n" +
"        <title>facebook</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n" +
"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n" +
"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n" +
"<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"> \n" +
"<link rel=\"icon\" type=\"image/png\" href=\"fb.png\" size=\"13*13\">\n");

     out.println("<style>\n" +
"	body{\n" +
"	background-color:#eeeff4;\n" +
"	}\n" +
"	.navbar{\n" +
"	height:50px;\n" +
"	background-color:#3b5998;\n" +
"	}\n" +
"	#search{\n" +
"	margin-top:8px; \n" +
"	width:400px;\n" +
"	}\n" +
"	.img-circle{\n" +
"	width:25;\n" +
"	height:30; \n" +
"	margin-left:60px;\n" +
"	margin-top:3px;\n" +
"	}\n" +
"	#f{\n" +
" color:white;\n" +
"	}\n" +
"	#user{\n" +
"    color:white;\n" +
"	margin-left:10px;\n" +
"	font-size:20px; \n" +
"	}\n" +
"	.fafa{\n" +
"	\n" +
"	font-size:20px;\n" +
"	margin-left:10px;\n" +
"	color:black;\n" +
"	margin-left:5px;\n" +
"	}\n" +
"	\n" +
"	#links{\n" +
"	margin-left:25%;\n" +
"	margin-top:3%;\n" +
"	font-size:20px;\n" +
"	}\n" +
"	\n" +
"	#create{\n" +
"	float:right;\n" +
"	margin-left:8%;\n" +
"	margin-top:2%;\n" +
"	font-size:15px;\n" +
"    color:grey; \n" +
"	}\n" +
"	#shortcuts{\n" +
"	\n" +
"	width:30;\n" +
"	height:35; \n" +
"	margin-left:60px;\n" +
"	margin-top:3px;\n" +
"	}\n" +
".panel{\n" +
"   margin-left:300px;\n" +
"   margin-top:-568px;\n" +
"   width:450px;\n" +
"   color:black;\n" +
"   }	\n" +
"   #pane-default1{\n" +
"   width:450px;\n" +
"   margin-left:300px;\n" +
"   margin-top:20px;\n" +
"   }\n" +
"   #right-panel{\n" +
"   \n" +
"   width:450px;\n" +
"   margin-left:792px;\n" +
"   margin-top:-890px;\n" +
"   width:350px;height:70px;\"\n" +
"   }\n" +
" \n" +
" </style>\n" +
"	</head>");   
    out.println("<body >\n" +
"<nav class=\"navbar navbar-inverse\">\n" +
" <div class=\"container\"> \n" +
" <div class=\"row\">\n" +
" <div class=\"container\">\n" +
" <img src=\"image/nav.png\" class=\"img-thumnail\" alt=\"not found\" width=\"20\" height=\"25\">\n" +
" <input id=\"search\" type=\"search\" placeholder=\"Search...\"/>\n" +
" <button type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-search\"></button> \n" +
" \n" +
" <img src=\"image/happy.jpg\" class=\"img-circle\" alt=\"not found\" />\n" +
"<a href=\"#\" style=\"color:white;\"><b>Pradeep</b></a> \n" +

            "<a href=\"#\" style=\"color:white;margin-left:4px;\"><b  >Home</b></a>\n" +
"<a href=\"#\"><b id=\"f\" ><span style=\"color:black;\">|</span> Finds  Friends</b></a>\n" +
" <span id=\"user\" class=\"glyphicon glyphicon-user\"  ></span>\n" +
" <a class=\"fafa\">\n" +
" <i  class=\"fa fa-commenting\"></i>\n" +
"<i class=\"fa fa-globe\" ><b>|</b></i>\n" +
"<i class=\"fa fa-question-circle\" ></i> \n" +
"<i class=\"fa fa-caret-down\"></i></a>\n" +
"</div>\n" +
" </div>\n" +
" </div>\n" +
" </div>\n" +
" </div>\n" +
" </nav> <!-- <End of Navigation bar>--> ");    
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
