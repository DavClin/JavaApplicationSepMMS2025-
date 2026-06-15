import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nu1 = scan.nextInt();
        int nu2 = scan.nextInt();
        int nu3 = scan.nextInt();
        int nu4 = scan.nextInt();
        int nu5 = scan.nextInt();
        int nu6 = scan.nextInt();
        int nu7 = scan.nextInt();
        int nu8 = scan.nextInt();
        int nu9 = scan.nextInt();
        int nu10 = scan.nextInt();

        int sum1 = nu1 + nu5 + nu10;
        int sum2 = nu3 + nu8 + nu2;
        int product = sum1 * sum2;
        int sum3 = nu4 + nu7 + nu6 + nu9;

        int result = sum3 - product;

        System.out.println("=============================");

        if (result >= 100) {
            System.out.println("hurray I did it");
        } else {
            System.out.println("I still need to learn more in Java");
        }

      
    }
}