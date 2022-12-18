package addfunc;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {
    static int sum(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("The sum is "+sum(a,b));
    }
}
