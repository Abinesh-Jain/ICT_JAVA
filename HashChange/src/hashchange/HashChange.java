package hashchange;

import java.util.*;

/**
 *
 * @author ABINESH JAIN A J
 */
public class HashChange {

    public static void main(String[] args) {
        HashMap<String,String> a=new HashMap<>();
        a.put("Icecream","Venilla");
        a.put("Drinks","Mango");
        a.put("Food","xxx");
        for(Map.Entry m:a.entrySet())
        {
            System.out.println(m.getKey()+":"+m.getValue());
        }
        if(a.containsKey("Icecream"))
        {
            String map=a.get("Icecream");
            System.out.println(map);
            a.replace("Food",map);
            a.replace("Drinks","Fruti");
        }
        for(Map.Entry m:a.entrySet())
        {
            System.out.println(m.getKey()+":"+m.getValue());
        }
    }
    
}
