package stacks;
import java.util.*;
class Node{
    public int info;
    public Node next;
    public Node(int i,Node n){
        info=1;
        next=n;
    }
}


public class Stacks {
private Node top;
public Stacks(){
    top=null;
}
private boolean empty(){
    if(top==null){
        return (true);
    }else{
        return (false);
    }
}
public final void push(int element){
    Node fresh;
    fresh=new Node(element, null);
        fresh.next=top;
        top=fresh;
    }
public final void pop(){
    System.out.println(top.info);
top=top.next;

}




    public static void main(String[] args) {
Stacks s=new  Stacks();
int m,n;
        System.out.println("Enter a number to convert:");
        m=Integer.parseInt(new Scanner(System.in).nextLine());
        if(m==0){
            System.out.println("Binary equivalent:"+0);
        
        }else{
            while(m != 0){
                n=m%2;
                s.push(n);
                m=m/2;}
            System.out.println("Binary equivalent:");
        while(!s.empty()){
            s.pop();}}
    new Scanner(System.in).nextLine();}}
    
      
    
    
    
    

