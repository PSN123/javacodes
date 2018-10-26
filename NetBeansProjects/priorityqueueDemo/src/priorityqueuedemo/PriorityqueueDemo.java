package priorityqueuedemo;
import java.util.*;
public class PriorityqueueDemo {

    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();
   q.offer("pradeep");
 q.offer(null);
 
   //System.out.println(q.peek());
System.out.println(q.poll());
//        System.out.println(q.remove());
//    for(int a=0; a<=10; a++)
//    {
//        q.offer(a);
//        
//    }
//        System.out.println(q);
//        System.out.println(q.poll());
        System.out.println(q);
    
    }
    
}
