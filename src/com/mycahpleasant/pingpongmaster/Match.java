package com.mycahpleasant.pingpongmaster;

public class Match {

    Player team1[];
    Player team2[];
    int score[][] = new int[3][2];
    Player winner[];

    public void submitScore(int scoreTeam1, int scoreTeam2 , int gameNumber){

        if (gameNumber > 3 || gameNumber < 1) {
            return;
        } else {
            gameNumber -= 1;
        }


        // TODO: add in handling for if score already exists at position

        score[gameNumber][0] = scoreTeam1;
        score[gameNumber][1] = scoreTeam2;

        /*
            Game 1, T1: 21 - 17
            Game 2, T2: 21 - 14
            Game 3, T1: 21 - 18
        */

        /*
            [[21,17],[14,21],[21,18]]
            score[0][0] = 21;
         */

    }
}
