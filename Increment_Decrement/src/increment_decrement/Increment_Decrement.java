/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package increment_decrement;

/**
 *
 * @author amsia
 */
public class Increment_Decrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0;
        int pre_in=++x;
        int pst_in=x++;
        int pre_de=--x;
        int pst_de=x--;
        System.out.println("The Pre-Increment value of x is "+pre_in);
        System.out.println("The Post-Increment value of x is "+pst_in);
        System.out.println("The Pre-Decrement value of x is "+pre_de);
        System.out.println("The Post-Decrement value of x is "+pst_de);
        int a=0;
        int b=0;
        int c=0;
        int ans=((++a) + (b--))*c++;
        System.out.println("The Answer is "+ans);
    }
    
}
