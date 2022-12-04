/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eb_bill;

import java.util.Scanner;

/**
 *
 * @author amsia
 */
public class EB_Bill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter your EB Consumption in Units : ");
        int unit=in.nextInt();
        int amount;
        if(unit<=100)
        {
            amount=unit*2;
        }
        else if(unit>100&&unit<=500)
        {
            amount=((unit-100)*5)+(100*2);
        }
        else
        {
            amount=((unit-500)*10)+(400*5)+(100*2);
        }
        System.out.println("Your EB Consumption amount in Rupees is "+amount);
    }
}
