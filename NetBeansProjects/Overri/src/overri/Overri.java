package overri;

import java.io.FileNotFoundException;
import java.io.InterruptedIOException;
import java.sql.SQLException;


//class animal{
//    
//}
//
//class monkey extends animal{
//     
// } 
//
//public class Overri {
//
//  public void m1(animal a){
//      System.out.println("Animal version");
//  }  
//  public void m1(monkey m){
//      System.out.println("Monkey version");
//  }
//    public static void main(String[] args) {
//         Overri o=new Overri();
//         
//         animal a=new animal();
//         o.m1(a);
//         
//    monkey m=new monkey();
//    o.m1(m);
//         
//    animal a1=new monkey();
//    o.m1(a);
//    }
//    
//}
 
//class parent{
//
// //  final void m1(){
////       System.out.println("private modifier is not applcable for child");
////   } 
////    
//   public void property(){
//       System.out.println("Gold+Cash+Land");
//   } 
//    
//   public void marry(){
//       System.out.println("venky+subhalaxmi+Riya");
//   }
//}
//
//class child extends parent{
//    
//     
//     void  m1(){
//        System.out.println("i am the private mthod of child ");
//    }
//    
//   public void marry(){
//       System.out.println("i will marry toCandy");
//   } 
//    
//}
//class Overri{
//    
//   public static void main(String aa []){
//       
//       parent p=new parent();
//     p.property();
//       p.marry();
//      // p.m1();
//   
//       child c=new child();
//       c.marry();
//  c.m1();
//   parent p1=new child();
//   p1.marry();
//       
//   } 
   
    
//}


// abstract class pradeep{
//  
//  public  abstract void m1();
//}
//
//class c extends pradeep{
//
//    @Override
//    public void m1() {
//        System.out.println("yeah its abstract ");
//  }
//}
//
//class test{
//    public static void main(String [] args){
//        c c1=new c();
//   
//    }
//}

//class van{
//    public  void m1(int...x) {
//        System.out.println("parent");   
//    }
//}
//class can extends van{
//    
//   
//   public  void m1(int x) {
//        System.out.println("child");
//    }
//}
//
//class Overri{
//    public static void main(String [] args) {
//        van v=new van();
//     v.m1(null);
//        v.m1(20,30,40,50);
//      
//        can c=new can();
//        c.m1(20);
//   van c1=new can();
//   c1.m1();
//    }
//}
 
//class Overri{
//     static String s="200";
//   static int i=10;
//     public static void main(String aa []){
//        int i=Integer.parseInt(s);
//        System.out.println(i);
//String s=String.valueOf(i);
//         System.out.println(s);
//        
//    
//    
//    
//    }
//}

//class Overri{
//    String name;
//    int rollno;
//    static int count=0;
//    {
//        count++;
//    } 
//    Overri(String name,int rollno){
//        this.name=name;
//        this.rollno=rollno;
//    }
//public static void main(String aa []){
//    Overri o=new Overri("durga",102);
//    
//    Overri o1=new Overri("pradeep",105);
//    Overri o2=new Overri("vandy candy",106);
//    Overri o3=new Overri("abhi",107);
//    
//    System.out.println("object called this number of time:\n"+count);
//}
//
//}

//class Overri{
//    
//    static int i=10;
//    static{
//    m1();
//        System.out.println("first static block");
//  }
//    public static void main(String aa []){
//    m1();
//    System.out.println("Main method");
//}
//public static void m1(){
//    System.out.println(j);
//}
//static{
//    System.out.println("second static block");
//}
//static int j=20;
//
//}

class Overri{
    
    int a=10;
    {
        System.out.println("first instance BLock");      
    }
    Overri(){
        System.out.println("Constructor");
    }
    {
        vandana();
        System.out.println(a);    
    }
public static void main(String aa []){
Overri o=new Overri();
    System.out.println("main method");    
Overri o1=new Overri();

}
public void vandana(){
   int c=30;
    System.out.println("i am instance method");
}
    int b=20;
{
    System.out.println(a+b);
}
}