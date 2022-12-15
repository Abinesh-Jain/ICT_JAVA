/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checker;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your e-mail ID : ");
        String e=in.nextLine();
        String r="^[a-zA-Z0-9+._-]+@+[a-zA-Z0-9.-}+$";
        boolean res=e.matches(r);
        if(res)
        {
            System.out.println("Valid ID!");
        }
        else
        {
            System.out.println("Invalid ID!");
        }
    }
    
}
