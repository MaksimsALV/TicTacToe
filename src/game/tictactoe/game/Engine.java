package game.tictactoe.game;

import game.tictactoe.Run;
import game.tictactoe.application.Controller;
import game.tictactoe.game.logic.BoardLogic;

import game.tictactoe.service.Registration;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Engine {

    public static void newGame() {
        Platform.runLater(() -> { //seems that it doesnt work without try/catch block, so had to add that one
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(Run.class.getResource("/game/tictactoe/application/BoardScreen.fxml"));
                Parent newRoot = fxmlLoader.load();

                Controller boardController = fxmlLoader.getController(); //transfering controller after scene changing, else i have some UI bugs, not sure how to fix it but this seems to work

                boardController.setPlayerTurn(Registration.playersList.get(0).playerName);
                boardController.resetBoardFE();

                Run.primaryStage.getScene().setRoot(newRoot);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        BoardLogic.resetBoardBE();
    }
}
