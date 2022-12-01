/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cloning;

/**
 *
 * @author amsia
 */
public class abinesh implements Clonable{
    String name;
    int rollno;
    abinesh()
    {
        name="Abinesh Jain A J";
        rollno=401702;
    }
    abinesh(String name1,int rollno1)
    {
        name=name1;
        rollno=rollno1;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
