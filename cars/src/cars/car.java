package cars;

public class car {
    String model;
    String brand;
    String type;
    double engine_no;
    double chase_no;
    void get_details()
    {
        System.out.println("The model of the car is "+model+" and is of "+brand+" brand");
    }
    void get_details(int a)
    {
        System.out.println("The Engine and Chase number of the car is "+engine_no+" and "+chase_no+" respectively.");
    }
}
