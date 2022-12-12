/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bowling_game;

import java.util.HashMap;

/**
 *
 * @author amsia
 */
public class Bowling {
     HashMap<String,Integer> players;
    Bowling(){
        players=new HashMap<String,Integer>();
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
