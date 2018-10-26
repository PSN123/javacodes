package clonesha;

class cat{
    int j;
    cat(int j){
        this.j=j;
    }
}

 class Clonedee implements Cloneable{
cat c;
int i;

    public Clonedee(cat c, int i) {
        this.c = c;
        this.i = i;
    }

public Object clone() throws CloneNotSupportedException{
    cat c1=new cat(c.j);
    Clonedee cd=new Clonedee(c, i);
    return cd;
}
}
public class deepcloning{
    
    public static void main(String[] args)throws CloneNotSupportedException{
    cat c=new cat(10);
  Clonedee cd=new Clonedee(c, 20);
        System.out.println(cd.i+".."+cd.c.j);
        Clonedee dc=(Clonedee)cd.clone();
        dc.i=888;
        dc.c.j=1000;
        System.out.println(dc.i+"..."+dc.c.j);
    }
    
}

  
  