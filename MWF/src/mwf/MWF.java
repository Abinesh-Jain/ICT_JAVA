package mwf;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class MWF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of values.....");
        n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        ArrayFunc A=new ArrayFunc();
        A.calc(a);
    }
}
