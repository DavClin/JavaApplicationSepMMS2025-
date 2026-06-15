import java.util.Scanner;

public class NumberInput4 {
    public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.print("input the first number:");
	int num1 = input.nextInt();
	System.out.print("input the second number:");
	int num2 = input.nextInt();
	System.out.print("input the third number:");
	int num3 = input.nextInt();
	
	int sum = num1 + num2 + num3;
	if (sum % 2 == 0 && sum % 10 == 0) {
            System.out.printf("The number %d is even %n", sum);
			System.out.print("input the first number:");
			int num4 = input.nextInt();
			System.out.print("input the second number:");
			int num5 = input.nextInt();
			System.out.print("input the third number:");
			int num6 = input.nextInt();
			int product = num4 * num5 * num6;
			if (product > 200) {
				System.out.println();
				System.out.println("=================");
				System.out.println("Hurray");
			} else {
				System.out.println();
				System.out.println("=================");
				System.out.println("Ongoing...........");
			}
        } else {
			System.out.println();
			System.out.println("=================");
            System.out.println("I must solve this program");
        }
	}
}