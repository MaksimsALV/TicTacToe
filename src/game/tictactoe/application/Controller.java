package game.tictactoe.application;

import game.tictactoe.game.Engine;
import game.tictactoe.game.logic.WinnerLogic;
import game.tictactoe.service.Registration;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private Button newGameId;

    @FXML
    private TextField playerOneFieldId;

    @FXML
    private TextField playerTwoFieldId;


    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private TextField wonStatP1;

    @FXML
    private TextField wonStatP2;

    @FXML
    void clickNewGame(ActionEvent event) {
        String playerOne = playerOneFieldId.getText();
        String playerTwo = playerTwoFieldId.getText();

        Registration.pvp(playerOne, playerTwo);
        Engine.newGame();
        cleanBoard();
    }

    @FXML
    void cellClick(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        int choice = getChoiceFromButton(clickedButton);
        char symbol = Engine.playerOneTurn
                ? Registration.playersList.get(0).playerSymbol
                : Registration.playersList.get(1).playerSymbol;

        Engine.playerSelection(choice);
        clickedButton.setText(String.valueOf(symbol));
        WinnerLogic.winningCondition(symbol);
        WinnerLogic.defineWinner();
    }

    private int getChoiceFromButton(Button button) {
        if (button == button1) return 1;
        else if (button == button2) return 2;
        else if (button == button3) return 3;
        else if (button == button4) return 4;
        else if (button == button5) return 5;
        else if (button == button6) return 6;
        else if (button == button7) return 7;
        else if (button == button8) return 8;
        else if (button == button9) return 9;
        return 0;
    }

    private void cleanBoard() {
        Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
        for (Button btn : buttons) {
            btn.setText("");
            btn.setDisable(false);
        }
    }
}
