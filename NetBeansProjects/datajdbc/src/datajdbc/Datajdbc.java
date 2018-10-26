package datajdbc;
import java.sql.*;
public class Datajdbc {

    public static void main(String[] args) throws SQLException {
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from akash");
    while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
    con.close();
    }catch(Exception e){System.out.println(e);}
    
}
