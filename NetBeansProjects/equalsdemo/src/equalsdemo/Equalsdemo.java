package equalsdemo;

public class Equalsdemo {
String name;
int roll_no;

    Equalsdemo(String name,int roll_no) {
    this.name=name;
    this.roll_no=roll_no;
    }

    public boolean equals(Object obj){
        if(obj==this){
            return true;
        }
    if(obj instanceof Equalsdemo){
        Equalsdemo ed=(Equalsdemo)obj;
   if(name.equals(name)&&roll_no==ed.roll_no){
       return true;
   } 
   }
        return false;
        
    }
    public static void main(String[] args) {
Equalsdemo ed=new Equalsdemo("pradeep", 101);
Equalsdemo ed1=new Equalsdemo("tony", 102);
Equalsdemo ed2=new Equalsdemo("captain", 103);
Equalsdemo ed3=new Equalsdemo("pradeep", 101);
Equalsdemo ed4=ed;
        System.out.println(ed.equals(ed4));
        System.out.println(ed.equals(ed2));
        System.out.println(ed.equals(ed3));
        System.out.println(ed4.equals(ed));

    }
    
}
