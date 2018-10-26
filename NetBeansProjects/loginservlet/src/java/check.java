/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pradeep Negi
 */
@WebServlet(urlPatterns = {"/check"})
public class check extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

         String uname=request.getParameter("uname");
         String password=request.getParameter("pwd");
            if(uname.equals("pradeep") && password.equals("pradeep"))
            {
                out.println("you are successfully logged in");
            }
            
        else
        {
                out.println("keep clam and check you id and password");
                }
    }

  
}
    }

