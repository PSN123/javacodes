package jdbcdemo2;
import java.sql.*;

public class Jdbcdemo2 {

    public static void main(String[] args)throws SQLException {
Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/captain1","hr","hr");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from pradeep");
while(rs.next())
{
    System.out.println(rs.getString("NAME")+" "+rs.getInt("ID"));
}
    
con.close();
    }
    
}
