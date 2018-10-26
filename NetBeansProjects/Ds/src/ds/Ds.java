package ds;
class Display{
    public synchronized void displayn(){
        for(int i=0; i<=10; i++){
            System.out.println(i);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}
        }
    }
    
  public synchronized  void displayc(){
    for(int i=65; i<=75; i++){
        System.out.println((char)i);
    
    try{
        Thread.sleep(2000);
    }catch(InterruptedException e){}
    
    }
}
}
        class Mythread1 extends Thread{
           Display d;

         Mythread1(Display d) {
        
        this.d=d;
        }
public void run(){
    d.displayn();
}
        }

class Mythread2 extends Thread{
    Display d;

         Mythread2(Display d) {
        this.d=d;
         }
         public void run(){
             d.displayc();
         
         }
}

        


public class Ds {

    public static void main(String[] args) {
        Display d=new Display();
Mythread1 t1=new Mythread1(d);
Mythread2 t2=new Mythread2(d);
t1.start();
t2.start();

    
    }
}


    

