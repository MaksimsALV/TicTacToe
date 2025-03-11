package game.tictactoe.game;

import game.tictactoe.repository.PlayerStorage;

import java.util.Scanner;

public class Engine {
    public static void gameEngine() {
        Scanner ge = new Scanner(System.in);
        System.out.println("Lets play!");
        System.out.println("Game Rules:");
        System.out.println("First who get 3 symbols in a row wins!");
        System.out.println("==============================================");
        System.out.println(PlayerStorage.playersList.getFirst().playerName + " plays " + PlayerStorage.playersList.getFirst().playerSymbol);
        System.out.println(PlayerStorage.playersList.getLast().playerName + " plays " + PlayerStorage.playersList.getLast().playerSymbol);
        System.out.println("==============================================");
        while (true) {
            System.out.println("Player 1 turn");
            System.out.print("Input:");
        }
    }
}
