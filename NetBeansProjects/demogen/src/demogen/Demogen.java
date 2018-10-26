/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogen;
import java.util.*;
public class Demogen {

 public void tast(){
     System.out.println("salty");
 }
    
    public void m1(ArrayList<String> l){
      System.out.println("hello ");    
  }
  public void m2(ArrayList<Integer> l){
     int a=10;
     int b=20;
     int c=a+b;
      System.out.println(c);
  }
  
    public static void main(String[] args) {
       Demogen d=new Demogen();
       d.m1(null);
       d.m2(null);
       d.tast();
        System.out.println(d);
  
    Demogen d1=new Demogen(){
    public void tast(){
        System.out.println("sweet cron");
    }
    };d1.tast();
    
    
        System.out.println(d1);
    }     
        
        
        
        
//ArrayList a=new ArrayList<String>();
//a.add("pradeep");
//a.add(123415);
//         a.add(8710928);
//        System.out.println(a);
        
        
        
//        ArrayList<String> l=new ArrayList<String>();
//    l.add("Durga");
//    l.add("oums");
//    l.add("pums");
//    m1(l);
//    l.add("poum");
//        System.out.println(l);
//    }
//    public static void m1(ArrayList l){
//        l.add(10);
//    l.add(20);
//    l.add(30);
//    l.add(40);
    
    }

