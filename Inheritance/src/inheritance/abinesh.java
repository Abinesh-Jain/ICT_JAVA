/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author amsia
 */
abstract class anto
{
    String father_name="Anto Apsalom D";
    void type()
    {
        System.out.println("I'm Humorous");
    }
    void talent()
    {
        System.out.println("Naturaly Talented");
    }
}
public class abinesh extends anto{
    String name;
    void display_name()
    {
        System.out.println("I'm "+name);
    }
   
}
