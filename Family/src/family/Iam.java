package family;

/**
 *
 * @author ABINESH JAIN A J
 */
public class Iam
{
    String name()
    {
        return("I am");
    }
}
class abinesh extends Iam
{
    @Override
    String name()
    {
        return("Abinesh");
    }
    void full()
    {
        System.out.println(super.name()+" "+this.name());
    }
}
class abisha extends Iam
{
    @Override
    String name()
    {
        return("Abisha");
    }
    void full()
    {
        System.out.println(super.name()+" "+this.name());
    }
}