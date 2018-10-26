package hashcodedemo3;

public class Hashcodedemo3 {
int i;
        Hashcodedemo3(int i){
            this.i=i;
        }
public String toString(){
    return i+"";
}    
    public int hascode(){
        return i;
    } 
    public static void main(String[] args) {
Hashcodedemo3 h1=new Hashcodedemo3(10);
Hashcodedemo3 h2=new Hashcodedemo3(100);
        System.out.println(h1);
        System.out.println(h2);
    
    }
    
}
