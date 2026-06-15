import java.util.Scanner;

public class CombinedWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int sum = input.nextInt() + input.nextInt() + input.nextInt();

        System.out.println("Sum = " + sum);

        if (sum % 2 == 0 && sum % 10 == 0) {
            System.out.println("Successful");

            System.out.print("Enter another 3 numbers: ");
            int product = input.nextInt() * input.nextInt() * input.nextInt();

            if (product > 200) {
                System.out.println("Product = " + product);
                System.out.println("Hurray!!!");
            } else {
                System.out.println("Ongoing...");
            }
        } else {
            System.out.println("I must solve this program on my own!");
        }

        input.close();
    }
}