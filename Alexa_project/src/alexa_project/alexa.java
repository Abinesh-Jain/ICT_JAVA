package alexa_project;

public class alexa {

    private String name;
    private int members;

    void projecting() {
        System.out.println(name + " team has " + members + " members");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "alexa{" + "name=" + name + ", members=" + members + '}';
    }

}
