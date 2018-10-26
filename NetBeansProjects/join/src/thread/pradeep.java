package thread;
import java.util.Scanner;


public class pradeep extends Thread


{
public void run(){
    for(int i=0; i<10; i++){
        try{
            System.out.println("seetha thread");
            Thread.sleep(2000);
        }catch(Exception e){}
    }
}

    public static void main(String[] args) throws Exception
    {


pradeep t=new pradeep();
t.start();
t.join();
for(int i=0;i<10;i++){
    
try
{
    System.out.println("rama Thread");
Thread.sleep(3000);
}catch(Exception e){}
    
    }
    
}
}