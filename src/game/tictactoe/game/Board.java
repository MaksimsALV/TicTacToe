package game.tictactoe.game;

public class Board {

    // this is our board
    public static char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    // this prints our board (matrix) according to our array from above
    public static void printBoard() { //matrix look, first number is row; second number is column
        System.out.println("                                                                ");
        System.out.println("  " + board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2]);
        System.out.println("-----|-----|-----");
        System.out.println("  " + board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2]);
        System.out.println("-----|-----|-----");
        System.out.println("  " + board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2]);
        System.out.println("                                                                ");
    }
}
