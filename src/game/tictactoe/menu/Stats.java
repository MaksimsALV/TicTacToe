package game.tictactoe.menu;

import java.util.Scanner;

public class Stats {
    public static void viewStats() {
        Scanner s = new Scanner(System.in);
        System.out.println("These are the stats for current game session:");
        System.out.println("Player 1 won:" ); //todo add how many games player 1 won from PlayerStats
        System.out.println("Player 2 won:" ); //todo add how many games player 2 won from PlayerStats
        System.out.print("=================================");
        while (true) {
            System.out.print("Type 0 to return back to main menu");
            System.out.print("Input:");
            int choice = Integer.parseInt(s.nextLine());
            if (choice == 0) {
                MainMenu.menu();
                break;
            }
        }
    }
}
