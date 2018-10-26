package collectionsortdemo;
import java.util.*;
public class Collectionsortdemo {

    public static void main(String[] args) {
ArrayList l=new ArrayList();
l.add("Z");
l.add("A");
l.add("K");
l.add("N");
        System.out.println("Before sorting"+l);
        Collections.sort(l,new mycomparator());
        System.out.println("after sorting"+l);
    
    
    }
    
}
 class mycomparator implements Comparator{
     
    public int compare(Object obj1,Object obj2)
    {
    String s1=(String)obj1;
    String s2=(String)obj2;
    return s2.compareTo(s1);
    }
     
   
 }