package largeno;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class LargeNo {
        int findlarge(int a[],int n,int i)
        {
            if(i==n-1)
            {
                return a[i];
            }
            int repe=findlarge(a,n,i+1);
            int out=Math.max(repe,a[i]);
            return out;
        }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of values......");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values......");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        LargeNo L=new LargeNo();
        int max=L.findlarge(a, n, 0);
        System.out.println("The maximum value in the entered numbers is "+max);
    }  
}
