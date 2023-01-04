package alexa_project;

public class Alexa_project {

    public static void main(String[] args) {
        alexa team = new alexa();
        team.setMembers(4);
        team.setName("Abinesh");
        team.getMembers();
        System.out.println(team.getName());
        team.projecting();
        System.out.println(team.toString());
    }
}
