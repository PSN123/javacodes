/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcmagic;
import java.sql.*;


/**
 *
 * @author Pradeep Negi
 */
public class JDBCmagic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");    
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from akash");
        while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
    con.close();
    }catch(Exception e){
    e.printStackTrace();
}
            }

