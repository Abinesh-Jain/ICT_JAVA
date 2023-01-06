package loan;

import java.util.Scanner;

public class Loan {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int amount=in.nextInt();
        for(int i=1;i<=3;i++)
        {
            amount=amount-((amount*10)/100);
        }
        System.out.println("The remaining amount after 3 months is : "+amount);
    }
    
}
