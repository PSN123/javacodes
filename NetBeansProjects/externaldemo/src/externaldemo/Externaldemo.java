package externaldemo;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class test implements Externalizable{
    String s;
    int i;
    int j;
    public test(){
        System.out.println("public no-arg consturctor");
    }
    public test( String s,int i,int j){
        this.s=s;
        this.i=i;
        this.j=j;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
 out.writeObject(s);
 out.write(i);
 
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
   s=(String)in.readObject();
   i=in.readInt();
   }}


public class Externaldemo {

    public static void main(String[] args) throws Exception {
test t=new test("pradeep", 10, 20);
        System.out.println(t.s+".."+t.i+".."+t.j);    
FileOutputStream fos=new FileOutputStream("abc.txt") ;
    ObjectOutputStream oos=new ObjectOutputStream(fos); 
    oos.writeObject(t);
    
        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        test t1=(test)ois.readObject();
        System.out.println(t1.s+".."+t1.i+".."+t1.j);
    }
    
}
