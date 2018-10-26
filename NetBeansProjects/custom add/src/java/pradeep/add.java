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
public class add extends TagSupport{

 private int number;

    public add(int number) {
        this.number = number;
    }
 
 public int getStartTag() throws JspException{
     JspWriter jsp=pageContext.getOut();
 try{
     jsp.println(number+number);
 }catch(Exception e){e.printStackTrace();}
 
 
 return SKIP_BODY;
 }
    
}
