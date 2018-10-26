package serializationdemo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
    cat c=new cat();
   
}
class cat implements Serializable{
rat r=new  rat();
}
class rat implements Serializable{
transient int a=20;    
}

public class Serializationdemo3 {

    public static void main(String[] args) throws Exception {

        Dog d=new Dog();
        FileOutputStream fos=new FileOutputStream("abc.src");
        ObjectOutputStream  oos=new ObjectOutputStream(fos);
        oos.writeObject(d);
    
    FileInputStream fis=new FileInputStream("abc.src");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
       Dog d2=(Dog)ois.readObject();
        System.out.println(d2.c.r.a);
    }
    
}
