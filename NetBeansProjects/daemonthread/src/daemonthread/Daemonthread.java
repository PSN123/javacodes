package daemonthread;

public class Daemonthread extends Thread {
public void run(){
    if(Thread.currentThread().isDaemon()){
        System.out.println("daemon thread work");
    }else{
        System.out.println("user thread work");
    }
}

   public static void main(String[] args) {
       Daemonthread d1=new Daemonthread();
       Daemonthread d2=new Daemonthread();
       Daemonthread d3=new Daemonthread();
       d1.setDaemon(true);
       
       d1.start();
       d2.start();
       d3.start();
       
    }
    
}
