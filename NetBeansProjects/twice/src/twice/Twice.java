package twice;

public class Twice extends Thread {
public void run(){
    System.out.println("hwll");
}
    public static void main(String[] args) {
        Twice t=new Twice();
        t.start();
        t.start();
    }
    
}
