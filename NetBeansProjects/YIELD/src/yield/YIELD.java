package yield;

public class YIELD extends Thread
{
public void run()
{
    for(int i=0; i<10; i++){
        System.out.println("seetha thread");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}
    }
}
    public static void main(String[] args) throws InterruptedException {
  
        YIELD t=new YIELD();
        t.start();
        t.join(10000);
    for(int i=0; i<10; i++)
    {
        System.out.println("rama thread");
    }    
    
    }
    
}
