package jointhread;

public class Jointhread extends Thread{
public void run(){
    for(int a=1;a<10; a++)
    {try{Thread.sleep(500);
}catch(Exception e){System.out.println(e);}
    System.out.println(a);
}
}
    public static void main(String[] args) {
    Jointhread t1=new Jointhread();
    Jointhread t2=new Jointhread();
    Jointhread t3=new Jointhread();
    t1.start();
    
    
    try{
        t1.join();
    }catch(Exception e){System.out.println(e);}
        t2.start();
        t3.start();
    }
    
}
