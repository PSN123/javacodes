package treesetdemo3;
import java.util.*;

class mycomparator implements Comparator{

    @Override
    public int compare(Object obj1, Object obj2) {
  Integer i1=(Integer)obj1;
  Integer i2=(Integer)obj2;  
    if(i1<i2)
        return +1;
    else if(i1>i2)
        return -1;
    else
        return 0;
    } 
    
}


public class Treesetdemo3 {
  public static void main(String[] args) {
 TreeSet t=new TreeSet(new mycomparator());
 t.add(10);
 t.add(0);
 t.add(15);
 t.add(5);
 t.add(20);
 t.add(20);
      System.out.println(t);   
      System.out.println("10".compareTo("15"));
    }
    
}
