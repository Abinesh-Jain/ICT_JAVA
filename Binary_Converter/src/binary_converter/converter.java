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
    void toBinary(int x)
    {
        int num=0;
        while(num>0)
        {
            binary=(num%2)+binary;
            num/=2;
        }
    }
}
