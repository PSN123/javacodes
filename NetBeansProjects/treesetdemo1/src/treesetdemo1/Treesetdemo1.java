package treesetdemo1;
import java.util.*;
public class Treesetdemo1 {

    public static void main(String[] args) {
TreeSet t=new TreeSet();
t.add("a");
t.add("A");
t.add("B");
t.add("A");
t.add("Z");
        System.out.println("a".compareTo("A"));
        System.out.println("A".compareTo("A"));
        System.out.println("B".compareTo("Z"));
        
//t.add(null);
//Example 2
//t.add(new StringBuffer("A"));
//t.add(new StringBuffer("Z"));
//t.add(new StringBuffer("L"));
//t.add(new StringBuffer("B"));
System.out.println("");
System.out.println(t);
    
    }
    
}
