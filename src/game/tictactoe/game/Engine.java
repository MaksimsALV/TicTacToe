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
            printBoard();
            System.out.print("Input:");
            int choice = Integer.parseInt(ge.nextLine());

            char symbol = playerOneTurn ? PlayerStorage.playersList.get(0).playerSymbol : PlayerStorage.playersList.get(1).playerSymbol;
            updateBoard(choice, symbol);
            playerOneTurn = !playerOneTurn;
        }
    }
    public static void printBoard() { //matrix look, first number is row; second number is column
        System.out.println("" + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("" + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("" + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }
    public static void updateBoard(int choice, char symbol) { //method to update matrix based on inputs
        if (choice == 1) board[0][0] = symbol;
        else if (choice == 2) board[0][1] = symbol;
        else if (choice == 3) board[0][2] = symbol;
        else if (choice == 4) board[1][0] = symbol;
        else if (choice == 5) board[1][1] = symbol;
        else if (choice == 6) board[1][2] = symbol;
        else if (choice == 7) board[2][0] = symbol;
        else if (choice == 8) board[2][1] = symbol;
        else if (choice == 9) board[2][2] = symbol;
    }
}
