package loop;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args)throws Exception  {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
sc.nextInt();

switch(sc.nextInt()){
    case 1:
        
        System.out.println("i am case 1");      
        break;    
    case 2:
        Runtime.getRuntime().exec("notepad");
        System.out.println("command executed");
        break;
    case 3:
        Runtime.getRuntime().exec("cmd");
        System.out.println("command executing.... ");
break;
    default:
        System.out.println("command does not exist");
break;
}
        
        
    
    }
    
}
