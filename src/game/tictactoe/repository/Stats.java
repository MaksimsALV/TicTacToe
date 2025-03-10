package game.tictactoe.repository;

import game.tictactoe.menu.Interface;

import java.util.Scanner;

public class Stats {
    public static void viewStats() {
        Scanner s = new Scanner(System.in);
        System.out.println("These are the stats for current game session:");
        System.out.println("Player 1 won:" ); //todo add how many games player 1 won
        System.out.println("Player 2 won:" ); //todo add how many games player 2 won
        System.out.print("=================================");
        while (true) {
            System.out.print("Type 0 to return back to main menu");
            System.out.print("Input:");
            int choice = Integer.parseInt(s.nextLine());
            if (choice == 0) {
                Interface.menu();
                break;
            }
        }
    }
}
