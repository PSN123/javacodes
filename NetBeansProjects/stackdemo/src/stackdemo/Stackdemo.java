package stackdemo;
import java.util.*;

public class Stackdemo {

    public static void main(String[] args) {
Stack s=new Stack();
s.push("pradeep");
s.push(1997);
s.push("karan");
s.push(1997);



        System.out.println(s);
        System.out.println(s.search("abhishek"));
        System.out.println(s.capacity());
        System.out.println(s.peek());
        
    }
    
}
