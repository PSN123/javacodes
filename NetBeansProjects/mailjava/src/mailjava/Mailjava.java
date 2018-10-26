package mailjava;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Mailjava {
    public static void main(String[] args) {

  try{
      String host="smtp.gmail.com";
      String user="pradeep.negi01000@gmail.com";
      String password="";
      String to="karanchaurasia965048@gmail.com";
      String from="pradeep.negi01000@gmail.com";
      String subject="success";
      String messageText="hey your successfully signup with us";
      
      boolean sessionDebug=false;
      
      Properties props=System.getProperties();
      
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.hist",host);
      props.put("mail.smtp.port", "587");
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.required", "true");
      
      
    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
    Session mailSession=Session.getDefaultInstance(props,null);
    mailSession.setDebug(sessionDebug);
    Message msg=new MimeMessage(mailSession);
    msg.setFrom(new InternetAddress(from));
    InternetAddress[] address={new InternetAddress(to)};
    msg.setRecipients(Message.RecipientType.TO, address);
    msg.setSubject(subject);
    msg.setSentDate(new Date());
    msg.setText(messageText);
    
    Transport transport=mailSession.getTransport("smtp");
   transport.connect(host,user,password);
   transport.sendMessage(msg, msg.getAllRecipients());
transport.close();
      System.out.println("message send successfully on Reci   \n" +
"   \n" +
"pient's Email");
        
  }catch(Exception e){
      System.out.println("Excaption:"+e);
  } 
        
        
    }
    
}
