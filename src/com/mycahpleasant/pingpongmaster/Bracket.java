package com.mycahpleasant.pingpongmaster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bracket {

    Map<String, Player> players = new HashMap<String, Player>();

    // HOMEWORK:
    // Fill out this method with code that puts the given user into the players list
    public void addPlayer(String playerName) {
        players.put(playerName, new Player(playerName));

        return;

    }

    // Fill out this method with code that removes a player from the bracket
    public void removePlayer(String playerName) {
        players.remove(playerName);

        return;

    }

    public Map<String, Player> getBracket() {
        return players;
    }

    // Fill out this method with code that gets the wins for a given player
    public int getWins(String playerName) {
        // Extra credit: implement error handling for if a playerName is passed that is not in the players hash map
        return players.get(playerName).wins;
    }

    // Fill out this method with code that gets the loses for a given player
    public int getLoses(String playerName) {
        return players.get(playerName).losses;

    }

    public void recordWin(String playerName) {
        players.get(playerName).didWin();
        return;
    }

    public void recordLose(String playerName) {
        players.get(playerName).didLose();
        return;
    }
}