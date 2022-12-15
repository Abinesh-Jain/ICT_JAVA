package multiply.array;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {
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
        for(int i=0;i<a.length;i++)
        {
            a[i]=a[i]*2;
        }
        System.out.println("The answer is.....");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
