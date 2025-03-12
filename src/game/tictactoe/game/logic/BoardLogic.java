package game.tictactoe.game.logic;

import game.tictactoe.game.Board;

public class BoardLogic {

    // this updates our board after each player input, if player puts input on any of the numbers, we replace that board locator with symbol
    public static void updateBoard(int choice, char symbol) { //method to update matrix based on inputs
        if (choice == 1) Board.board[0][0] = symbol;
        else if (choice == 2) Board.board[0][1] = symbol;
        else if (choice == 3) Board.board[0][2] = symbol;
        else if (choice == 4) Board.board[1][0] = symbol;
        else if (choice == 5) Board.board[1][1] = symbol;
        else if (choice == 6) Board.board[1][2] = symbol;
        else if (choice == 7) Board.board[2][0] = symbol;
        else if (choice == 8) Board.board[2][1] = symbol;
        else if (choice == 9) Board.board[2][2] = symbol;
    }

    public static void resetBoard() {
        Board.board[0][0] = '1'; Board.board[0][1] = '2'; Board.board[0][2] = '3';
        Board.board[1][0] = '4'; Board.board[1][1] = '5'; Board.board[1][2] = '6';
        Board.board[2][0] = '7'; Board.board[2][1] = '8'; Board.board[2][2] = '9';
    }
}
