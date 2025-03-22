package game.tictactoe.game.logic;

import game.tictactoe.service.Registration;

public class WinnerLogic {
    public static boolean winningCondition(char symbol) {
        //horizontal check
        if ((BoardLogic.board[0][0] == symbol && BoardLogic.board[0][1] == symbol && BoardLogic.board[0][2] == symbol) || // " || " -is logical OR operator
                (BoardLogic.board[1][0] == symbol && BoardLogic.board[1][1] == symbol && BoardLogic.board[1][2] == symbol) ||
                (BoardLogic.board[2][0] == symbol && BoardLogic.board[2][1] == symbol && BoardLogic.board[2][2] == symbol)) {
            return true;
        }
        //vertical check
        if ((BoardLogic.board[0][0] == symbol && BoardLogic.board[1][0] == symbol && BoardLogic.board[2][0] == symbol) ||
                (BoardLogic.board[0][1] == symbol && BoardLogic.board[1][1] == symbol && BoardLogic.board[2][1] == symbol) ||
                (BoardLogic.board[0][2] == symbol && BoardLogic.board[1][2] == symbol && BoardLogic.board[2][2] == symbol)) {
            return true;
        }
        //side check
        if ((BoardLogic.board[0][0] == symbol && BoardLogic.board[1][1] == symbol && BoardLogic.board[2][2] == symbol) ||
                (BoardLogic.board[0][2] == symbol && BoardLogic.board[1][1] == symbol && BoardLogic.board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    public static String defineWinner() {
        if (winningCondition('X')) {
            String winnerName = Registration.playersList.get(0).playerName;
            return winnerName;
        } else if (winningCondition('O')) {
            String winnerName = Registration.playersList.get(1).playerName;
            return winnerName;
        }
        return "draw!"; //todo need to create draw condition
    }
}
