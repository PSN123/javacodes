package shutdownt;
class TestShutdown1 extends Thread {
public void run(){
    System.out.println("shut down hook task completed");
}
}


public class Shutdownt{
    public static void main(String[] args) throws Exception {
       
   Runtime r=Runtime.getRuntime();
   r.addShutdownHook(new TestShutdown1());
        System.out.println("Now main sleeping...pres ctrl+c to exit"); 
        try{Thread.sleep(3000);}catch(Exception e){}
        
    }
    
}
