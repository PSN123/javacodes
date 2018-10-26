package pradeep;


import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import netscape.javascript.JSException;

public class NewClass extends TagSupport {
    
   
    public int doStartTag() throws JSException{
        JspWriter out=pageContext.getOut();
        try{
            out.println("hello world");
            out.println(9+10);
        }catch(Exception e){System.out.println(e);}
        return SKIP_BODY;
    }
    

}
