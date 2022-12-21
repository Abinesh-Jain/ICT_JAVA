package boxing;

/**
 *
 * @author ABINESH JAIN A J
 */
public class Boxing {

    public static void main(String[] args) {
        int i=10;
        Integer i2=Integer.valueOf(i);
        System.out.println(i2);
        int j=i2.intValue();
        System.out.println(j);
        Integer i3=34;
        System.out.println(i3);
        int k=i2;
        System.out.println(k);
        
    }
    
}
