package car_project;

public class Car_project {

    public static void main(String[] args) {
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
