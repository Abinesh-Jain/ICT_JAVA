/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package char_array;

import java.util.Scanner;

/**
 *
 * @author amsia
 */
public class Char_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String text=in.nextLine();
        char[] arr=text.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("The Reversed String is as follows");
        for(int j=arr.length;j>=0;j--)
        {
            System.out.println(arr[j]);
        }
    }
    
}
