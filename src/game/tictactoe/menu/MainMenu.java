package game.tictactoe.menu;

import game.tictactoe.service.Registration;

import java.util.Scanner;

public class MainMenu {
    public static void menu() {
        Scanner ms = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Welcome to my first game - TicTacToe! Be nice ;)");
        System.out.println("=================================");
        while (true) {
            System.out.println("Please choice one of the following options:");
            System.out.println("1. Play");
            System.out.println("2. Stats");
            System.out.println("0. Exit");
            System.out.print("Input:");
            int choice = Integer.parseInt(ms.nextLine());
            if (choice == 1) {
                Registration.register();
                break;
            }
            if (choice == 2) {
                Stats.viewStats();
                break;
            }
            if (choice == 0) {
                System.out.println("Thank you for playing my first game!");
                System.exit(0);
            }
        }
    }
}
