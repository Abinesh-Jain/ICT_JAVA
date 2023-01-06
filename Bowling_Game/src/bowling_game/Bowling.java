package bowling_game;

import java.util.HashMap;

public class Bowling {
     HashMap<String,Integer> players;
    Bowling()
    {
        players=new HashMap<>();
    }
    public void addPlayer(String name,int p){
        players.put(name, p);
    }
    public void getWinner(){
        String winner="";
        int mrk=0;
        for(String nm:players.keySet()){
            if(players.get(nm)>mrk){
                winner=nm;
                mrk=players.get(nm);
            }
        }
        System.out.println(winner);
    }
}
