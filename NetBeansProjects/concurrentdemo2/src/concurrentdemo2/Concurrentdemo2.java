package concurrentdemo2;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrentdemo2 {

    public static void main(String[] args) {
        ConcurrentHashMap m=new ConcurrentHashMap();
        m.put(101,"pradeep");
        m.remove(101,"Ravi");
        System.out.println(m);//value not matched with key so not removed
        m.put(101,"pradeep");
        System.out.println(m);
                
    
    
    
    
    }
    
}
