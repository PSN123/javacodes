package gc;
 

public class GC {
public void finalize(){
    System.out.println("object is grabage");
}    
public static void main(String...pradeep){
    GC g1=new GC();
    GC g2=new GC();
    
    g1=null;
    g2=null;
    System.gc();
}
}
