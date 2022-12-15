/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hello;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author amsia
 */
public class Hello {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        OutputStreamWriter out=new OutputStreamWriter(System.out);
        out.write("Hello World!");
    }
    
}
