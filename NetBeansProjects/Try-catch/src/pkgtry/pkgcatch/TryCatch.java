package pkgtry.pkgcatch;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;
public class TryCatch {

    public static void main(String[] args) {
       
        try{
      // int a=10;
           System.out.println(10/0);
       }catch(Exception e){
            System.out.println(e);
           Scanner sc=new Scanner(System.in);
     
           System.out.println("Enter valid value:");
            int a=sc.nextInt();
            if(a==0){
                System.out.println("not a valid number");
                Scanner sc1=new Scanner(System.in);
                int b=sc.nextInt();
                System.out.println("here is the answer is:"+10/b);
            }else{
                
            System.out.println(10/a);
       }
               
        
        
        
//    try{
//        System.out.println(10/0);
//    }catch(Exception e){}
//    finally{System.out.println(10/2); }
//    
    }
    
}}
