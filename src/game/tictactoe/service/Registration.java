package game.tictactoe.service;

import game.tictactoe.service.constructor.Constructor;
import game.tictactoe.repository.PlayerStorage;


public class Registration {

    public static void registerVsPlayer(String playerOne, String playerTwo) {
        // Register player 1 with symbol 'X'
        PlayerStorage.playersList.add(new Constructor.PlayerConstructor(playerOne, 'X'));

        // Register player 2 with symbol 'O'
        PlayerStorage.playersList.add(new Constructor.PlayerConstructor(playerTwo, 'O'));

        // Launch the game engine
        //Engine.gameEngine();
    }
}
