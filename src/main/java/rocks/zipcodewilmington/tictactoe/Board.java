package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
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
        return false;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
