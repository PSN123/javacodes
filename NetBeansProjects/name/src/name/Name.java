package name;

class warrior extends Thread{
    
    public void run(){
        System.out.println("This thread is executed by child thread:"+Thread.currentThread().getName());
    }
    
}


public class Name {


    public static void main(String[] args) {
warrior w=new warrior();
w.start();
{
        System.out.println("this thread is executed by main thread:"+Thread.currentThread().getName());
    }

//        System.out.println(Thread.currentThread().getName());   
//  Thread.currentThread().setName("Iron man");
//        System.out.println(Thread.currentThread().getName());
//        warrior w=new warrior();
//        System.out.println(w.getName());
//Thread.currentThread().setName("Captain America");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(10/0);
//    }
    
}
}
