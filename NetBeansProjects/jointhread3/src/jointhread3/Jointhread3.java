package jointhread3;

import sun.management.GcInfoCompositeData;

public class Jointhread3 extends Thread{
    public void run(){
        System.out.println("Running....");
    }
    public static void main(String[] args)
    {
        Jointhread3 th1=new Jointhread3();
        Jointhread3 th2=new Jointhread3();
        System.out.println("NAME of th1"+th1.getName());
        System.out.println("Name of th2"+th2.getName());
        System.out.println("id of t1:"+th1.getId());
th1.start();
th2.start();

th1.setName("Pradeep");
        System.out.println("After changing of t1:"+th1.getName());
      }
    
}
