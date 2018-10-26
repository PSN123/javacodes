package th;

class MyThread extends Thread{
    public void run(){
        for(int a=1;a<10;a++)
            System.out.println("child Thread");
            }
}


public class TH {

    public static void main(String[] args) {
MyThread t=new MyThread();
t.start();
for(int a=0; a<10; a++)
{
    System.out.println("Main Thread");
}}
    
}
