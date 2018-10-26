package sync;

class mythread extends Thread {
    public synchronized void run(){
        for(int i=1; i<10; i++ ){
            System.out.println("dhoni");
        }try{
            Thread.sleep(2000);
        }catch(Exception e){}
}
}

class mythread1 extends Thread{
    public synchronized void run(){
        for(int i=1;i<10;i++){
            System.out.println("yuvraj");
        }try{
            Thread.sleep(2000);
        }catch(Exception e){}
    }
}




public class Sync {

    public static void main(String[] args)  {
   mythread t1=new mythread();
        System.out.println(Thread.currentThread());
 Thread.currentThread().setPriority(10);
   
   
   mythread1 t2=new mythread1();
        System.out.println(Thread.currentThread().getPriority()); 
   t1.start();
   t2.start();
        
    
    
    }
    
}
