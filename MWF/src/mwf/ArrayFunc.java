package mwf;

/**
 *
 * @author ABINESH JAIN A J
 */
public class ArrayFunc {
    public void calc(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=a[i]*2;
        }
        System.out.println("The answer is.....");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
