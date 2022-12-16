package palindrome;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Word : ");
        String s=in.nextLine();
        String p="";
        for(int i=s.length()-1;i>=0;i--)
        {
            p=p+s.charAt(i);
        }
        if(s.equals(p))
        {
            System.out.println("The entered word is a PALINDROME");
        }
        else
        {
            System.out.println("The entered word is NOT a PALINDROME");
        }
    }
    
}
