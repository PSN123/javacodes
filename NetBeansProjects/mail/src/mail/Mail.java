package mail;
import java.util.*;
import javax.mail.*;
import javax.activation.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {

    public static void main(String[] args) {
    
     String to="karan9650.46@gmail.com" ;
     String from="pradeep.negi01000@gmail.com";
     String host="10.23.28.113";

Properties prop=System.getProperties();
prop.setProperty("mail.smtp.host", "10000");
Session ses=Session.getDefaultInstance(prop);
     

try{
 MimeMessage msg= new MimeMessage(ses);
 msg.setFrom(new InternetAddress(from));
msg.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
msg.setSubject("ping");
msg.setText("hello mr karan this is inform you that you jsp class held on towmorrow at 5:30pm to 7:30pm. ");

Transport.send(msg);
System.out.println("message sent successfully");
    
}catch(MessagingException mex)
{mex.printStackTrace();}

    }
}

    
    
