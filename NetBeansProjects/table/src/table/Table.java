package table;
import java.util.*;
import java.io.*;
public class Table {

    public static void main(String[] args)throws Exception {
int count=0;
        while(true){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your choice");
  try{
      
        int b=sc.nextInt();
  
for(int a=1; a<=10; a++){
    System.out.println(b+ " X " + a + " = " + (a*b));
}
       
    }catch(InputMismatchException e){
        System.out.println(e);
        System.out.println("please enter valid number");
   
 }
count++;

           
            
            System.out.println("this much time code run "+count); 
    if(count==5){
        System.out.println("you Reached your Maximum Attempts");
  File f=new File("C:\\Users\\Pradeep Negi\\Desktop","techno");
  f.mkdir();
 File f2=new File(f,"data.txt");
 f2.createNewFile();
 FileWriter fw=new FileWriter(f2);
 fw.write(count);
 fw.flush();
        System.out.println("data saved at this Location:C:\\Users\\Pradeep Negi\\Desktop");
        System.exit(count);
    }
    
    
    }
    }

   
}

