/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single;

/**
 *
 * @author Pradeep Negi
 */
public class Single {

private static Single s=new Single();


private Single(){
    
}
public static Single getSingle(){
    return s;
}
    
    public static void main(String[] args) {
    Single s=Single.getSingle();
        System.out.println(" hello world");    
    }
    
}
