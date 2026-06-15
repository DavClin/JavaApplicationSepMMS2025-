import java.util.Scanner;
 import java.util.Scanner;
 
public class ClassWork6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;

        if (sum % 2 == 0 && sum % 10 == 0) {
            int num4 = input.nextInt();
            int num5 = input.nextInt();
            int num6 = input.nextInt();

            int product = num4 * num5 * num6;

            if (product > 200) {
                System.out.println("Hurray");
            } else {
                System.out.println("Ongoing...");
            }
        } else {
            System.out.println("I must solve this program");
        }
    }
}