package arraychecker;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {
    static boolean func(int a[])
            {
                if(a[0]==2||a[1]==3)
                {
                    return false;
                }
                else if(a[0]==3||a[1]==2)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[]=new int[2];
        System.out.println("Enter the two numbers....");
        for(int i=0;i<2;i++)
        {
            a[i]=in.nextInt();
        }
        boolean out=func(a);
        System.out.println(out);
    }
}
