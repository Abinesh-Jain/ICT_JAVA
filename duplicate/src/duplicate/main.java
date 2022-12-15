package duplicate;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Sentence....");
        String a=in.nextLine();
        String a_up=a.toUpperCase();
        String a_down=a.toLowerCase();
        System.out.println("The Sentence in UPPER CASE is - "+a_up);
        System.out.println("The Sentence in LOWER CASE is - "+a_down);
        int c=0;
        int i;
        char arr[]=a_down.toCharArray();
        for(i=0;i<a_down.length();i++)
        {
            c=1;
            for(int j=1;j<a_down.length();j++)
            {
                if(arr[i]==arr[j]&&arr[i]!=' '){
                    c++;
                    arr[j]=0;
                }
            }
        }
        if(c>1)
        {
            System.out.println(arr[i]);
        }
    }
    
}
