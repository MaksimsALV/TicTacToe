package game.tictactoe.service;

import java.util.ArrayList;

public class Registration {
    public static ArrayList<Constructor.PlayerConstructor> playersList = new ArrayList<>();

    public static void registerVsPlayer(String playerOne, String playerTwo) {
        playersList.add(new Constructor.PlayerConstructor(playerOne, 'X'));
        playersList.add(new Constructor.PlayerConstructor(playerTwo, 'O'));
    }
}
