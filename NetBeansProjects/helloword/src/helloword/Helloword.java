package helloword;
import java.util.Scanner;

public class Helloword {
public static void main(String[] args)  {
Scanner sc=new Scanner(System.in);
{
{
    System.out.println("=======which type of calculation you want to perfrom=====");
}

    System.out.println("Press 1 for A1ddition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("press 3 for Multiply");
System.out.println("press 4 for Divide ");        
}
System.out.println("please enter first digit:");                
                int a=sc.nextInt();
    System.out.println("please enter second digit:");
    int b=sc.nextInt(); 
int c=a+b;
int d=a/b;
int m=a*b;
int s=a-b;
switch(sc.nextInt()){
    case 1:
    {
        System.out.println("addtion:"+c);
    break;
    }
    case  2:
    {
        System.out.println("divide"+d);break;
    }
    case 3:
    {
        System.out.println("Multiply"+m);break;
        
   }
    case 4:
    {
        System.out.println("Press 4 for subtraction"+s);break;
    }


}
}
}
