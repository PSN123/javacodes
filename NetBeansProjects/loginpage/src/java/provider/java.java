/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provider;

/**
 *
 * @author Pradeep Negi
 */
public class java {
 
public interface Provider{
    String DRIVER="oracle.jdbc.driver.OracleDriver";
    String CONNECTION_URL="jdbc:oracle:thin:@localhost:1252:xe";
String USERNAME="system";
String PASSWORD="oracle";
}    
}
