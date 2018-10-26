
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherry;

//class p{

import java.awt.RenderingHints.Key;
import static java.lang.Math.random;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;

//    
//    public void m1(){
//    
//   for(int j=0;j<20;j++){
//       for(char i=62;i<65; i++){
//           if(i==10)
//               break;
//          
//         //  System.out.print(j);
//       
//       System.out.print(i);
//   } 
//   }
//    }
//
//    
//    public void m1(int i){
//        System.out.println("yes its int");    
//    }
//    
//    public void m1(double d){
//        System.out.println("yes its doouble value");
//    }
//    
//}
//
//
//
//
//
//public class Inherry {
//
//    public static void main(String[] args) {
//p n=new p();
//n.m1();
//
//
//    
//    }
//    
//}

//

//class inherry{
//    public void m1(String s){
//        System.out.println("String version");
//    }
//    public void m1(Object o){
//        System.out.println("Object Version");
//    }
//
//public static void main(String [] aa){
//    inherry i=new inherry();
//    i.m1(new Object());
//    i.m1("Candy");
//    i.m1(null);
//}
//}

//class inherry{
// public void m1(String s){
//     System.out.println("String version");
// }
//public void m1(StringBuffer sb){
//    System.out.println("Stringbuffer Version");
//}
//public static void main(String [] args){
//    inherry i=new inherry();
//    i.m1("Captian Candy");
//    i.m1(new StringBuffer("Iron man"));
//    i.m1(null); //<===CE: reference to m1 is ambiguous both method m1(java.lang.String)
//}
//}

//class inherry{
//
//public void m1(int i,float f){
//    System.out.println("int-float version");
//}
//public void m1(float f,int i){
//    System.out.println("flaot-int version");
//}
//public static void main(String [] aa){
//inherry i=new inherry();
//i.m1(10,1.5f);
//i.m1(1.5f,10);
////i.m1(10,10);//<==Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - reference to m1 is ambiguous
//        }
//}

class inherry{
    
    public void m1(int x){
        System.out.println("General Method"+x);
    }
public void m1(int... x){
    System.out.println("var arg methods:"+x);
}
public static void main(String [] args){
    inherry i=new inherry();
    i.m1(10);
i.m1(200,100);
i.m1();

}
}
