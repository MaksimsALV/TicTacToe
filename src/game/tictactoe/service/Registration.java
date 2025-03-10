package game.tictactoe.service;

import java.util.Scanner;

public class Registration {
    public static void register() {
        Scanner r = new Scanner(System.in);
        System.out.println("To play the game you have to register two players!");
        while (true) {
            System.out.println("Register player 1");
            System.out.print("Input:");
            String playerOne = r.nextLine();

            System.out.println("Register player 2");
            System.out.print("Input:");
            String playerTwo = r.nextLine();

            //todo add to storage
        }
    }
}
