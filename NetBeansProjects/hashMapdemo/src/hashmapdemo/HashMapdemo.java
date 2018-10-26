package hashmapdemo;
import java.util.*;
public class HashMapdemo {

    public static void main(String[] args) {
HashMap m=new HashMap();
m.put("chiranjivi",120);
m.put("baliah",800);
m.put("Venkatesh",200);
m.put("Nagaarjuna",500);
        System.out.println(m);
        System.out.println(m.put("chiranjivi",1000));
        Set s=m.keySet();
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);
        Set s1=m.entrySet();
        System.out.println(s1);
        Iterator itr=s1.iterator();
       while(itr.hasNext()){
           Map.Entry m1=(Map.Entry)itr.next();
           System.out.println(m1.getKey()+"..."+m1.getValue());
           if(m1.getKey().equals("Nagaarjuna"))
           {
               m1.setValue(1000);
           }
      } 
        System.out.println(m); 
    }
    
}
