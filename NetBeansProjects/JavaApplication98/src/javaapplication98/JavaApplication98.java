package javaapplication98;

 strictfp abstract class a{
   public  abstract void  sum(); 

}


public class JavaApplication98 extends a {

    public static void main(String[] args) {
    
  JavaApplication98 js=new JavaApplication98();
  js.sum();
  
  a g=new JavaApplication98();
  g.sum();
    
    }

    @Override
    public void sum() {
int x=10;
int y=20;
    
        System.out.println(x+y);
    }

    
  
    
}
