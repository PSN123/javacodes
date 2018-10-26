package multithread;

public class Multithread implements Runnable{
public void run(){
    System.out.println("task one" );
}
    
    
    
    public static void main(String[] args) {
  Thread th1=new Thread(new Multithread());
  Thread th2=new Thread(new Multithread());
    
  th1.start();
th2.start();  
    
    }

    
}
