package game.tictactoe.service;

import game.tictactoe.game.Engine;
import game.tictactoe.service.constructor.Constructor;
import game.tictactoe.repository.PlayerStorage;

import java.util.Scanner;

public class Registration {
    public static void registerVsAI() {
        Scanner rvai = new Scanner(System.in);
        while (true) {
            System.out.println("To play the game against Annette (AI), please enter your name!");

            //register player
            System.out.print("Input:");
            String player = rvai.nextLine();
            PlayerStorage.playersList.add(new Constructor.PlayerConstructor(player, 'X'));

            //summary
            System.out.println(player + " will play: " + 'X' + " | " + PlayerStorage.annette.AIName + " will play: " + PlayerStorage.annette.AISymbol);

            //launching gameEngine
            Engine.gameEngine();
            break;
        }
    }

    public static void registerVsPlayer() {
        Scanner rvp = new Scanner(System.in);
        while (true) {
            System.out.println("To play the game you have to register two players!");

            //register player 1
            System.out.println("Enter player 1 name");
            System.out.print("Input:");
            String playerOne = rvp.nextLine();
            PlayerStorage.playersList.add(new Constructor.PlayerConstructor(playerOne, 'X'));

            //register player 2
            System.out.println("Enter player 2 name");
            System.out.print("Input:");
            String playerTwo = rvp.nextLine();
            PlayerStorage.playersList.add(new Constructor.PlayerConstructor(playerTwo, 'O'));

            //summary
            System.out.println(playerOne + " will play: " + 'X' + " | " + playerTwo + " will play: " + 'O');

            //launching gameEngine
            Engine.gameEngine();
            break;
        }
    }
}
