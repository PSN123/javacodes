package pkgtry.catch1;

public class TryCatch1 {

    public static void main(String[] args) {
    try{
        System.out.println(10/0);
    }catch(ArithmeticException e){
        e.printStackTrace();
       // System.out.println(e.toString());
        //System.out.println(e.getMessage());
    }
    
    }
    
}