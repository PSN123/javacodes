package listiteratordemo;
import java.util.*;
public class Listiteratordemo {
    public static void main(String[] args) {
   LinkedList l=new LinkedList();
    l.add("abhsihek");
    l.add("siku");
    l.add("karan");
    l.add("pradeep");
        System.out.println(l);
        ListIterator itr=l.listIterator();
        while(itr.hasNext()){
            String s=(String)itr.next();
            if(s.equals("abhishek"))
            {
                itr.remove();
                
            }
            else if(s.equals("siku"))
            {
                itr.add("chris rogers");
            }
            else if(s.equals("karan"))
            {
                itr.set("Tony Stark");
            }
       }
        System.out.println(l); 
        
        
        
}
    
    }
    

