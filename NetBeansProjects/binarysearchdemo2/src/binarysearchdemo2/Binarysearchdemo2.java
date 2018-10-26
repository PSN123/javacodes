package binarysearchdemo2;
import java.util.*;

public class Binarysearchdemo2 {

    public static void main(String[] args) {
ArrayList l=new ArrayList();
l.add(15);
l.add(0);
l.add(20);
l.add(10);
l.add(5);
        Collections.sort(l, new MyComparator()); 
        System.out.println(l);
        System.out.println(Collections.binarySearch(l, 10, new MyComparator()));
        System.out.println(l);
        System.out.println(Collections.binarySearch(l, 20, new MyComparator()));
        System.out.println(l);
        System.out.println(Collections.binarySearch(l, 9,new MyComparator()));
        System.out.println(l);
    }
}
class MyComparator implements Comparator
{
    @Override
    public int compare(Object obj1, Object obj2) {
     Integer i1=(Integer)obj1;
     Integer i2=(Integer)obj2;
    return i2.compareTo(i1);
    }
 
}
    