package game.tictactoe.application;

import game.tictactoe.game.Engine;
import game.tictactoe.game.logic.BoardLogic;
import game.tictactoe.game.logic.WinnerLogic;
import game.tictactoe.service.Registration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class Controller {

    public boolean playerOneTurn = true;

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
            newGameId.setDisable(true);
            newGameId.setText("Add player names!");
            new Timeline(new KeyFrame(Duration.seconds(1), e -> { //added "animation" to disable button and change the text for 1 second
                newGameId.setDisable(false);
                newGameId.setText("New Game");
            })).play();
            return;
        }

        Registration.pvp(playerOne, playerTwo);
        playerOneTurn = true;
        Engine.newGame();
        resetBoardFE();
        if (playerTurn != null) {
            playerTurn.setText(Registration.playersList.get(0).playerName); //will have to move it later somewhere else, it is needed here because after newgame is clicked, i have to return first player name
        }
    }

    @FXML
    void cellClick(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        int choice = getChoiceFromButton(clickedButton);
        char symbol;
        if (playerOneTurn) {
            symbol = Registration.playersList.get(0).playerSymbol;
        } else {
            symbol = Registration.playersList.get(1).playerSymbol;
        }

        BoardLogic.updateBoard(choice, symbol);
        clickedButton.setText(String.valueOf(symbol));
        clickedButton.setDisable(true);

        if (WinnerLogic.winningCondition(symbol)) {
            winnerField.setText(WinnerLogic.defineWinner());
            winnerField.setEditable(false);
            disableAllButtons();
        } else {
            playerOneTurn = !playerOneTurn; //toggle between players
            String nextPlayerName;
            if (playerOneTurn) {
                nextPlayerName = Registration.playersList.get(0).playerName;
            } else {
                nextPlayerName = Registration.playersList.get(1).playerName;
            }
            playerTurn.setText(nextPlayerName);
        }
    }

    @FXML
    void clickAnotherOne(ActionEvent event) {
        resetBoardFE();
        BoardLogic.resetBoardBE();
        playerTurn.clear();
        winnerField.clear();
        enableAllButtons();
        playerOneTurn = true;
        playerTurn.setText(Registration.playersList.get(0).playerName);
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

    private void disableAllButtons() { //for game over purposes
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

    private void enableAllButtons() { //for new game purposes
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

    public void resetBoardFE() { //clearing text by setting empty string. Also seems that javafx bricks if i dont add != null statement
        if (button1 != null) button1.setText("");
        if (button2 != null) button2.setText("");
        if (button3 != null) button3.setText("");
        if (button4 != null) button4.setText("");
        if (button5 != null) button5.setText("");
        if (button6 != null) button6.setText("");
        if (button7 != null) button7.setText("");
        if (button8 != null) button8.setText("");
        if (button9 != null) button9.setText("");
    }

    public void setPlayerTurn(String playerName) {
        if (playerTurn != null) {
            playerTurn.setText(playerName);
            playerTurn.setEditable(false);
        }
    }
}
