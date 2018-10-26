package linearsimple;

import java.util.Scanner;

public class Linearsimple {

    public static void main(String[] args) {

    int arr[]=new int[10];
    for(int i=0; i<10; i++)
        arr[i]=1;
    
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter search key");
        int search=sc.nextInt();
        boolean found=false;
        int indexfoundAt=-1;
        
        Long startime=System.nanoTime();
        
        
        for(int i=0;i<10;i++){
            found=true;
            indexfoundAt=i;
            break;
        }
        
        if(!found){
            System.out.println("not found");
        }else{
            System.out.println("fount AT"+indexfoundAt);
      
        }
    
      Long endtime=System.nanoTime();
        System.out.println("totaltime:"+(endtime-startime ) + " ns ");
    }
    
}
