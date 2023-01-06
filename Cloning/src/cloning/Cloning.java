package cloning;

public class Cloning {
    
    public static void main(String[] args)throws CloneNotSupportedException {
        // TODO code application logic here
        abinesh hsc=new abinesh();
        abinesh sslc=(abinesh)hsc.clone();
        System.out.println("The name and rollno is "+sslc.name+" and "+sslc.rollno);
    }
    
}
