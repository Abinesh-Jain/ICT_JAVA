/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_converter;

/**
 *
 * @author amsia
 */
public class converter {
    String binary;
    public static void toBinary(int x)
    {
        int[] binary=new int[40];
        int i=0;
        while(x>0)
        {
            binary[i++]=(x%2);
            x/=2;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.println(binary[i]);
        }
    }
}
