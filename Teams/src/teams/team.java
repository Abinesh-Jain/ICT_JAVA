/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teams;

/**
 *
 * @author Abinesh
 */
class ict_non_cs
{
    String mentor;
    String course;
}
public class team extends ict_non_cs{
    String name;
    String tl;
    int members;
    void get_info()
    {
        System.out.println(name+" consists of "+members+" including their Team Leader "+tl);
    }
    void get_guide()
    {
        System.out.println(name+" is guided by "+mentor+" for "+course+" course.");
    }
    class member extends team{
        String member;
        void member_info()
        {
            System.out.println(member+" is a member of "+name);
        }
    }
}
