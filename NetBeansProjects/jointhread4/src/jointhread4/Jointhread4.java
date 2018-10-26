package jointhread4;

public class Jointhread4 extends Thread {
public void run(){
    System.out.println(Thread.currentThread().getName());
}
    
    public static void main(String[] args) {
      Jointhread4 jt1=new Jointhread4();
      Jointhread4 jt2=new Jointhread4();
    
    jt1.start();
    jt2.start();
    
    }
    
}
