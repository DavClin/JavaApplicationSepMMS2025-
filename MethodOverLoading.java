import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("====Calculate Perimeter of Shapes====");
		System.out.println("Enter 1. for Sqaure");
		System.out.println("Enter 2. for Rectangle");
		System.out.println("Enter 1. for Triangle");
		System.out.println("Enter 1. Exit program");
		System.out.println("===============================================\n");
		
		System.out.print("Enter your choice: ");
		int choice = scan.nextInt();
		
		switch(choice) {
			
			case 1:
					System.out.print("Enter the length of square: ");
					int lenOfSquare = scan.nextInt();  
					
					perimeter(lenOfSquare);
			break;

			case 2:
					System.out.print("Enter the length of rentangle: ");
					int widthOfRect = scan.nextInt();
					
					System.out.print("Enter the width of the rentangle: ");
					int lenOfRect = scan.nextInt(); 
					perimeter(lenOfRect,widthOfRect);
			break;
					
					
					
			case 3:
					System.out.print("Enter sideA: ");
					int sideA = scan.nextInt();
					
					System.out.print("Enter sideB: ");
					int sideB = scan.nextInt(); 
					
					System.out.print("Enter sideC: ");
					int sideC = scan.nextInt(); 
					
			break;
			default:
						System.out.println("program Exited, Good Bye ........");
					
			
			
		}
		
	}
	public static void perimeter(int LenOfSquare) {
		int perimeterOfSquare = 4 * LenOfSquare;
		
		System.out.printf("The perimeterof the square is %d%n", perimeterOfSquare);
		
	}
	
	public static void perimeter(int lenOfRect, int widthOfRect) {
		int perimeterOfSquare = 2 * (lenOfRect + widthOfRect);
		
		System.out.printf("The perimeter of the square is %d%n", perimeterOfSquare);
		
	}
	
	public static void perimeter(int sideA, int sideB, int sideC) {
		int perimeterOfTraingle  = sideA + sideB + sideC;
		
		System.out.printf("The perimeter of the traingle is %d%n", perimeterOfTraingle);
		
	}
}