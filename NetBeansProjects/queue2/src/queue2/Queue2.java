package queue2;
import java.util.*;
public class Queue2 {

    public static void main(String[] args) {
PriorityQueue q=new PriorityQueue();
        System.out.println(q.peek());
        for(int a=0; a<10; a++){
            q.offer(a);
        }
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    
    }
    
}
