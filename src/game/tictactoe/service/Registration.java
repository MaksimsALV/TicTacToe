package game.tictactoe.service;

import java.util.ArrayList;

public class Registration {
    public static ArrayList<Player> playersList = new ArrayList<>();

    public static void pvp(String playerOne, String playerTwo) {
        playersList.add(new Player(playerOne, 'X'));
        playersList.add(new Player(playerTwo, 'O'));
    }

    //player constructor
    public static class Player {
        public String playerName;
        public char playerSymbol;

        public Player(String playerName, char playerSymbol) {
            this.playerName = playerName;
            this.playerSymbol = playerSymbol;
        }
    }
}
