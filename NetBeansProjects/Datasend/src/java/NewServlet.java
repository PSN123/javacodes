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
public class NewServlet extends HttpServlet {

  private static final String DEFAULT_SEASONS="jan,feb,mar,apr,may,jun,jul,aug";
  
  private String[] SEASON;
  
  public void init(){
      String seasons_list=getInitParameter("seasons");
      if(seasons_list==null){
          seasons_list=DEFAULT_SEASONS;
      }
      SEASON = seasons_list.split(",");
      
  }
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
  String u=(String)request.getAttribute("username");
  out.println("hello "+u);
   out.println("<html>");
   out.println("<body>");
   out.println("</p>");
   out.println("<form action='send' method='post'>");
   out.println("Year:<input type='text' name='title'/>");
   
   
   out.println("Season:<select name='season'>");
   out.println("<option value='UNKNOWN'>select....</option>");
   for(int i=0; i<SEASON.length; i++){
     out.println("<option value='"+SEASON[i]+"'");  
   out.println(">" + SEASON[i] +"</option>");
   }
   out.println("</select> <br/>");
   out.println("Title<input type='text' name='title'/>");
   out.println("<input type='submit' value='add league'>");
   out.println("</form>");
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
