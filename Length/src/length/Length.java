package length;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class Length {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String s1=in.nextLine();
        System.out.println("Enter Last Name : ");
        String s2=in.nextLine();
        String s3=s1.concat(" "+s2);
        System.out.println("The Full Name is "+s3);
        System.out.println("Length of String is "+s3.length());
    }
    
}
