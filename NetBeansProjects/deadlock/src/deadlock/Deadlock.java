package deadlock;

class A{
    public synchronized void dl(B b){
        System.out.println("thread 1 start executoin dl(B b) method");
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){}
            System.out.println("therad 1 trying to call B s last()");
        b.last();
    }        
   public synchronized void last(){
    System.out.println("inside a this is last() method");  
   }
    
    }

class B{
    public synchronized void d2(A a){
        System.out.println("thread 1 start executoin d2(B b) method");
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){}
            System.out.println("therad 1 trying to call A a last()");
        a.last();
    }        
   public synchronized void last(){
    System.out.println("inside a this is last() method");  
   }
    
    }


public class Deadlock extends Thread{
A  a=new A();
B b=new B();

public void m1()
{
    this.start();
    a.dl(b);
}
public void run(){
    b.d2(a);
}

    public static void main(String[] args) {
    Deadlock d=new Deadlock();
    d.m1();
    
    }

    
}
