package server;
import java.net.*;
import java.io.*;
public class Server {

    public static void main(String[] args) throws Exception
    {
        
        ServerSocket server=new ServerSocket(5000);
        Socket s=server.accept();
        System.out.println("waiting for client response.....");
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF("hello world i am ps 97");
       
    }
    
}
