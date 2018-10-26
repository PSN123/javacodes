package bean;
import java.sql.*;  
import static bean.Provider.*;  
  

public class ConnectionProvider {
    private static Connection con=null;  
    private static String DRIVER;
static{  
try{  
Class.forName(DRIVER);  
con=DriverManager.getConnection("CONNECTION_URL,USERNAME,PASSWORD");  
}catch(Exception e){}  
}  
  
public static Connection getCon(){  
    return con;  
}  

    }


    
