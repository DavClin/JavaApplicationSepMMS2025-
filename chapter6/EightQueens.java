public class EightQueens {
    static final int SIZE = 8;
    static int[] board = new int[SIZE];

    public static void main(String[] args) {
        placeQueens(0);
    }

    static boolean placeQueens(int row) {
        if (row == SIZE) {
            printBoard();
            return true;
        }
        for (int col = 0; col < SIZE; col++) {
            if (isSafe(row, col)) {
                board[row] = col;
                if (placeQueens(row + 1)) return true;
            }
        }
        return false;
    }

    static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == row - i) return false;
        }
        return true;
    }

    static void printBoard() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                System.out.print(board[r] == c ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}
