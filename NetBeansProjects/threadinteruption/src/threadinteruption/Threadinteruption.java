package threadinteruption;

class mythread extends Thread{
    public synchronized void run(){
        try{
            for(int i=0;i<=10;i++){
                Thread.yield();
                System.out.println("i am lazy thread");
                Thread.sleep(2000);}
            }catch(InterruptedException e){
                    System.out.println("i got interupted");
                    }
        }
    }
public class Threadinteruption {

    public static void main(String[] args)throws Exception {
    
    mythread t=new mythread();
    t.start();
t.interrupt();
t.join(1000);
        System.out.println("end of main thread");
    }
}