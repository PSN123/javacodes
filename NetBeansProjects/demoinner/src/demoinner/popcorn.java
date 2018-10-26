package demoinner;

//public class Demoinner {
//int x=10;
//static int y=20;
//    class inner{
//        public void m1(){
//            System.out.println(x);
//            System.out.println(y);
//        }
//    }
//    public static void main(String[] args) {
////        Demoinner d=new Demoinner();
////        Demoinner.inner i=d.new inner();
////        i.m1();
////    
//    new Demoinner().new inner().m1();
//    }
//    
//}
//class Demoinner{
//    int x=10;
//    
//    class inner{
//        int x=20;
//    
//        public void m1(){
//            int x=1000;
//            System.out.println(x);
//            System.out.println(inner.this.x);
//            System.out.println(Demoinner.this.x);
//        }
//    }
//public static void main(String aa []){
//    Demoinner.inner id=new Demoinner().new inner();
//id.m1();
//}
//
//}
//public class popcorn{
//    public void taste(){
//        System.out.println("salty");
//    }
//}
//
//class test{
//    public static void main(String aa []){
//        popcorn p=new popcorn(){
//          public void taste(){
//              System.out.println("spicy");
//          }  
//        };p.taste();
//        popcorn p1=new popcorn();
//        p1.taste();
//                
//        popcorn p2=new popcorn(){
//          public void taste(){
//              System.out.println("Buttery");
//          }  
//        };
//        p2.taste();
//        System.out.println(p.getClass().getName());
//        System.out.println(p1.getClass().getName());
//        System.out.println(p2.getClass().getName());
//    
//    }
//}
//class popcorn extends Thread{
//    public void run(){
//        for(int i=0;i<10; i++){
//            System.out.println("child thread");
//        }
//    }
//}
//class test{
//    public static void main(String aa []){
//        popcorn p=new popcorn();
//        p.start();
//       Thread.currentThread().setName("pradeep");
//        System.out.println();
//            System.out.println(Thread.currentThread().getName());
//            
//        }
//    }
// class popcorn{
//     public static void main(String aa []){
//         Thread p=new Thread(){
//           public void run(){
//               for(int i=0; i<10; i++){
//                Thread.currentThread().setPriority(10);
//                   System.out.println(Thread.currentThread().getName());
//               }
//           }  
//         };p.start();
//         for(int i=0;i<10; i++){
//             Thread.currentThread().setName("pradeep");
//             System.out.println(Thread.currentThread().getName());
//         }
//     }
// }

// class popcorn implements Runnable{
//
//    @Override
//    public void run() {
//        System.out.println("i am runnable thread");
//    }
//    }
// class test{
//     
//    public static void main(String aa []){
//        popcorn p=new popcorn();
//        Thread t=new Thread(p);
//        t.start();
//    } 
// }

class popcorn{
    public static void main(String aa []){
        Runnable p=new Runnable(){
          public void run(){
              System.out.println("i am runnable thread");
          }  
        };Thread t=new Thread(p);
        t.start();
    }
}