package hashcodedemo2;

public class Hashcodedemo2 {
int i;

    Hashcodedemo2(int i) {
    this.i=i;
        }

    public int hascode(){
        return i;
    }
    
    
    public static void main(String[] args) {

    Hashcodedemo2 h1=new Hashcodedemo2(10);
    Hashcodedemo2 h2=new  Hashcodedemo2(100);
        System.out.println(h1);
        System.out.println(h2);
    
    }
    
}
