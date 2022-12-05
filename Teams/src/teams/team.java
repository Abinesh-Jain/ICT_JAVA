package teams;

/**
 *
 * @author Abinesh
 */
class ict_non_cs
{
    String mentor;
    String course;
    void learning()
    {
        System.out.println("Everyone is learning.");
    }
}
public class team extends ict_non_cs{
    String name;
    String tl;
    int members;
    void get_info()
    {
        System.out.println(name+" consists of "+members+" including their Team Leader "+tl);
    }
    void get_info(int no_of_tl)
    {
        int mem_except_tl=members-no_of_tl;
        System.out.println(name+" consists of "+mem_except_tl+" excluding their Team Leader.");
    }
    void get_guide()
    {
        System.out.println(name+" is guided by "+mentor+" for "+course+" course.");
    }
    @Override
    void learning()
    {
        System.out.println(name+" is learning "+course);
    }
    }
class member extends team{
    String member; 
    void member_info()
    {
        System.out.println(mentor+" is the mentor of "+member);
    }
}
