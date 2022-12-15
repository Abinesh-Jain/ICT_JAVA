/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package al;

import java.util.ArrayList;
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
        int n;
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> A1=new ArrayList<>();
        System.out.print("Enter the number of values in list...");
        n=in.nextInt();
        for(int i=0;i<n;i++)
        {
             A1.add(in.nextInt());
        }
        System.out.println(A1);
        int x=2;
        for(int i=0;i<A1.size();i++)
        {
            x=x*A1.get(i);
            A1.add(x);
        }
        System.out.println("The Complete list is "+A1);
    }
    
}
