import java.util.Random;

public class TortoiseHare {
    public static void main(String[] args) {
        Random rand = new Random();
        int tortoise = 1, hare = 1;

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        while (tortoise < 70 && hare < 70) {
            // Tortoise move
            int tMove = rand.nextInt(10) + 1;
            if (tMove <= 5) tortoise += 3;       // fast plod
            else if (tMove <= 7) tortoise -= 6;  // slip
            else tortoise += 1;                  // slow plod
            if (tortoise < 1) tortoise = 1;

            // Hare move
            int hMove = rand.nextInt(10) + 1;
            if (hMove <= 2) hare += 0;           // sleep
            else if (hMove <= 4) hare += 9;      // big hop
            else if (hMove == 5) hare -= 12;     // big slip
            else if (hMove <= 8) hare += 1;      // small hop
            else hare -= 2;                      // small slip
            if (hare < 1) hare = 1;

            // Display race track
            for (int i = 1; i <= 70; i++) {
                if (i == tortoise && i == hare) {
                    System.out.print("OUCH!!!");
                    i += 5; // skip extra positions for OUCH!!!
                } else if (i == tortoise) {
                    System.out.print("T");
                } else if (i == hare) {
                    System.out.print("H");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            // Check winner
            if (tortoise >= 70 && hare >= 70) {
                System.out.println("It's a tie!");
                break;
            } else if (tortoise >= 70) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
                break;
            } else if (hare >= 70) {
                System.out.println("Hare wins. Yuch.");
                break;
            }
        }
    }
}
