/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception_handling;

/**
 *
 * @author amsia
 */
public class divide {
    void division()
    {
        try
        {
            int a=20;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
