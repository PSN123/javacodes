package copyonwritearraylist;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;


public class mythread extends Thread  {

    static CopyOnWriteArrayList l=new CopyOnWriteArrayList();

    
    public void run(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}
        System.out.println("child thread updating list");
    l.add("C");
    }


    public static void main(String[] args)throws InterruptedException{
        l.add("A");
        l.add("B");
        mythread th=new mythread();
       th.start();
        Iterator itr=l.iterator();
        while(itr.hasNext()){
    String s1=(String)itr.next();
            System.out.println("main thread iterating list and current object"+s1);
            Thread.sleep(2000);
        }
        System.out.println(l);
}
}