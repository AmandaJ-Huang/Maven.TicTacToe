package rocks.zipcodewilmington.tictactoe;

import sun.font.FontRunIterator;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        //checking row for X win
        for(int row = 0; row < 3; row++) {
            int checkCounterX = 0;
            for(int col = 0; col < 3; col++) {
                if(board[row][col].equals('X')) {
                    checkCounterX++;
                    }
                }
            if (checkCounterX == 3) {
                return true;
            }
        }
        //check column for X win
        for(int col = 0; col < 3; col++) {
            int checkCounterX = 0;
            for(int row = 0; row < 3; row++) {
                if(board[row][col].equals('X')) {
                    checkCounterX++;
                }
            }
            if (checkCounterX == 3) {
                return true;
            }
        }

        //check diagonals for X win
        Character a = board[0][0];
        Character c = board[0][2];
        Character e = board[1][1];
        Character x = board[2][0];
        Character z = board[2][2];

        //top-left to bottom-right diagonal X win
        if (a == 'X' && e == 'X' && z == 'X') {
            return true;
            }

        //top-right to bottom-left diagonal X win
        if (c == 'X' && e == 'X' && x == 'X') {
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfO() {
        //checking row for O win
        for(int row = 0; row < 3; row++) {
            int checkCounterX = 0;
            for(int col = 0; col < 3; col++) {
                if(board[row][col].equals('O')) {
                    checkCounterX++;
                }
            }
            if (checkCounterX == 3) {
                return true;
            }
        }
        //check column for O win
        for(int col = 0; col < 3; col++) {
            int checkCounterX = 0;
            for(int row = 0; row < 3; row++) {
                if(board[row][col].equals('O')) {
                    checkCounterX++;
                }
            }
            if (checkCounterX == 3) {
                return true;
            }
        }

        //check diagonals for O win
        Character a = board[0][0];
        Character c = board[0][2];
        Character e = board[1][1];
        Character x = board[2][0];
        Character z = board[2][2];

        //top-left to bottom-right diagonal O win
        if (a == 'O' && e == 'O' && z == 'O') {
            return true;
        }

        //top-right to bottom-left diagonal O win
        if (c == 'O' && e == 'O' && x == 'O') {
            return true;
        }

        return false;
    }

    public Boolean isTie() {
        if (isInFavorOfX() == isInFavorOfO()) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfO() == true) {
            return "O";
        } else if (isInFavorOfX() == true) {
            return "X";
        }
        return "";
    }

}
