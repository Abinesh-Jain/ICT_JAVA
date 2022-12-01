/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cloning;

/**
 *
 * @author amsia
 */
public class Cloning {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args)throws CloneNotSupportedException {
        // TODO code application logic here
        abinesh hsc=new abinesh();
        jain sslc=(sslc)hsc.clone();
        System.out.println("The name and rollno is "+hsc.name+" and "+hsc.rollno);
    }
    
}
