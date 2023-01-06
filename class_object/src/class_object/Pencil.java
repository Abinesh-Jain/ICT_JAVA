package class_object;

/**
 *
 * @author amsia
 */
public class Pencil {
    String name;
    String shape;
    float length;
    float dia;
    String get_details(){
        return("Name of the pencil is "+name+" and is of "+shape+" shape in cross section. The length and dia of the pencil is "+length+" cm and "+dia+" mm");
    }
}
