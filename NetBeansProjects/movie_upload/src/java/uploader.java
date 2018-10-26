
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import movie.upgetset;
import movie.upcon;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024*1024*10,
                 maxFileSize =1024*1024*50  ,
                 maxRequestSize =1024*1024*100 )

public class uploader extends HttpServlet {
upgetset up=new upgetset();
upcon uc=new upcon();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet uploader</title>");            
            out.println("</head>");
            out.println("<body>");


      
            out.println("</body>");
            out.println("</html>");
            
                    String SAVE_DIR="image";        
            String appPath = request.getServletContext().getRealPath("");
                   System.out.println(appPath); 
         String savePath = appPath + File.separator + SAVE_DIR;
        File fileSaveDir = new File(savePath);
        
        if( !fileSaveDir.exists() )
        {
            fileSaveDir.mkdir();
        }
       
          System.out.println( savePath + File.separator + "sample.jpg" );
        
        File f = new File( savePath + File.separator + "simple.jpg" );
      
        FileOutputStream fos = new FileOutputStream(f);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        Part part = request.getPart("poster");
        Part part1 = request.getPart("banner");
        
            
            String filename = "simple.jpg";
            
            byte b[] = new byte[part.getInputStream().available()];
            
            part.getInputStream().read(b);
            
            bos.write(b);
               
        
       
      
            Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
  "cloud_name", "warmachinewarrior",
  "api_key", "541641359745253",
  "api_secret", "oEohTTTpzXhcroGvWqrnxbuuHpA"));
             Map uploadResult = cloudinary.uploader().upload(f, ObjectUtils.emptyMap());
             System.out.println(uploadResult.get("url"));
             String pos=(uploadResult.get("url")).toString();
             String banner=(uploadResult.get("url")).toString();
             
             System.out.println( uploadResult );
      
          String s1=request.getParameter("movie");
            String s2=request.getParameter("poster");
            String s3=request.getParameter("banner");

            
            up.setMovie(s1);
            up.setPoster(pos);
            up.setBanner(banner);
      out.print(s1);              
uc.upload(up);
        
      response.sendRedirect("uploadcrud.jsp");
        
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(uploader.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(uploader.class.getName()).log(Level.SEVERE, null, ex);
        }
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
