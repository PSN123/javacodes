package multiplethread;

public class Multiplethread extends Thread {
public void run(){
    System.out.println("task one");
}
    public static void main(String[] args) {
        Multiplethread mt1=new Multiplethread();
        Multiplethread mt2=new Multiplethread();
        Multiplethread mt3=new Multiplethread();
        
        mt1.start();
        mt2.start();
        mt3.start();
                

        
        
    }
    
}
