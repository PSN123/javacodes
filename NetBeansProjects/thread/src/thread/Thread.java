package thread;

class abc extends Thread{
    public void Run(){
        for(int a=0; a<12; a++)
        {
            System.out.println(a);
        }
    }

    
}


public class Thread {

    public static void main(String[] args) {
 
abc t=new abc();
t.start();
    
 for(int a=0; a<10; a++)
 {
     System.out.println(a);    
 }
    
    }
    
}
