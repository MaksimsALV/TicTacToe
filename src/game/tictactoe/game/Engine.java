package game.tictactoe.game;

import game.tictactoe.game.logic.BoardLogic;
import game.tictactoe.game.logic.WinnerLogic;
import game.tictactoe.menu.Interface;
import game.tictactoe.repository.PlayerStats;
import game.tictactoe.repository.PlayerStorage;

import java.util.Scanner;

public class Engine {
    public static void gameEngine() {
        Scanner ge = new Scanner(System.in);

        try {
            System.out.println("\nLaunching game...");
            Thread.sleep(2000);
            System.out.println("3...");
            Thread.sleep(2000);
            System.out.println("2...");
            Thread.sleep(2000);
            System.out.println("1...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nLets play!");
        System.out.println("Game Rules:");
        System.out.println("First who get 3 same symbols in a row wins!");
        System.out.println("==============================================");


        //two-way route between two game modes
        System.out.println(PlayerStorage.playersList.get(0).playerName + " plays " + PlayerStorage.playersList.get(0).playerSymbol);
        if (PlayerStorage.playersList.size() > 1) {
            System.out.println(PlayerStorage.playersList.get(1).playerName + " plays " + PlayerStorage.playersList.get(1).playerSymbol);
        } else {
            System.out.println(PlayerStorage.annette.playerName + " plays " + PlayerStorage.annette.playerSymbol);
        }


        System.out.println("==============================================");
        boolean playerOneTurn = true;

        while (true) {
            if (playerOneTurn) {
                System.out.println("Player 1 turn");
            } else {
                System.out.println("Player 2 turn");
            }
            Board.printBoard();
            System.out.print("Input:");
            int choice = Integer.parseInt(ge.nextLine());

            char symbol = playerOneTurn ? PlayerStorage.playersList.get(0).playerSymbol : PlayerStorage.playersList.get(1).playerSymbol;
            BoardLogic.updateBoard(choice, symbol);
            playerOneTurn = !playerOneTurn;

            //if we have a winner, it says that, breaks the loop and goes one layer down to Final Board block
            if (WinnerLogic.winningCondition(symbol)) {
                WinnerLogic.defineWinner();
                break;
            }
        }

        //Final board block
        System.out.println("Final board: ");
        Board.printBoard();
        //todo  clean relaunch of gameEngine() to start everything from zero again. if selecting Play Again

        System.out.println("==============================================");
        System.out.println("Another round?");
        System.out.println("1. Play again");
        System.out.println("0. Return back to main menu");
        System.out.print("Input:");
        int choice = Integer.parseInt(ge.nextLine());
        if (choice == 1) {
            BoardLogic.resetBoard();
            gameEngine();
        }
        if (choice == 0) {
            Interface.menu();
        }
    }
}
