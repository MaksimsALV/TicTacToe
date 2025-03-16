package game.tictactoe.game;

import game.tictactoe.game.logic.BoardLogic;
import game.tictactoe.repository.PlayerStorage;

public class Engine {
    public static boolean playerOneTurn = true;

    public static void newGame() {
        BoardLogic.resetBoard();
        playerOneTurn = true;
    }

    public static void playerSelection(int choice) {
        char symbol = playerOneTurn
                ? PlayerStorage.playersList.get(0).playerSymbol
                : PlayerStorage.playersList.get(1).playerSymbol;

        //update board after every cell
        BoardLogic.updateBoard(choice, symbol);

        //toggle turn after every players move
        playerOneTurn = !playerOneTurn;
    }
}
