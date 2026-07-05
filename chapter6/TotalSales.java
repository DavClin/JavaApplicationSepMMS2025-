import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] sales = new int[5][4]; // products × salespeople

        System.out.println("Enter slips: product(1–5), salesperson(1–4), value. Enter -1 to stop.");
        while (true) {
            int product = input.nextInt();
            if (product == -1) break;
            int person = input.nextInt();
            int value = input.nextInt();
            sales[product - 1][person - 1] += value;
        }

        System.out.println("Product\\Salesperson\t1\t2\t3\t4\tTotal");
        for (int i = 0; i < sales.length; i++) {
            int rowTotal = 0;
            System.out.print((i + 1) + "\t\t");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + "\t");
                rowTotal += sales[i][j];
            }
            System.out.println(rowTotal);
        }
    }
}
