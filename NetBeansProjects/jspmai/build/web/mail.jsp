<%-- 
    Document   : mail
    Created on : Dec 27, 2017, 12:45:54 PM
    Author     : Pradeep Negi
--%>

<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.MessagingException"%>
<%@page import="javax.mail.Session"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.mail.internet.*,javax.activation.*" %>
<%@page import="javax.servlet.http.*,javax.servlet.*" %>

<%
 String result;
 String to="abhishekyadav1183@gmail.com";
 String from="pradeep.negi01000@gmail.com";
 String host="smtp.gmail.com";
 Properties prop=System.getProperties();
 prop.setProperty("mail.smtp.host",host);
 Session mailsession=Session.getDefaultInstance(prop);
 
 try{
     MimeMessage message=new MimeMessage(mailsession);
 message.setFrom(new InternetAddress(from));
 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
 message.setSubject("this si the subject");
 message.setText("hey your data has been successfull inserted");
 Transport.send(message);
 result="Sent Messeage successfully";
 }catch(MessagingException mex){
 mex.printStackTrace();
 result="Error: unable to send message....";
 }
 %>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<p align="center">
    <%
out.println("Result:" +result+"\n");
 %>



    </body>
</html>
