package testcallrun2;

public class Testcallrun2 extends Thread {
public void run(){
    for(int i=1;i<20;i++){
    try{Thread.sleep(500);
    }catch(InterruptedException e){System.out.println(e);}
        System.out.println(i);
    
    }
}
    public static void main(String[] args) {
        Testcallrun2 t1=new Testcallrun2();
        Testcallrun2 t2=new Testcallrun2();
        t1.start();
        t2.start();
    }
    
}
