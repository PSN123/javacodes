package serializationdemo2;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class dog implements Serializable{
   int a=10;
}
class cat implements Serializable{
int b=20;    
}
class rat implements Serializable{
   transient  int c=40;
}



public class Serializationdemo2 {

    public static void main(String[] args) throws Exception{
dog d=new dog();
cat c=new cat();
rat r=new rat();

        FileOutputStream fis=new FileOutputStream("abc.src");
        ObjectOutputStream oos=new ObjectOutputStream(fis);
        oos.writeObject(d);
        oos.writeObject(c);
        oos.writeObject(r);
        
        FileInputStream fos=new FileInputStream("abc.src");
        ObjectInputStream ois=new ObjectInputStream(fos);
    Object o=ois.readObject();
     if(o instanceof dog){
         dog d1=(dog)o;
         System.out.println(d1.a);
     }else if(o instanceof cat){
         cat c1=(cat)o;
         System.out.println(c1.b);
     }else if(o instanceof rat){
         rat r1=(rat)o;
         System.out.println(r1.c);
     }
        System.out.println();
    }
    
}
