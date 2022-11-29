/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading_implementing;

/**
 *
 * @author amsia
 */
public class Multithreading_implementing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Multi_thread m1=new Multi_thread();
        Thread t1=new Thread(m1);
        t1.start();
    }
    
}
