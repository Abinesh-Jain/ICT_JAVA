package default_constructor;

public class Pencil {
    String name;
    String shape;
    float length;
    float dia;
    String get_details(){
        return("Name of the pencil is "+name+" and is of "+shape+" shape in cross section. The length and dia of the pencil is "+length+" cm and "+dia+" mm");
    }
    public Pencil(){
        name="Apsara";
        shape="Triangle";
        length=15;
        dia=10;
    }
}
