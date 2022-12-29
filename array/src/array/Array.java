package array;

import java.util.Scanner;

/**
 *
 * @author amsia
 */
public class Array {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of values : ");
        int v=in.nextInt();
        int num[]=new int[v];
        System.out.println("There are "+v+" values in the array.");
        System.out.println("Enter the values :");
        for(int i=0;i<v;i++)
        {
            num[i]=in.nextInt();
        }
        System.out.println("The "+v+" values in the array are as follows");
        for(int j=0;num.length>j;j++)
        {
            System.out.println(num[j]*2);
        }
        
    }
}
