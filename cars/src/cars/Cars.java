/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cars;

/**
 *
 * @author amsia
 */
public class Cars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        car mustang=new car();
        mustang.model="Mustang GT";
        mustang.brand="FORD";
        mustang.type="racing";
        mustang.engine_no=673627;
        mustang.chase_no=5326;
        mustang.get_details();
        mustang.get_details(5);
    }
    
}
