/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runnable_thread;

/**
 *
 * @author amsia
 */
class parent implements Runnable
{
    public void run()
    {
        System.out.println("B");
    }
}
public class child extends Thread{
    public void run()
    {
        System.out.println("A");
        Thread t=new Thread(new parent());
        t.start();
    }
}
