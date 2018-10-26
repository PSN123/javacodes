package thread1;

public class Thread1 implements Runnable{
public void run(){
            System.out.println("hii");
}
public static void main(String...pradeep){
 Thread1 th=new Thread1();
 Thread th1=new Thread(th);
 th1.start();
}
}
