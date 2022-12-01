/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeat;

/**
 *
 * @author amsia
 */
public class Recursion {
    String health="Eat";
    String rest="Sleep";
    String passion="JAVA";
    String loop="repeat'uh!";
    int times=0;
    void repeat()
    {
        System.out.println(health+" , "+rest+" , "+passion+" , "+loop);
        times=times+1;
        if(times<10)
        {
            repeat();
        }
    }
    
}
