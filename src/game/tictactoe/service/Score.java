package game.tictactoe.service;

import java.util.HashMap;

public class Score {
    public static HashMap<String, Integer> playerStats = new HashMap<>(); //String=playerName and Integer = winning count (how many times won)

    public static void viewStats() {
        playerStats.forEach((playerName, wins) ->
                System.out.println(playerName + " won: " + wins));
    }
}

