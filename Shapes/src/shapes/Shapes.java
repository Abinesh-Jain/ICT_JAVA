package shapes;

import java.util.Scanner;

/**
 *
 * @author ABINESH JAIN A J
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        Square a=new Square(x);
        Circle b=new Circle(y);
        a.area();
        b.area();
    }
    
}
