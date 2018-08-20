package com.mycahpleasant.pingpongmaster;

public class Main {
    public static void main(String[] args) {
        Bracket players = new Bracket();

        players.addPlayer("MyCah");
        players.addPlayer("Susan");
        players.recordWin("Susan");
        players.recordLose("MyCah");

        if (players.getWins("Susan") > players.getWins("MyCah")) {
            System.out.println("Susan has more wins than MyCah");
        } else if (players.getWins("Susan") == players.getWins("MyCah")) {
            System.out.println("Susan and MyCah have the same number of wins.");
        } else {
            System.out.print("MyCah has more wins than Susan");
        }
    }
}
