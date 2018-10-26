package copyoncurrentarraylist;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
        
public class Copyoncurrentarraylis  {

    public static void main(String[] args) {
        CopyOnWriteArrayList l=new CopyOnWriteArrayList();
        l.add("A");
    l.add("B");
    l.add("C");
    l.add("D");
        System.out.println(l);
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            String s1=(String)itr.next();
                    if(s1.equals("D"))
                        itr.remove();
        }
        System.out.println(l);
    
    
    
    }
    
}
