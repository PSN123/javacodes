package mthreads;

class simple1 extends Thread{
    public void run(){
        System.out.println("task One");
    }
}
class simple2 extends Thread{
    public void run(){
        System.out.println("Task two");
    }
}



public class Mthreads {
public static void main(String[] args) {
simple1 t1=new simple1();
simple2 t2=new simple2();

t1.start();
t2.start();
    }
    
}
