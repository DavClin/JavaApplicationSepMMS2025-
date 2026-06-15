import java.util.Scanner;

public class ClassWork5{
    public static void main(String[] args) { 
	Scanner Input = new Scanner(System.in);
		System.out.print("Enter 3 number: ");
		int num1 = Input.nextInt(); 
		int num2 = Input.nextInt(); 
		int num3 = Input.nextInt();
		int sum = num1 + num2 + num3;
		System.out.printf("The sum is %d%n",sum);
		System.out.println("==============================");
		System.out.println("");
		if(sum%2==0 && sum%10==0){
			System.out.println("Successful");
			System.out.println("==============================");
			System.out.println("");
			
			System.out.print("Enter 3 numbers");
			int num4 = Input.nextInt();
			int num5 = Input.nextInt(); 
			int num6 = Input.nextInt();
			int product = num4 * num5 * num6;
			if (product>200){
				System.out.printf("The product is %d%n",product);
				System.out.println("Hurray!!!");
				System.out.println("==============================");
				System.out.println("");
			}
		}
		else{
			System.out.println("I must solve this program on my own!");
		}	
	}
}