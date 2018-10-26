package threadpriority;

public class Threadpriority extends Thread {
public void run(){
    System.out.println("running thread name is:"+Thread.currentThread().getName());
    System.out.println("running thread name is :"+Thread.currentThread().getPriority());
}
    public static void main(String[] args) {
        Threadpriority th1=new Threadpriority();
        Threadpriority th2=new Threadpriority();
        
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.MAX_PRIORITY);
    
    th1.start();
    th2.start();
    
    
    }
    
}
