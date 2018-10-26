package notepad;

public class Notepad {

    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().exec("notepad");
        System.out.println(Runtime.getRuntime().availableProcessors());
    
    
    }
    
}
