package cloud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewClass {

    cloudget cl=new cloudget();
    
    public int addata(cloudget cl) throws SQLException{
        
        String query="insert into images(upload) values(?)";
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/MovieData","hr","hr");
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, cl.getUpload());
ps.execute();
        return 1;
        
    } 
    
}
