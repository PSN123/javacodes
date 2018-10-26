package iterratordemo;
import java.util.*;

public class Iterratordemo {

    public static void main(String[] args) {
 ArrayList l=new ArrayList();
 for(int a=0; a<=10; a++)
 {
     l.add(a);
 }
        System.out.println(l);
        Iterator itr=l.iterator();
        while(itr.hasNext())
        {
            Integer i=(Integer)itr.next();
            if(i%2==0)
                System.out.println(i);
            else
                itr.remove();
        }
        System.out.println(l);
    
    }
    
}
