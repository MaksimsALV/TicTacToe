package game.tictactoe.game.logic;

public class WinnerLogic {
    //todo will have to move this to WinnerLogic later
    public static boolean winningCondition(char symbol) {
        //horizontal check
        if ((BoardLogic.board[0][0] == symbol && BoardLogic.board[0][1] == symbol && BoardLogic.board[0][2] == symbol) || //todo doesnt seems to work without ||, what it does?
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

    public static void defineWinner() {
        if (winningCondition('X')) {
            System.out.println("Player 1 (X) Wins!");
        } else if (winningCondition('O')) {
            System.out.println("Player 2 (O) Wins!");
        }
    }
}
