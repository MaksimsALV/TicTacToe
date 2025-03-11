package game.tictactoe.game;

import game.tictactoe.repository.PlayerStorage;

import java.util.Scanner;

public class Engine {
    public static char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    public static void gameEngine() {
        Scanner ge = new Scanner(System.in);
        System.out.println("Lets play!");
        System.out.println("Game Rules:");
        System.out.println("First who get 3 same symbols in a row wins!");
        System.out.println("==============================================");
        System.out.println(PlayerStorage.playersList.get(0).playerName + " plays " + PlayerStorage.playersList.getFirst().playerSymbol);
        System.out.println(PlayerStorage.playersList.get(1).playerName + " plays " + PlayerStorage.playersList.getLast().playerSymbol);
        System.out.println("==============================================");

        boolean playerOneTurn = true;

        while (true) {
            if (playerOneTurn) {
                System.out.println("Player 1 turn");
            } else {
                System.out.println("Player 2 turn");
            }
            printBoard();
            System.out.print("Input:");
            int choice = Integer.parseInt(ge.nextLine());

            //todo update board
            playerOneTurn = !playerOneTurn;
        }
    }
    public static void printBoard() { //matrix look, first number is row; second number is column
        System.out.println("" + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("" + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("" + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }
}
