import java.util.Scanner;
import java.util.Arrays;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number (10–100): ");
            int num = input.nextInt();
            boolean duplicate = false;

            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) duplicate = true;
            }

            if (!duplicate) {
                numbers[count++] = num;
                System.out.println("Unique so far: " + Arrays.toString(Arrays.copyOf(numbers, count)));
            }
        }
    }
}
