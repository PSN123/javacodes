package testdaemonthread;

public class TestdaemonThread extends Thread{
public void run(){
    System.out.println("Name:"+Thread.currentThread().getName());
    System.out.println("Daemon:"+Thread.currentThread().isDaemon());
}
    public static void main(String[] args) {
       TestdaemonThread th1=new TestdaemonThread();
        TestdaemonThread th2=new TestdaemonThread();
        th1.start();
        th1.setDaemon(true);
        th2.start();
    }
    
}
