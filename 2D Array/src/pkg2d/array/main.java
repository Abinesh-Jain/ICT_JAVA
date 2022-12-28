package pkg2d.array;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of ROWS : ");
        int r=in.nextInt();
        System.out.print("Enter number of COLUMNS : ");
        int c=in.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Add Elements : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]*2);
            }
        }
    }
}
