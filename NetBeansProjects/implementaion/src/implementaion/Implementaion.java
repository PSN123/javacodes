package implementaion;
import java.util.*;
import java.io.*;

public class Implementaion {

    static void push(Stack<Integer> st){
        for(int i=0; i<5; i++){
            st.push(i);
        }
    }
    
    static void pop(Stack<Integer> st){
        System.out.println("pop :");
        
        for(int i=0; i<5; i++){
            Integer y=(Integer)st.pop();
            System.out.println(y);
        }
    }
    
    public static void main(String[] args) {
Stack<Integer> st=new Stack<Integer>();
push(st);
pop(st);        
    }
    
}
