/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hash;

import java.util.*;

/**
 *
 * @author ABINESH JAIN A J
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
