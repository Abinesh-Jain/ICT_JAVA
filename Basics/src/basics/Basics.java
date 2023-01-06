package basics;
import java.util.*;

public class Basics {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Let's compare and find the sum, difference, product and modulus of two numbers");
        System.out.println("Enter the First number : ");
        int x=in.nextInt();
        System.out.println("Enter the second number : ");
        int y=in.nextInt();
        System.out.println("The entered numbers are "+x+" and "+y);
        if(x>y)
        {
            System.out.println(x+" is greater than "+y);
        }else if(y>x)
        {
            System.out.println(y+" is greater than "+x);
        }else
        {
            System.out.println("Both numbers are same or equal.");
        }
        int sum=x+y;
        int diff=x-y;
        float pro=x*y;
        float mod=x%y;
        System.out.println("The sum of "+x+" and "+y+" is "+sum);
        System.out.println("The difference of "+x+" and "+y+" is "+diff);
        System.out.println("The product of "+x+" and "+y+" is "+pro);
        System.out.println("The modulus of "+x+" and "+y+" is "+mod);
    }
    
}
