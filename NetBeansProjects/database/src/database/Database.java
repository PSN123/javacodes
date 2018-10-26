package database;
import java.sql.*;
public class Database {

    public static void main(String[] args)throws Exception {
    
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/captain","root","root");
   Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from HELLO");
    
while(rs.next()){
    System.out.println(rs.getString("item")+".."+rs.getInt("lastname"));
}    
}
}
