import java.util.Random;

public class KnightsTourBrute {
    static int[][] board = new int[8][8];
    static int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
    static int[] vertical = {-1,-2,-2,-1,1,2,2,1};

    public static void main(String[] args) {
        Random rand = new Random();
        int row = 0, col = 0, moveCount = 1;
        board[row][col] = moveCount;

        while (moveCount < 64) {
            int move = rand.nextInt(8);
            int newRow = row + vertical[move];
            int newCol = col + horizontal[move];
            if (newRow >= 0 && newRow < 8 && newCol >= 0 && newCol < 8 && board[newRow][newCol] == 0) {
                row = newRow; col = newCol;
                board[row][col] = ++moveCount;
            } else break;
        }

        for (int[] r : board) {
            for (int c : r) System.out.printf("%2d ", c);
            System.out.println();
        }
    }
}
