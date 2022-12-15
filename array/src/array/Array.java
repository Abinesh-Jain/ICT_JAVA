/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author amsia
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of values :");
        int v=in.nextInt();
        int num[]=new int[v];
        System.out.println("There are "+v+" values in the array.");
        System.out.println("Enter t3he values :");
        for(int i=0;i<v;i++)
        {
            num[i]=in.nextInt();
        }
        System.out.println("The "+v+" values in the array are as follows");
        for(int j=0;num.length>j;j++)
        {
            System.out.println(num[j]);
        }
        
    }
}
