package concurrenthashmapdemo2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.*;
public class ConcurrentHashMapdemo2 extends Thread {

   //static ConcurrentHashMap m=new ConcurrentHashMap();
static ConcurrentHashMap m=new ConcurrentHashMap();
   public void run(){
 try{
    Thread.sleep(2000);
}catch(InterruptedException e){}
    System.out.println("child thread updating Map");
m.put(103,"c");
}
    
 public static void main(String[] args)throws InterruptedException {
 m.put(101,"A");
 m.put(102,"B");
 
ConcurrentHashMapdemo2 th=new ConcurrentHashMapdemo2();
th.start();
Set s=th.keyset();
Iterator itr=s.iterator();    
while(itr.hasNext()){ 
Integer I1=(Integer)itr.next();
    System.out.println("Main thread iterating and current entry is:"+I1+"......."+m.get(I1));
Thread.sleep(3000);
}
     System.out.println(m);
    
}

 
    
}