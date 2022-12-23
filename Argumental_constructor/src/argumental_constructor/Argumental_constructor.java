package argumental_constructor;

/**
 *
 * @author amsia
 */
public class Argumental_constructor {

    public static void main(String[] args) {

        Pencil Pencil=new Pencil();
        System.out.println(Pencil.get_details());
        Pencil Pen=new Pencil("Natraj","Hexagon",15,10);
        System.out.println(Pen.get_details());
    }
    
}
