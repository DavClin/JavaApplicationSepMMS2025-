public class SalesZeroing {
    public static void main(String[] args) {
        int[][] sales = new int[3][5];
        int counter = 1;

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = 0;
                System.out.printf("Element [%d][%d] set to zero #%d%n", row, col, counter++);
            }
        }
    }
}
