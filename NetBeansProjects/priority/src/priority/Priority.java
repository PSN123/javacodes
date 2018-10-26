package priority;

import jdk.internal.org.objectweb.asm.commons.InstructionAdapter;

class war extends Thread {
public synchronized void run(){
    for(long a=0; a<5; a++)
    System.out.println("child Thread");
    Thread.currentThread().setName("Abhishek");
    System.out.println(Thread.currentThread().getName());}
}
public class Priority {
public static void main(String[] args) {
    war t=new war();
    Thread.currentThread().setPriority(10);
    Thread.currentThread().setName("pradeep");
    Thread.currentThread().getPriority();
    System.out.println(Thread.currentThread().getName());
    t.start();        
    for(int i=0; i<10; i++){
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getName());
        System.out.println("Maint thread:"+Thread.currentThread().getPriority());
    
        
    }
    }
    }

