package enumeration;
import java.util.*;

public class IT {

    public static void main(String[] args) {
ArrayList al=new ArrayList();
for(int i=0; i<10; i++){
    al.add(1234);
}
        System.out.println(al);
   Iterator t=al.iterator();
   while(t.hasNext())
   {
       String s=(String)t.next();
       if(s.equals(0))
           System.out.println(s);
   else
          t.remove();
   }
        System.out.println(al);
   }}
  
    
