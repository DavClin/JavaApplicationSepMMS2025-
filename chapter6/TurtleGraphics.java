public class TurtleGraphics {
    static int[][] floor = new int[14][14];
    static int x = 0, y = 0;
    static boolean penDown = false;

    public static void main(String[] args) {
        int[] commands = {2, 5,12, 3, 5,12, 3, 5,12, 3, 5,12, 1, 6, 9};
        for (int cmd : commands) execute(cmd);
    }

    static void execute(int cmd) {
        switch (cmd) {
            case 1 -> penDown = false;
            case 2 -> penDown = true;
            case 3 -> x++;
            case 4 -> x--;
            case 5 -> { // move forward n steps
                int steps = 12;
                for (int i = 0; i < steps; i++) {
                    if (penDown) floor[y][x] = 1;
                    x++;
                }
            }
            case 6 -> display();
            case 9 -> System.exit(0);
        }
    }

    static void display() {
        for (int[] row : floor) {
            for (int cell : row) System.out.print(cell == 1 ? "*" : " ");
            System.out.println();
        }
    }
}
