package concurrenthashmap;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapdemo1 {

    public static void main(String[] args) {
        ConcurrentHashMap m=new ConcurrentHashMap();
        m.put(101,"durga");
        m.put(101,"RAVI");
        System.out.println(m);
 m.putIfAbsent(102, "duraga");
        System.out.println(m);
    }
    
}
