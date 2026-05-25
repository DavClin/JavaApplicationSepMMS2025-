import java.util.Scanner;

public class DayWork{
	public static void main(String [] args){
		    Scanner input = new Scanner(System.in);
			
			
			System.out.print("Enter day from 1- 7: ");
			
			
			
			int day = input.nextInt();
	
			switch(day){
				case 1:
					System.out.print("The day is Sunday: ");
				break;
				
				case 2:
					System.out.print("The day is Monday: ");
				break;
				
				case 3:
					System.out.print("The day is Tuesday: ");
				break;
				
				case 4:
					System.out.print("The day is Wednesday: ");
				break;
				
				case 5:
					System.out.print("The day is Thursday: ");
				break;
				
				case 6:
					System.out.print("The day is Friday: ");
				break;
				
				case 7:
					System.out.print("The day is Saturday: ");
				break;
				default:
				System.out.println("Invalid Input");
			
				
				
		}

	}
}
