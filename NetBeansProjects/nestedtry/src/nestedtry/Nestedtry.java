package nestedtry;

public class Nestedtry {

    public static void main(String[] args){
//    {
//     try{
//         try{
//             System.out.println("going to divide");
//             int b=39/0;
//         }catch(ArithmeticException e){System.out.println("e");}
// 
//     try{
//         int a[]=new int[5];
//         a[5]=4;
//     }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
//     System.out.println("other statement");
//     }catch(Exception e){System.out.println("handeled");} 
//     
//        System.out.println("normal flow");
//     
//    
//   try{
//       int a=50/0;
//   }catch(ArithmeticException e){System.out.println(e);}
//   System.out.println("it cannot divided by zero");
   
       try{
           int data=50/0;
           System.out.println(data);
       } catch(ArithmeticException e){System.out.println(e);
           System.out.println(":you cant divide a value by zero");}
       finally{System.out.println("finally block is always excecuted");}
           System.out.println("rest of code");
       }
        
     
     
     }   
    
    


