package game.tictactoe.application;

import game.tictactoe.game.Engine;
import game.tictactoe.game.logic.BoardLogic;
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
    private TextField winnerField;

    @FXML
    private TextField playerTurn;


    @FXML
    void clickNewGame(ActionEvent event) {
        String playerOne = playerOneFieldId.getText();
        String playerTwo = playerTwoFieldId.getText();

        //validation for empty fields (we dont want to start the game without names)
        if (playerOne.isEmpty() || playerTwo.isEmpty()) {
            newGameId.setStyle("-fx-background-color: red;");
            return;
        }

        Registration.pvp(playerOne, playerTwo);
        Engine.newGame();
        resetBoardFE();
        if (playerTurn != null) {
            playerTurn.setText(Registration.playersList.get(0).playerName); //will have to move it later somewhere else, it is needed here because after newgame is clicked, i have to return first player name
        }
    }

    @FXML
    void clickAnotherOne(ActionEvent event) {
        resetBoardFE();
        BoardLogic.resetBoardBE();
        playerTurn.clear();
        winnerField.clear();
        enableAllButtons();
        playerTurn.setText(Registration.playersList.get(0).playerName);
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
        if (WinnerLogic.winningCondition(symbol)) {
            winnerField.setText(WinnerLogic.defineWinner());
            winnerField.setEditable(false);
            disableAllButtons();
        } else {
            if (Engine.playerOneTurn) {
                playerTurn.setText(Registration.playersList.get(0).playerName);
            } else {
                playerTurn.setText(Registration.playersList.get(1).playerName);
            }
        }
    }

    private int getChoiceFromButton(Button button) {
        if (button == button1) {
            button1.setDisable(true);
            return 1;
        }
        else if (button == button2) {
            button2.setDisable(true);
            return 2;
        }
        else if (button == button3) {
            button3.setDisable(true);
            return 3;
        }
        else if (button == button4) {
            button4.setDisable(true);
            return 4;
        }
        else if (button == button5) {
            button5.setDisable(true);
            return 5;
        }
        else if (button == button6) {
            button6.setDisable(true);
            return 6;
        }
        else if (button == button7) {
            button7.setDisable(true);
            return 7;
        }
        else if (button == button8) {
            button8.setDisable(true);
            return 8;
        }
        else if (button == button9) {
            button9.setDisable(true);
            return 9;
        }
        return 0;
    }

    private void disableAllButtons(){
        button1.setDisable(true);
        button2.setDisable(true);
        button3.setDisable(true);
        button4.setDisable(true);
        button5.setDisable(true);
        button6.setDisable(true);
        button7.setDisable(true);
        button8.setDisable(true);
        button9.setDisable(true);
    }

    private void enableAllButtons(){
        button1.setDisable(false);
        button2.setDisable(false);
        button3.setDisable(false);
        button4.setDisable(false);
        button5.setDisable(false);
        button6.setDisable(false);
        button7.setDisable(false);
        button8.setDisable(false);
        button9.setDisable(false);
    }

    public void resetBoardFE() {
        Button[] buttons = {
                button1,
                button2,
                button3,
                button4,
                button5,
                button6,
                button7,
                button8,
                button9
        };
        for (Button btn : buttons) {
            if (btn != null) {
                btn.setText("");
                btn.setDisable(false);
            }
        }
    }
    public void setPlayerTurn(String playerName) {
        if (playerTurn != null) {
            playerTurn.setText(playerName);
            playerTurn.setEditable(false);
        }
    }
}
