package vectorexample;
import java.util.*;

public class VectorExample {

    public static void main(String[] args) {
 
  Vector v=new Vector();
        System.out.println(v.capacity());
  for(int  a=0; a<=10; a++){
      v.addElement(a);
  }    
        v.addElement("pradeep");
        System.out.println(v.capacity());
        System.out.println(v);
        System.out.println(v.removeElement(5));
        System.out.println(v);
        System.out.println(v.get(4));
        System.out.println(v);
        System.out.println(v.add("pradeep"));
        System.out.println(v);
        System.out.println();
        v.isEmpty();
        System.out.println(v);
      }    
}
