package checker;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your e-mail ID : ");
        String e=in.nextLine();
        String regex="^[a-zA-Z0-9+._-]+@[a-zA-Z0-9.-]+$";
        boolean res=e.matches(regex);
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
