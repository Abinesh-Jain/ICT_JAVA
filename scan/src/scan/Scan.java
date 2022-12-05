/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scan;

import java.util.Scanner;

/**
 *
 * @author amsia
 */
public class Scan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       int c=a+b;
       System.out.println(c);
       if(a>b){
           System.out.println(a+" is greater than"+b );
       }
       else{
           System.out.println(b+" is greater than "+a);
       }    
    }
    
}
