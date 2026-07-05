public class KnightsTour {
    static int[][] board = new int[8][8];
    static int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
    static int[] vertical = {-1,-2,-2,-1,1,2,2,1};

    public static void main(String[] args) {
        int row = 0, col = 0, moveCount = 1;
        board[row][col] = moveCount;

        for (int move = 0; move < 64; move++) {
            boolean moved = false;
            for (int k = 0; k < 8; k++) {
                int newRow = row + vertical[k];
                int newCol = col + horizontal[k];
                if (newRow >= 0 && newRow < 8 && newCol >= 0 && newCol < 8 && board[newRow][newCol] == 0) {
                    row = newRow; col = newCol;
                    board[row][col] = ++moveCount;
                    moved = true;
                    break;
                }
            }
            if (!moved) break;
        }

        for (int[] r : board) {
            for (int c : r) System.out.printf("%2d ", c);
            System.out.println();
        }
    }
}
