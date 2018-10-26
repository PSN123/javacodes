package binarysearch;
import java.util.*;

public class Binarysearch {

    public static void main(String[] args) {
ArrayList a=new ArrayList();
a.add("z");
a.add("J");
a.add("K");
a.add("B");
a.add("Z");
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        System.out.println(Collections.binarySearch(a,"L"));
        
    }
    
}
