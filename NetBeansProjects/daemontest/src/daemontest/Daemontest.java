package daemontest;


class mythread extends Thread{
  public void run(){
      
  }  
        
       
}

public class Daemontest {

    public static void main(String[] args) {
    
        System.out.println(Thread.currentThread().isDaemon());
        mythread t=new mythread();
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
    
}
