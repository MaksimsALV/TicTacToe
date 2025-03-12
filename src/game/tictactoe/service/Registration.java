package game.tictactoe.service;

import game.tictactoe.game.Engine;
import game.tictactoe.game.logic.BoardLogic;
import game.tictactoe.repository.PlayerConstructor;
import game.tictactoe.repository.PlayerStats;
import game.tictactoe.repository.PlayerStorage;

import java.util.Scanner;

public class Registration {
    public static void registerVsAI() {
        Scanner rvai = new Scanner(System.in);
        while (true) {
            System.out.println("To play the game against Annette (AI), please enter your name!");

            //register player
            System.out.print("Input:");
            String playerOne = rvai.nextLine();
            PlayerStorage.playersList.add(new PlayerConstructor(playerOne, 'X'));

            //AI Annette
            //todo Annette doesnt needs to be added to the list, she always will be existing, so I have to introduce new playertype AI.. and refactor repository
                //String playerTwo = rvai.nextLine();
                //PlayerStorage.playersList.add(new PlayerConstructor(playerTwo, 'O'));

            System.out.println(playerOne + " will play: X | Annette will play: O");

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
            PlayerStorage.playersList.add(new PlayerConstructor(playerOne, 'X'));

            //register player 2
            System.out.println("Enter player 2 name");
            System.out.print("Input:");
            String playerTwo = rvp.nextLine();
            PlayerStorage.playersList.add(new PlayerConstructor(playerTwo, 'O'));

            System.out.println(playerOne + " will play: X | " + playerTwo + " will play: O");

            Engine.gameEngine();
            break;
        }
    }
}
