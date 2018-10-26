package reversestring;
import java.util.*;

 class Node{
    public char info;
    public Node next;
    public Node(char i, Node n){
        info=i;
        next=n;
    }
}

public class ReverseString {
private Node top;
public ReverseString(){
top=null;    
}
private boolean empty(){
    if(top==null){
        return (true);}
    else{
        return(false);}}

public void push(char element){
    Node fresh;
    fresh =new Node(element, null);
    fresh.next= top;
    top=fresh;
}

public void pop(){
    System.out.println(top.info);
top=top.next;
}

    public static void main(String[] args) {
ReverseString rs=new ReverseString();
char[] str=new char[20];
        System.out.println("\nEnter a String:");
       str=new Scanner(System.in).nextLine().toCharArray();
       for(int i=0; i<str.length; i++){
           rs.push(str[i]);}
           System.out.println("\nThe reversed String is:");
           while(!rs.empty()){
               rs.pop();}
    new Scanner(System.in).nextLine();}
    }
        
        
    
    

