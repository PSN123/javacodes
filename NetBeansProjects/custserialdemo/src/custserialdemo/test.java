package custserialdemo;
import java.io.*;
 class Custserialdemo implements Serializable{
String username="paradeep";
transient String password="akhil";

private void writeObject(ObjectOutputStream os)throws Exception{
    os.defaultWriteObject();
    String epwd="123"+password;
    os.writeObject(os);
}

private void readObject(ObjectInputStream is)throws Exception{
    is.defaultReadObject();
    String epwd=(String)is.readObject();
    password=epwd.substring(3);
}}

public class test {
    public static void main(String[] args)throws Exception {
Custserialdemo cs=new Custserialdemo();
        System.out.println("cs"+cs.username+".."+cs.password);
FileOutputStream fos=new FileOutputStream("abc.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(cs);

FileInputStream fis=new FileInputStream("abc.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
Custserialdemo cs1=(Custserialdemo)ois.readObject();
        System.out.println(cs1.username+".."+cs1.password);    
    
    }
}

