package pkg2d.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        System.out.print("Enter the number of ROWS : ");
        int r=in.nextInt();
        for(int i=0;i<r;i++)
        {
            System.out.print("Enter number of ELEMENTS : ");
            int e=in.nextInt();
            ArrayList<Integer> line=new ArrayList<>();
            for(int j=0;j<e;j++)
            {
                line.add(in.nextInt());
            }
            arr.add(line);
        }
        System.out.print("Enter number of QUERIES : ");
        int q=in.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=in.nextInt();
            int y=in.nextInt();
            try
            {
                System.out.println("The number is : "+arr.get(x-1).get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}
