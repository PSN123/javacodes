package navigablemapdemo1;
import java.util.*;
public class NavigableMapdemo1 {

    public static void main(String[] args) {
    TreeSet<Integer> t=new TreeSet<Integer>();
    t.add(1000);
    t.add(2000);
    t.add(3000);
    t.add(4000);
    t.add(5000);
    t.add(6000);
    t.add(7000);
    t.add(8000);
    t.add(9000);
    t.add(10000);
   System.out.println(t);
        System.out.println(t.floor(2000)+"..."+"floor");
   System.out.println(t.ceiling(2000)+"..."+"1"+"ceiling");
   System.out.println(t.higher(6000 )+"..."+"2"+"higher");
   System.out.println(t.lower(2000 )+"..."+"3"+"lower"); 
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t.descendingSet());
//   System.out.println(t.floor(3000 )+"..."+"4");
  System.out.println(t);
    
    
    
    
    
    }
    
}
