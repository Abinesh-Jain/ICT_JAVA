package al;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {

    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> A1=new ArrayList<>();
        System.out.print("Enter the number of values in list...");
        n=in.nextInt();
        for(int i=0;i<n;i++)
        {
             A1.add(i,in.nextInt());
        }
        System.out.println(A1);
        ArrayList<Integer> A2=new ArrayList<>();
        int x;
        for(int i=0;i<A1.size();i++)
        {
            x=2*A1.get(i);
            A2.add(i,x);
        }
        System.out.println(A2);
    }
    
}
