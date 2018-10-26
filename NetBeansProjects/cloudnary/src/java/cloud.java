


import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import cloud.cloudget;
import cloud.NewClass;
//@MultipartConfig(fileSizeThreshold =1024*1024*10, //10 MB
//                 maxFileSize = 1024*1024*50,      //50Mxb
//                 maxRequestSize = 1024*1024*100)  //100MB


public class cloud extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cloud</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cloud at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
//     String SAVE_DIR="image";        
//            String appPath = request.getServletContext().getRealPath("");
//                   System.out.println(appPath); 
//         String savePath = appPath + File.separator + SAVE_DIR;
//        File fileSaveDir = new File(savePath);
//        
//        if( !fileSaveDir.exists() )
//        {
//            fileSaveDir.mkdir();
//        }
//       
//          System.out.println( savePath + File.separator + "sample.jpg" );
//        
//        File f = new File( savePath + File.separator + "simple.jpg" );
//      
//        FileOutputStream fos = new FileOutputStream(f);
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        
//        Part part = request.getPart("image");
//        
//        {
//            
//            String filename = "simple.jpg";
//            
//            byte b[] = new byte[part.getInputStream().available()];
//            
//            part.getInputStream().read(b);
//            
//            bos.write(b);
//               
//        }
//       
//      
//            Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
//  "cloud_name", "warmachinewarrior",
//  "api_key", "541641359745253",
//  "api_secret", "oEohTTTpzXhcroGvWqrnxbuuHpA"));
//             Map uploadResult = cloudinary.uploader().upload(f, ObjectUtils.emptyMap());
//             System.out.println(uploadResult.get("url"));
//             String profile_pic=(uploadResult.get("url")).toString();
//                      System.out.println( uploadResult );
//          
//       cloudget cl=new cloudget();
//       NewClass nc=new NewClass();
//        
//String s1=request.getParameter("upload");
//     cl.setUpload(s1);
//       
   
     
    }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
