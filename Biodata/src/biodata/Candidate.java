/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biodata;

/**
 *
 * @author amsia
 */
public class Candidate {
    String name;
    String gender;
    int age;
    String qualification;
    String department;
    float experience;
    void display_candidatename()
    {
        System.out.println("The name of the candidate is "+name);
    }
    void display_education()
    {
        System.out.println(name+" has completed "+qualification+" in "+department);
    }
}
