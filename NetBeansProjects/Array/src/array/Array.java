/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args)
    {
//int a[]=new int[10];
//a[0]=1234;
//a[1]=5678;
//a[2]=91011;
//a[3]=123;
//a[4]=56;
//a[5]=78;
//a[6]=90;
//a[7]=11;
//a[8]=12;
//a[9]=34;
//
//for(int i:a )
//            System.out.println(a);
//
//for(int a=1; a<100000; a++ )
           // System.out.println("Run...Run..Run...Run..Run...Run..Run...Run..Run...Run..Run...Run..Run...Run..");
        

     try{
    int data=50/0;
int a[]=new int[5];
     }   catch(ArithmeticException e)
     {System.out.println(e);}System.out.println("any cannot divide by zero");
        
     int a = 0;   
        
     System.out.println("enter valid number: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        
        System.out.println(50/a);
        {

        
    }
    
}

    private static Scanner nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}