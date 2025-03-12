package game.tictactoe.menu;

import game.tictactoe.service.NewGame;
import game.tictactoe.service.Score;

import java.util.Scanner;

public class Interface {
    public static void menu() {
        Scanner ms = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Welcome to my first game - TicTacToe! Be nice ;)");
        System.out.println("=================================");
        while (true) {
            System.out.println("Please choice one of the following options:");
            System.out.println("1. New Game");
            System.out.println("2. Stats");
            System.out.println("0. Exit");
            System.out.print("Input:");
            int choice = Integer.parseInt(ms.nextLine());
            if (choice == 1) {
                NewGame.newGame();
                break;
            }
            if (choice == 2) {
                Score.viewStats();
                break;
            }
            if (choice == 0) {
                System.out.println("Thank you for playing my first game!");
                System.exit(0);
            }
        }
    }
}
