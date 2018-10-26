/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pradeep Negi
 */
public class Jdbc {

String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
String DB_URL="jdbc:oracle:thin:@localhost:1521:XE [hr on HR]";

    
    
    public static void main(String[] args) throws SQLException {
String user="Username";
String password="password";

        Connection conn=null;
     Statement stmt=null;
     try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("connecting to Databse..");
         conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,password);
     
         System.out.println("Creating Statement...");
         stmt=(Statement) conn.createStatement();
         String  sql="select name,id from sham";
         ResultSet rs=stmt.execute(sql);
     while(rs.next()){
         int id=rs.getint("id");
         String name=rs.getString("name");
     
         System.out.println("id"+id);
     System.out.println("name"+name);
     }    
     rs.close();
     
     conn.close();
     }catch(Exception e){
         e.printStackTrace();
     }finally{
         if(stmt!=null)
             
         if(conn!=null)
             conn.close();
     }
        System.out.println("Goodbye");
    }
}

           
         
         
         
         
     
     
 
