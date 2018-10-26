/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Pradeep Negi
 */
public class Threads extends Thread {

    public void run(){
        System.out.println("hello world");
    }
    public static void main(String aa[]){
        Threads th=new Threads();
        th.start();
            
            
            }
    
}
