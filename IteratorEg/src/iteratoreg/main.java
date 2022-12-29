package iteratoreg;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {

    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        for(int i=1;i<=10;i++)
        {
            arr.add(i);
        }
        System.out.println(arr);
        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            Integer I=(Integer)itr.next();
            if(I%2==0)
            {
                
            }
            else
            {
               itr.remove();
            }
        }
        System.out.println(arr);
    }
    
}
