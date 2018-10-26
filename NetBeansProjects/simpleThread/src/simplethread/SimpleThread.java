package simplethread;

class dhoni extends Thread{
    public synchronized void run(){
        for(int a=0; a<=10; a++){
            try{
                Thread.sleep(2000);
                System.out.println("good morning dhoni");
            }catch(Exception e){}
        }
    }
}

class yuv extends Thread{
    public synchronized void run(){
        for(int a=0; a<10;a++){
          try{
              Thread.sleep(2000);
              System.out.println("good moring kohli");
          }catch(Exception e){}  
        }
    }
   }
public class SimpleThread {

    public static void main(String[] args) {
dhoni t1=new dhoni();
        System.out.println(Thread.currentThread());
        Thread.currentThread().setPriority(10);

       System.out.println(Thread.currentThread().getPriority());
       Thread.currentThread().setName("Jarvis");
        System.out.println(Thread.currentThread().getName());
yuv t2=new yuv();
t1.start();
t2.start();
    
}
}