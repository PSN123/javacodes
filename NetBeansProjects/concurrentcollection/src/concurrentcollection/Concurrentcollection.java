package concurrentcollection;
import java.util.*;
public class Concurrentcollection extends Thread {
static ArrayList al=new ArrayList();
public void run(){
    try{
    Thread.sleep(2000);
}catch(InterruptedException e){}
    System.out.println("child thread updating list");
al.add("Z");
}
            public static void main(String[] args) throws InterruptedException {
 al.add("A");
 al.add("B");
 al.add("C");
 Concurrentcollection t1=new Concurrentcollection();
 t1.start();
 Iterator itr=al.iterator();
 while(itr.hasNext())
 {
     String s1=(String)itr.next();
     System.out.println("main thread iterating list and current object is:"+al);
     Thread.sleep(3000);
 }
                System.out.println(al);
                 }
}
    

