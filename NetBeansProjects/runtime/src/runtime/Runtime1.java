package runtime;

public class Runtime1 {

    public static void main(String[] args)throws Exception {
  System.out.println(Runtime.getRuntime().availableProcessors());  
  Runtime.getRuntime().exec("notepad");
  

    }
}
