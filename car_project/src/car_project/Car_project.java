/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car_project;

/**
 *
 * @author amsia
 */
public class Car_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vehicle road=new vehicle();
        road.use="Transport";
        road.get_details();
        Car mustang=new Car();
        mustang.brand="Ford";
        mustang.model="Mustang GT";
        mustang.no_of_seats=4;
        mustang.no_of_tyres=4;
        mustang.get_details();
    }
    
}
