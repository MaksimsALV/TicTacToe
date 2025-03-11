package game.tictactoe.game.logic;

public class BoardLogic {
    // this is our board
    public static char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    // this prints our board (matrix) according to our array from above
    public static void printBoard() { //matrix look, first number is row; second number is column
        System.out.println("" + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("" + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("" + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }

    // this updates our board after each player input, if player puts input on any of the numbers, we replace that board locator with symbol
    public static void updateBoard(int choice, char symbol) { //method to update matrix based on inputs
        if (choice == 1) board[0][0] = symbol;
        else if (choice == 2) board[0][1] = symbol;
        else if (choice == 3) board[0][2] = symbol;
        else if (choice == 4) board[1][0] = symbol;
        else if (choice == 5) board[1][1] = symbol;
        else if (choice == 6) board[1][2] = symbol;
        else if (choice == 7) board[2][0] = symbol;
        else if (choice == 8) board[2][1] = symbol;
        else if (choice == 9) board[2][2] = symbol;
    }

        //todo will have to move this to WinnerLogic later
        public static boolean winningCondition(char symbol) {
        //horizontal check
        if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) || //todo doesnt seems to work without ||, what it does?
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol)) {
            return true;
        }
        //vertical check
        if ((board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol)) {
            return true;
        }
        //side check
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

        //todo this doesnt seems to do anything
        public static void defineWinner() {
            if (winningCondition('X')) {
                System.out.println("Player 1 (X) Wins!");
            } else if (winningCondition('O')) {
                System.out.println("Player 2 (O) Wins!");
            }
        }
}
