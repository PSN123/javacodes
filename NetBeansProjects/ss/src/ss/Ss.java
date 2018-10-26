package ss;

class Display{
    public synchronized void wish(String name){
        for(int i=0; i<10; i++)
        {
            System.out.println("Good Morning");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}
            System.out.println(name);
        }
    }
}
class Mythread extends Thread
{    
Display d;
String name;

    public Mythread(Display d,String name) {
        
            this.d=d;
            this.name=name;}
    public void run()
    {
        d.wish(name);
    }}
    

public class Ss {

    public static void main(String[] args) {
        Display d=new Display();
        Display d1=new Display();
        Mythread t1=new Mythread(d, "dhoni");
        Mythread t2=new Mythread(d, "yuvraj");
        t1.start();
        t2.start();
    }
    
}
