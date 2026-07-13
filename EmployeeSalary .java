import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Enter employee name: ");
        String name = scan.nextLine();

        System.out.print("Enter hours worked: ");
        double hours = scan.nextDouble();

        System.out.print("Enter hourly rate: ");
        double rate = scan.nextDouble();

        double grossSalary = hours * rate;
        double taxRate = 0.10; 
        double tax = grossSalary * taxRate;
		double netSalary = grossSalary - tax;

     
		System.out.println();
        System.out.println("----- Salary Slip -----");
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax (10%): " + tax);
        System.out.println("Net Salary: " + netSalary);
    }
}