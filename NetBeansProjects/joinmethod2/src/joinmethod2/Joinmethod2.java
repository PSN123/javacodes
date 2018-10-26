package joinmethod2;

public class Joinmethod2 extends Thread {
public void run(){
    for(int a=1; a<=5; a++){
        try{
            Thread.sleep(500);
        }catch(Exception e){System.out.println(e);}
            System.out.println(a);
            
            
        }
    }


    public static void main(String[] args) {
        Joinmethod2 jt1=new Joinmethod2();
        Joinmethod2 jt2=new Joinmethod2();
        Joinmethod2 jt3=new Joinmethod2();
        jt1.start();
        try{
            jt1.join(1500);
        }catch(Exception e){System.out.println(e);}
        
        jt2.start();
        jt3.start();
        
}
}    
