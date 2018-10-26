package stringeq;

public class Stringeq {

    public static void main(String[] args){

    String s1=new String("Pradeep"); 
String s2=s1.intern();
        System.out.println(s1==s2);
        String s3="pradeep";
        System.out.println(s2==s3);
//    String s2=new String("pradeep");
//        System.out.println(s1==s2);
//    String s3="pradeep";
//        System.out.println(s1==s3);
//   
//    String s4="pradeep";
//        System.out.println(s3==s4);
//    
    
    }
    
}
