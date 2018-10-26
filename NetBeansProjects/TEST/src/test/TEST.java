package test;


class mythread extends Thread {
public void start(){
    super.start();
    System.out.println("start thread");
}

    public void run(){
        System.out.println("run Thread");
    }
}




public class TEST 
{
    public static void main(String[] args) {
 mythread t=new mythread();
 t.start();
        System.out.println("main meth");
    
    }
    
}
