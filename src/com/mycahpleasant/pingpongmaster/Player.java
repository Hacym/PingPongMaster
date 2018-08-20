package com.mycahpleasant.pingpongmaster;

public class Player {

    String playerName;
    int ranking;
    int wins;
    int losses;

    Player(String playerName){
        this.playerName = playerName;
        this.ranking = 1000;
        this.wins = 0;
        this.losses = 0;
    }

    public void didWin(){

        wins += 1;
        return;
    }

    public void didLose(){

        losses += 1;
        return;
    }
}
