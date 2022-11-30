/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_project;

/**
 *
 * @author amsia
 */
class vehicle
{
    String use;
    void get_details(){
        System.out.println("Car is Vehicle.");
    }
}
public class Car extends vehicle{
    String brand;
    String model;
    int no_of_seats;
    int no_of_tyres;
    @Override
    void get_details()
    {
        System.out.println(model+" is of "+brand+" brand. It has "+no_of_seats+" seats and "+no_of_tyres+" tyres. It is used for "+use);
    }
}
