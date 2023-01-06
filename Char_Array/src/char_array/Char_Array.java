package char_array;

import java.util.Scanner;

public class Char_Array {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String text=in.nextLine();
        char[] arr=text.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("The Reversed String is as follows");
        for(int j=arr.length-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
    }
    
}
