package game.tictactoe.service;

import game.tictactoe.game.logic.BoardLogic;
import game.tictactoe.repository.PlayerStats;
import game.tictactoe.repository.PlayerStorage;

public class NewGame {
    public static void newGame() {
        PlayerStats.playerStats.clear(); //clearing storage when New Game is launched (goes via register method, so we wipe everything we had before every new game)
        PlayerStorage.playersList.clear(); //clearing storage when New Game is launched (goes via register method, so we wipe everything we had before every new game)
        BoardLogic.resetBoard(); //resetting board too (full clean start)
        Registration.register();
    }
}
