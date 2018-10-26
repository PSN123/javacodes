package daemon;

class mythread extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("child thread");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
        }
    }
}

public class Daemon {
    public static void main(String[] args) {
        mythread t=new mythread();
        t.setDaemon(true);
        t.start();
        System.out.println("end of main thread");
    }
    
}
