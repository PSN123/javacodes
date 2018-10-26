package wnnall;

public class WNNALL {

    public static void main(String[] args) throws InterruptedException{
Threadb t=new Threadb();
t.start();
//Thread.sleep(2000);
synchronized(t)
{
    
    System.out.println("1: main thread trying to call wait method ");
    t.wait();
     System.out.println("4:Main thread got notification");
     System.out.println("5:"+t.total);
}    
    }
    
}

class Threadb extends Thread{
int total=0;
public void run() {
 synchronized(this)
 {
    
     System.out.println("2: child thread starts calculation");
     for(int i=0; i<=100; i++)
     {
         total=total+i;
     }
     System.out.println("3: child thread giving notification");
     this.notify();
         }        
}
}