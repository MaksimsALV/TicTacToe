package game.tictactoe.game;

import game.tictactoe.game.logic.BoardLogic;

import game.tictactoe.service.Registration;

public class Engine {
    public static boolean playerOneTurn = true;

    public static void newGame() {
        BoardLogic.resetBoardBE();
        playerOneTurn = true;
    }

    public static void playerSelection(int choice) {
        char symbol = playerOneTurn
                ? Registration.playersList.get(0).playerSymbol
                : Registration.playersList.get(1).playerSymbol;

        //update board after every cell
        BoardLogic.updateBoard(choice, symbol);

        //toggle turn after every players move
        playerOneTurn = !playerOneTurn;
    }
}
