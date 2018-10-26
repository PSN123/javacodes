package copyonwritedemo4;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class Copyonwritedemo4 {

    public static void main(String[] args) {
   CopyOnWriteArrayList l=new CopyOnWriteArrayList();
   l.add("A");
   l.add("B");
   l.add("C");
   Iterator itr=l.iterator();
   l.add("D");
    while(itr.hasNext()){
        String s=(String)itr.next();
        System.out.println(s);
    }
    
    }
    
}
