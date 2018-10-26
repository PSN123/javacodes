package random.number;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

    ArrayList <Integer>li=new ArrayList();
    Random rd=new Random();
    li.add(rd.nextInt(10000));
    
    Iterator itr=li.iterator();
    while(itr.hasNext()){
        System.out.println("here is your random numbers"+li.clone());
    
    }
        
            
        
    
    }
    
}
