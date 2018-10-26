package link;

import java.util.Scanner;

 class Node{
    int data;
    Node next;

 } 
 
 class Linked{
  Node head; 

 public void insert(int data){   
    
    Node n=new Node();
n.data=data;
n.next=null;

if(head==null){
    head=n;
}else{
    Node nd=head;
while(nd.next!=null){
    nd=n.next;
}
nd.next=n;

}

        
 }
 
 public void insertAtfirst(int index,int data){
     Node n=new Node();
n.data=data;
n.next=null;
n.next=head;
head=n;
}
 
 public void inserAt(int index,int data){
 Node n=new Node();
n.data=data;
n.next=null;

if(index==0){
    insertAtfirst(index, data);
}else{
Node nb=head;
for(int i=0;i<index-1;i++){
    n=nb.next;
}
nb.next=n.next;
n.next=nb;
 }
 }
 public void deleteAt(int index){
     if(index==0)
     {
         head=head.next;
     }
     else{
         Node n=head;
         Node n1=null;
         for(int i=0;i<index-1;i++){
             n=n.next;
         }
         n1=n.next;
         n.next=n1.next;
         n1=null;
     }
         }
 
 
 
 
public void Display(){
    Node n=head;
while(n.next!=null){
    System.out.println(n.data);
n=n.next;
}
    System.out.println(n.data);
} 
 }




public class Link {

    public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
        Linked lk=new Linked();
lk.insert(45);
lk.insert(20);
lk.deleteAt(1);
        lk.Display();



//while(true){
//    System.out.println("Enter your chioce");
//    System.out.println("1 for insertion");
//    System.out.println("2 for ");
//    System.out.println("");
//    System.out.println("");
//    System.out.println("");
//    System.out.println("");
//
//
//int choice=sc.nextInt();
//
//
//switch(choice){
//    case 1:
//        System.out.println("Inserted values");
//lk.insert(sc.nextInt());
//        break;
//    case 2:
//    try{
//  if(lk==null){
//      System.out.println("Please write "+sc.next());
//  }else{
//lk.Display();
//  }}catch(NullPointerException e){
//   
//  }
//
//
//break;
//
//        
//    
//    }
//    }
}
}

