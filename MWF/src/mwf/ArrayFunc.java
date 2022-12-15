/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
