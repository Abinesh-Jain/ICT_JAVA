package teams;
import java.util.Scanner;
public class Teams {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        team alexa=new team();
        alexa.name="Team ALEXA";
        alexa.tl="Abinesh Jain A J";
        alexa.members=5;
        alexa.get_info();
        alexa.get_info(1);
        alexa.mentor="Gavaskar S";
        alexa.course="JAVA";
        alexa.get_guide();
        alexa.learning();
        member abinesh=new member();
        abinesh.member="Abinesh Jain A J";
        abinesh.mentor="Gavaskar S";
        abinesh.member_info();
    }
}
