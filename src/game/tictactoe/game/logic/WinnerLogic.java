package game.tictactoe.game.logic;

import game.tictactoe.game.Board;
import game.tictactoe.repository.PlayerStats;
import game.tictactoe.repository.PlayerStorage;

public class WinnerLogic {
    public static boolean winningCondition(char symbol) {
        //horizontal check
        if ((Board.board[0][0] == symbol && Board.board[0][1] == symbol && Board.board[0][2] == symbol) || // " || " -is logical OR operator
                (Board.board[1][0] == symbol && Board.board[1][1] == symbol && Board.board[1][2] == symbol) ||
                (Board.board[2][0] == symbol && Board.board[2][1] == symbol && Board.board[2][2] == symbol)) {
            return true;
        }
        //vertical check
        if ((Board.board[0][0] == symbol && Board.board[1][0] == symbol && Board.board[2][0] == symbol) ||
                (Board.board[0][1] == symbol && Board.board[1][1] == symbol && Board.board[2][1] == symbol) ||
                (Board.board[0][2] == symbol && Board.board[1][2] == symbol && Board.board[2][2] == symbol)) {
            return true;
        }
        //side check
        if ((Board.board[0][0] == symbol && Board.board[1][1] == symbol && Board.board[2][2] == symbol) ||
                (Board.board[0][2] == symbol && Board.board[1][1] == symbol && Board.board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    public static void defineWinner() {
        if (winningCondition('X')) {
            String winnerName = PlayerStorage.playersList.get(0).playerName;
            System.out.println(winnerName + " Wins!");
            PlayerStats.playerStats.put(winnerName, PlayerStats.playerStats.getOrDefault(winnerName, 0) + 1); //firstly we put winnerName, then we call it with default value of 0 and then to modify with +1
        } else if (winningCondition('O')) {
            String winnerName = PlayerStorage.playersList.get(1).playerName;
            System.out.println(winnerName + " Wins!");
            PlayerStats.playerStats.put(winnerName, PlayerStats.playerStats.getOrDefault(winnerName, 0) + 1); //firstly we put winnerName, then we call it with default value of 0 and then to modify with +1
        }
    }
}
