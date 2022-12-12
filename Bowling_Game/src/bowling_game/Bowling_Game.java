package bowling_game;

import java.util.*;

/**
 *
 * @author ABINESH JAIN A J
 */
public class Bowling_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        Bowling game=new Bowling();
        for(int i=0;i<3;i++){
            String input=in.nextLine();
            String[] values=input.split("");
            String name=values[0];
            int points=Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }  
}
