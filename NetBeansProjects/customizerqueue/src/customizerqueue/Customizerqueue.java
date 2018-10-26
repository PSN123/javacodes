package customizerqueue;
import java.util.*;
public class Customizerqueue {

    public static void main(String[] args) {
    PriorityQueue q=new PriorityQueue();
    q.offer("A");
    q.offer("Z");
    q.offer("L");
    q.offer("B");
        System.out.println(q);
       }
 }
class Mycomparator implements Comparator{
    
   public int compare(Object obj1,Object bj2){
       String s1=(String)obj1;
 String s2=bj2.toString();
 return s2.compareTo(s1);
   } 
}