package linkedlistdemo;
import java.util.*;

public class Linkedlistdemo {

    public static void main(String[] args) {
  
    LinkedList l=new LinkedList();
    l.add("durga");
    l.add(30);
    l.add("venku");
    l.set(0,1997);
    l.add(2,"vaneesa");
    l.removeLast();
    l.remove(0);
    l.addFirst("Vasudev sir");
        System.out.println(l);
        l.getLast();
        System.out.println(l);
    
    
    
    
    
    }
    
}
