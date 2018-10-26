package sortingdemo2;
import java.util.*;
public class Sortingdemo2 {

    public static void main(String[] args) {
ArrayList a=new ArrayList();
a.add("A");
a.add("K");
a.add("Q");
a.add("H");
a.add("D");
        System.out.println(a);
        Collections.sort(a);
        System.out.println("after"+a);
    
    }
    
}
class Mycomparator implements Comparator{
    public int compare(Object obj1,Object obj2){
  String s1=(String)obj1;      
  String s2=obj2.toString();
  return s2.compareTo(s1);
        //System.out.println();
    }
   
}