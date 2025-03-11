package game.tictactoe.game;

import game.tictactoe.game.logic.BoardLogic;
import game.tictactoe.menu.Interface;
import game.tictactoe.repository.PlayerStorage;

import java.util.Scanner;

public class Engine {

    public static void gameEngine() {
        Scanner ge = new Scanner(System.in);
        System.out.println("Lets play!");
        System.out.println("Game Rules:");
        System.out.println("First who get 3 same symbols in a row wins!");
        System.out.println("==============================================");
        System.out.println(PlayerStorage.playersList.get(0).playerName + " plays " + PlayerStorage.playersList.get(0).playerSymbol);
        System.out.println(PlayerStorage.playersList.get(1).playerName + " plays " + PlayerStorage.playersList.get(1).playerSymbol);
        System.out.println("==============================================");

        boolean playerOneTurn = true;

        while (true) {
            if (playerOneTurn) {
                System.out.println("Player 1 turn");
            } else {
                System.out.println("Player 2 turn");
            }
            BoardLogic.printBoard();
            System.out.print("Input:");
            int choice = Integer.parseInt(ge.nextLine());

            char symbol = playerOneTurn ? PlayerStorage.playersList.get(0).playerSymbol : PlayerStorage.playersList.get(1).playerSymbol;
            BoardLogic.updateBoard(choice, symbol);
            playerOneTurn = !playerOneTurn;

            if (BoardLogic.winningCondition(symbol)) {
                BoardLogic.defineWinner();
                break;
            }

        }
        System.out.println("Final board: ");
        BoardLogic.printBoard();
        //todo need to add the score to PlayerScore here somehere later

        System.out.println("==============================================");
        System.out.println("Another round?");
        System.out.println("1. Play again");
        System.out.println("0. Return back to main menu");
        System.out.print("Input:");
        int choice = Integer.parseInt(ge.nextLine());
        if (choice == 1) {
            gameEngine();
        }
        if (choice == 0) {
            Interface.menu();
        }
    }
}
