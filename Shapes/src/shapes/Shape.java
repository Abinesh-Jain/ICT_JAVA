package shapes;

/**
 *
 * @author ABINESH JAIN A J
 */
abstract class Shape {
    int width;
    abstract void area();
}
class Square extends Shape{
    Square(int x){
        width=x;
    }

    @Override
    void area() {
        System.out.println(width*width);
    }
}
class Circle extends Shape{
    Circle(int y){
        width=y;
    }
    @Override
    void area() {
        System.out.println(Math.PI*width*width);
    }
    
}