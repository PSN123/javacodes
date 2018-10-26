package testclone;
class cat{
    int j;
    cat(int j){
        this.j=j;
    }
}

public class TestClone implements Cloneable{

cat c;
int i;
TestClone(cat c,int i){
    this.c=c;
    this.i=i;
}
public Object clone()throws CloneNotSupportedException{
   return super.clone();
}

//int i=10;
//int j=20;
    
    public static void main(String[] args) throws CloneNotSupportedException{

cat c=new cat(10);
TestClone t=new TestClone(c, 20);
        System.out.println(t.i+"..."+t.c.j);
TestClone t1=(TestClone)t.clone();
t1.i=888;
t1.c.j=9090;
        System.out.println(t.i+"..."+t1.c.j);
















//TestClone t=new TestClone();
//TestClone t1=(TestClone)t.clone();
//     t1.i=100;
//     t1.j=200;
//   
//      System.out.println(t1.i+"..."+t1.j);
    }
    
}
