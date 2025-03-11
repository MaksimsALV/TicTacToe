package game.tictactoe.service;

import game.tictactoe.game.Engine;
import game.tictactoe.repository.PlayerConstructor;
import game.tictactoe.repository.PlayerStorage;

import java.util.Scanner;

public class Registration {
    public static void register() {
        Scanner r = new Scanner(System.in);
        while (true) {
            System.out.println("To play the game you have to register two players!");
            System.out.println("Player 1 will play: X | Player 2 will play: O");

            //register player 1
            System.out.println("Enter player 1 name");
            System.out.print("Input:");
            String playerOne = r.nextLine();
            PlayerStorage.playersList.add(new PlayerConstructor(playerOne, 'X'));

            //register player 2
            System.out.println("Enter player 2 name");
            System.out.print("Input:");
            String playerTwo = r.nextLine();
            PlayerStorage.playersList.add(new PlayerConstructor(playerTwo, 'O'));

            Engine.gameEngine();
            break;
        }
    }
}
