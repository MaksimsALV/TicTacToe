package game.tictactoe.service;

import game.tictactoe.game.logic.BoardLogic;
import game.tictactoe.menu.Interface;
import game.tictactoe.repository.PlayerStats;
import game.tictactoe.repository.PlayerStorage;

import java.util.Scanner;

public class NewGame {
    public static void newGame() {
        Scanner ng = new Scanner(System.in);
        PlayerStats.playerStats.clear(); //clearing storage when New Game is launched (goes via register method, so we wipe everything we had before every new game)
        PlayerStorage.playersList.clear(); //clearing storage when New Game is launched (goes via register method, so we wipe everything we had before every new game)
        BoardLogic.resetBoard(); //resetting board too (full clean start)

        while (true) {
            System.out.println("Select Game Mode");
            System.out.println("1. vs AI");
            System.out.println("2. vs Another player");
            System.out.println("0. Return back to main menu");

            int choice = Integer.parseInt(ng.nextLine());
            if (choice == 1) {
                //todo need to create new registerVsAi method
                break;
            }
            if (choice == 2) {
                Registration.register();
                break;
            }
            if (choice == 0) {
                Interface.menu();
                break;
            }
        }



    }
}
