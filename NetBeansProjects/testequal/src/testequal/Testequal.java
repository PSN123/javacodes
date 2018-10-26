package testequal;

public class Testequal {
int age;
String name;
Testequal(int age,String name){
    this.age=age;
    this.name=name;
}
  public boolean equals(Object obj){
   if(obj instanceof Testequal){
       Testequal  t=(Testequal)obj;
  if(name.equals(t.name)&& age==t.age){
       
       return true;    
   }else{
     return false;
  }
  }
   return false;
  }
  public int Hashcode(){
      return name.hashCode()+age;
  }
  public String  toString(){
      return name+age;
  } 
  
    public static void main(String[] args) {
Testequal t=new Testequal(14, "pradeep");
        System.out.println(t.Hashcode());
        System.out.println(t);
    


//int a=10,b=20;
//
//        System.out.println(a==b);
//        
//    String s=new String("pradeep");    
//     String s1=new String("pradeep");
//   StringBuffer sb=new StringBuffer("durga");
//   StringBuffer sb1=new StringBuffer("durga");
//        System.out.println(s==s1);
//        System.out.println(s.equals(s1));
//        System.out.println(sb==sb1);
//        System.out.println(sb.equals(sb1)); 
// //       System.out.println(s==sb1);
//        System.out.println(s.equals(sb1));
//     System.out.println(s==null);
  
  //Hashcode()
//        Testequal t=new Testequal();
//        System.out.println(t.hashCode());
//        
//        StringBuffer s=new StringBuffer("pradeep");
//        StringBuffer s1=new StringBuffer("pradeep");
//        System.out.println(s.equals(s1));
//        System.out.println(s.hashCode());
//        System.out.println(s1.hashCode());
        
    }
    
}
