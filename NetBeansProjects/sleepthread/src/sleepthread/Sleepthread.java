package sleepthread;

public class Sleepthread extends Thread {
public void run(){
for(int a=1; a<=5; a++)
try{Thread.sleep(500);
}catch(Exception e){System.out.println(e);}
    System.out.println("pradeep");    
}

    public static void main(String[] args) {
   Sleepthread st=new Sleepthread();
   Sleepthread st1=new Sleepthread();
   st.start();
   st1.start();
    
    
    }
}