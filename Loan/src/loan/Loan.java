/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loan;

import java.util.Scanner;

/**
 *
 * @author amsia
 */
public class Loan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int amount=in.nextInt();
        int payment=0;
        for(int i=1;i<=3;i++)
        {
            amount=amount-((amount*10)/100);
        }
        System.out.println("The remaining amount after 3 months is : "+amount);
    }
    
}
