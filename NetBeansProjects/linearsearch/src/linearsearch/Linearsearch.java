package linearsearch;

import java.util.Scanner;

/**
 *
 * @author Pradeep Negi
 */
public class Linearsearch {
        
    public static void main(String[] args) {
   int arr[]=new int[10];
   for(int i=0; i<10; i++)
       arr[i]=i;
   
   Scanner sc=new Scanner(System.in);
        System.out.println("Enter search key:");
        int search=sc.nextInt();
        
        boolean found=false;
        
        int indexfoundat=-1;
        
        Long startime=System.nanoTime();
        
        for(int i=0; i<10; i++){
            found=true;
            indexfoundat=i;
            break;
        }
        if(!found){
            System.out.println("not found");

        }else
            System.out.println("found at:"+indexfoundat);
    
        Long endtime=System.nanoTime();
        System.out.println("total time: " + (endtime-startime)+"ns");
    }
    
}
