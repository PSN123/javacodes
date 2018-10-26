/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.*;
import java.io.*;
public class client {
public static void main(String aa []) throws Exception
{
    Socket s=new Socket("Localhost",5000);
    System.out.println("connect...");
    DataInputStream dis=new DataInputStream(s.getInputStream());
String msg=dis.readUTF();
    System.out.println("hello");
}
    
}
