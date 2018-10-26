package stringdemo;

public class Stringdemo {
//String name;
int rollno;

//    Stringdemo(String name,int rollno) {
//  //  this.name=name;
//    this.rollno=rollno;
//    }
    
    public String toString(){
        return rollno+"";
    }
public int hashCode() {
    return rollno;
}
    public static void main(String[] args) {
Stringdemo sd=new Stringdemo();
//Stringdemo sd1=new Stringdemo("abhisek " , 102);
        System.out.println(sd.hashCode());
        System.out.println();

    
    
    }
    
}
