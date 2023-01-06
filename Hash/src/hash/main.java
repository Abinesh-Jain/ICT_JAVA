package hash;

import java.util.*;

public class main {

    public static void main(String[] args) {
        HashMap<Integer,String> A=new HashMap<>();
        A.put(1,"Abinesh");
        A.put(2,"Anon");
        A.put(3,"Adam");
        A.put(4,"Bravin");
        System.out.println("The HashMap is ....");
        for(Map.Entry m:A.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        
    }
    
}
