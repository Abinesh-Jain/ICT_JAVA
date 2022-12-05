/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teams;

import java.util.Scanner;

/**
 *
 * @author Abinesh
 */
public class Teams {

    /**
     * @param args the command line arguments
     */
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
