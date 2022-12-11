/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.Iterator;

/**
 *
 * @author amsia
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<6;i++)
        {
            list.add(i);
        }
        int x=0;
        Iterator<Integer> it=list.iterator();
        while(it.hasNext())
        {
            x+=it.next();
        }
        System.out.println(x);
    }
    
}
