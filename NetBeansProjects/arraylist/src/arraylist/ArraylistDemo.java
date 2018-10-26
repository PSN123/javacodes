package arraylist;
import java.util.*;

public class ArraylistDemo {

    public static void main(String[] args)
    {
     ArrayList i=new ArrayList(10000);
     i.add("a");
     i.add(1234);
     i.add("A");
     i.add(null);
     
        System.out.println(i);
        i.remove(2);
        System.out.println(i);
        i.add(2,"pradeep");
        System.out.println(i);
     
     i.add(2,"karan");
        System.out.println(i);
        i.retainAll(i);
        System.out.println(i);
      i.addAll(i);
        System.out.println();
    }

    
}
