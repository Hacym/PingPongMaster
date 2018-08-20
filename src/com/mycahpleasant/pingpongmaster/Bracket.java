package com.mycahpleasant.pingpongmaster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bracket {

    Map<String, ArrayList<Integer>> players = new HashMap<String, ArrayList<Integer>>();

    // HOMEWORK:
    // Fill out this method with code that puts the given user into the players list
    public void addPlayer(String playerName) {
        players.put(playerName, new ArrayList<Integer>(Arrays.asList(0, 0)));

        return;

    }

    // Fill out this method with code that removes a player from the bracket
    public void removePlayer(String playerName) {
        players.remove(playerName);

        return;

    }

    public Map<String, ArrayList<Integer>> getBracket() {
        return players;
    }

    // Fill out this method with code that gets the wins for a given player
    public int getWins(String playerName) {
        // Extra credit: implement error handling for if a playerName is passed that is not in the players hash map
        return players.get(playerName).get(0);
    }

    // Fill out this method with code that gets the loses for a given player
    public int getLoses(String playerName) {
        return players.get(playerName).get(1);

    }
}