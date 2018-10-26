package stringsbuff;


public class Stringsbuff {

    public static void main(String[] args) {

//    StringBuffer sb=new StringBuffer();
//        System.out.println( sb.capacity());
//        sb.append("abcdefghijklmops");
//        System.out.println(sb.length());
//    sb.append("q");
//        System.out.println(sb.capacity());
//  
        
        StringBuffer sb1=new  StringBuffer("Durga");
//        System.out.println(sb1.capacity());
//        System.out.println(sb1.charAt(4));
//        System.out.println(sb1.length()); 
//        sb1.setCharAt(4, 'p');
//        System.out.println(sb1);
       sb1.append(" Durga");
       sb1.append(" software");
       sb1.append(" Solution");
       sb1.insert(4,'d');
       sb1.delete(4, 6);
       sb1.deleteCharAt(4);
       sb1.reverse();
       sb1.setLength(5);
       sb1.ensureCapacity(30000);
       sb1.append('R');
       sb1.trimToSize();
       System.out.println(sb1.capacity());
    
    }
    
}
