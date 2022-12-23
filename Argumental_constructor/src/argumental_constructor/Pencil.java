package argumental_constructor;

public class Pencil {
    String name;
    String shape;
    float length;
    float dia;
    Pencil(){
        name="Apsara";
        shape="Triangle";
        length=15;
        dia=10;
    }
    Pencil(String name1,String shape1,float length1,float dia1){
        name=name1;
        shape=shape1;
        length=length1;
        dia=dia1;
    }
    String get_details(){
        return("Name of the pencil is "+name+" and is of "+shape+" shape in cross section. The length and dia of the pencil is "+length+" cm and "+dia+" mm");
    }

}
