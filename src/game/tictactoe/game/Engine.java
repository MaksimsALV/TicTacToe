package game.tictactoe.game;

import game.tictactoe.Run;
import game.tictactoe.game.logic.BoardLogic;

import game.tictactoe.service.Registration;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Engine {
    public static boolean playerOneTurn = true;

    public static void newGame() {
        Platform.runLater(() -> { //seems that it doesnt work without try/catch block, so had to add that one
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(Run.class.getResource("/game/tictactoe/application/BoardScreen.fxml"));
                Parent root = fxmlLoader.load();

                Stage primaryStage = new Stage();
                primaryStage.setScene(new Scene(root, 600, 400)); //setting the window size
                primaryStage.show(); //shows the window
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        BoardLogic.resetBoardBE();
        playerOneTurn = true;
    }

    public static void playerSelection(int choice) {
        char symbol = playerOneTurn
                ? Registration.playersList.get(0).playerSymbol
                : Registration.playersList.get(1).playerSymbol;

        //update board after every cell
        BoardLogic.updateBoard(choice, symbol);

        //toggle turn after every players move
        playerOneTurn = !playerOneTurn;
    }
}
