package pradeep;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pradeep Negi
 */
public class NewClass extends TagSupport{
    

public int getStatTag() throws JspException{
 JspWriter out=pageContext.getOut();
 try{
     System.out.println(12+12);
 }catch(Exception e){
     System.out.println(e);}
return SKIP_BODY;
}
}
