package jdbcdemo;
import java.sql.*;
public class JDBCdemo {
public static void main(String[] args) {
    try{
    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/hardy1","hr","hr");
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select * from Captian");
   while(rs.next())
   {
       System.out.println(rs.getString("item")+"..."+rs.getInt("last_name"));
   }
    con.close();
    }catch(SQLException e){
    e.printStackTrace();
    }
    }}



