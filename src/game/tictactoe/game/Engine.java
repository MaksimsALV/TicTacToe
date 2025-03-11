package game.tictactoe.game;

import game.tictactoe.game.logic.Logic;
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
            Logic.printBoard();
            System.out.print("Input:");
            int choice = Integer.parseInt(ge.nextLine());

            char symbol = playerOneTurn ? PlayerStorage.playersList.get(0).playerSymbol : PlayerStorage.playersList.get(1).playerSymbol;
            Logic.updateBoard(choice, symbol);
            playerOneTurn = !playerOneTurn;
        }
    }
}
