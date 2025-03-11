package game.tictactoe.service;

import game.tictactoe.menu.Interface;
import game.tictactoe.repository.PlayerStats;

import java.util.Scanner;

public class Score {
    public static void viewStats() {
        Scanner s = new Scanner(System.in);
        System.out.println("These are the stats for current game session:");
        PlayerStats.playerStats.forEach((playerName, wins) ->
                System.out.println(playerName + " won: " + wins));
        System.out.println("=================================");
        while (true) {
            System.out.println("Type 0 to return back to main menu");
            System.out.print("Input:");
            int choice = Integer.parseInt(s.nextLine());
            if (choice == 0) {
                Interface.menu();
                break;
            }
        }
    }
}
