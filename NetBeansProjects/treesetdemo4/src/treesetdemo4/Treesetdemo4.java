package treesetdemo4;
import java.util.*;

public class Treesetdemo4 {

    public static void main(String[] args) {
TreeSet t=new TreeSet(new Mycomparator());
t.add("Raju");    
t.add("shobhaRani");    
t.add("Rajakumari");
t.add("Gangabhawani");
t.add("Ramalamma");
System.out.println(t);
    }
    }
class Mycomparator implements Comparator{
    
    @Override
    public int compare(Object obj1,Object obj2){
    String s1=obj1.toString();
    String s2=(String)obj2;
    return s2.compareTo(s1);
    //return -s1.compareTo(s2);
    }
    
    }
    