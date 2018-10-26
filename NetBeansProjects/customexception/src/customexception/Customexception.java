package customexception;

import java.util.Scanner;

class youngException extends RuntimeException{
    
     youngException(String s){
    super(s);
}
}

class oldException extends RuntimeException{

    oldException(String s) {
   super(s);
    }
    
}


public class Customexception {

    public static void main(String[] args) {
    int a;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
if(a<18){
  throw new youngException("you are not Eligeble for wedding. Concentrate on your Study otherwise i give you left and right");
    
}else if(a>90){
throw new oldException("oye ek paar kaber m or shaadi karega !!! BAWDA");
} else
            System.out.println("get marry spoil your entire life /n Thank you");
        
    }
    
}
