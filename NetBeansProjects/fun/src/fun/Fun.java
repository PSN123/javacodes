/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Pradeep Negi
 */
public class Fun {

public int password() {
  
 ArrayList <Integer>li=new ArrayList();
 
  Random rand = new Random();
 
     
        int rand_int1 = rand.nextInt(1000);
       
        li.add(rand.nextInt(1000));
           
      
 
   
return li.get(0);

}

public void hardy(){
    System.out.println("value of otp"+password()); 
}


public static void main(String[] args) {
    Fun un=new Fun();
    un.hardy();

}
    
}
