package weakhashmapdemo;
import java.util.*;
public class Weakhashmapdemo {

    public static void main(String[] args) throws Exception {
    WeakHashMap m=new WeakHashMap();
    temp t=new temp();
    m.put(t,"pradeep");
        System.out.println(m);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
    }
    }
class temp{
   
    public String toString(){
   return"temp";     
    }
    public void finalize()
    {
        System.out.println("final method called");
    }
}