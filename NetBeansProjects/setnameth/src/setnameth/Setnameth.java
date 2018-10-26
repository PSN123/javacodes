package setnameth;

public class Setnameth extends Thread {
public void run(){
    System.out.println("Running....");
}
    
    public static void main(String[] args) {
Setnameth st1=new Setnameth();
Setnameth st2=new Setnameth();
        System.out.println("name of t1:"+st1.getName());
        System.out.println("name of t2:"+st2.getName());
        
        st1.start();
        st2.start();
        
        st1.setName("pradeep");
        System.out.println("after changing name of t1:"+st1.getName());
        
    }
    
}
