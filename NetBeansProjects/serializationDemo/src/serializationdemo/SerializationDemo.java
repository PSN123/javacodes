package serializationdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class test implements Serializable{
int a=20;
transient int b=30;
}
public class SerializationDemo {
    
public static void main(String[] args) throws Exception {
test t=new test();
FileOutputStream fis=new FileOutputStream("abs.src");
ObjectOutputStream oos=new ObjectOutputStream(fis);
oos.writeObject(oos);
        
FileInputStream fio=new FileInputStream("abs.src");
ObjectInputStream ois=new ObjectInputStream(fio);
test t1=(test)ois.readObject();
    System.out.println(t.a+"");

}
}
