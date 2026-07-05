import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ranges = new int[9]; // counters for salary ranges

        System.out.print("Enter number of salespeople: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter gross sales for salesperson " + (i+1) + ": ");
            int gross = input.nextInt();
            int salary = 200 + (int)(0.09 * gross);

            int index = (salary >= 1000) ? 8 : (salary / 100) - 2;
            ranges[index]++;
        }

        System.out.println("\nSalary Range\tCount");
        for (int i = 0; i < ranges.length; i++) {
            if (i == 8) System.out.println("$1000+:\t" + ranges[i]);
            else System.out.printf("$%d-%d:\t%d%n", (i+2)*100, (i+2)*100+99, ranges[i]);
        }
    }
}
