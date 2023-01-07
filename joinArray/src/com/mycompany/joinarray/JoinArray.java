package com.mycompany.joinarray;

/**
 *
 * @author ABINESH JAIN A J
 */
public class JoinArray {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
            c[i+a.length]=b[i];
        }
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
}
