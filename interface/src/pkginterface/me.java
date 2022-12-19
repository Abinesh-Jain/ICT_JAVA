package pkginterface;

interface mother
{
    void mother_behaviour();
}
interface father
{
    void father_behavior();
}
interface grandma
{
    void grandma_behavior();
}
interface grandpa
{
    void grandpa_behaviour();
}
public class me implements mother,father,grandma,grandpa{
    @Override
    public void mother_behaviour()
    {
        System.out.println("Caring");
    }

    @Override
    public void father_behavior() {
        System.out.println("Supportive");
    }

    @Override
    public void grandma_behavior() {
        System.out.println("Loving");
    }

    @Override
    public void grandpa_behaviour() {
        System.out.println("Friendly");
    }
}
