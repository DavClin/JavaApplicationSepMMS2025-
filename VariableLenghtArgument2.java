public class VariableLenghtArgument2{
	public static void main(String[] args){
	System.out.printf("The sum is  %d%n",displayOddNumber(5,6,8,9,3,2,1));
	System.out.printf("The sum is  %d%n",displayOddNumber(8,6,8,9,3,2));
	System.out.printf("The sum is  %d%n",displayOddNumber(5,6,8,9,3));
	System.out.printf("The sum is  %d%n",displayOddNumber(5,6,8,3));
	System.out.printf("The sum is  %d%n",displayOddNumber(5,6,8));
	System.out.printf("The sum is  %d%n",displayOddNumber(5,6));
	System.out.printf("The sum is  %d%n",displayOddNumber(5));
	System.out.printf("The sum is  %d%n",displayOddNumber());
		
	}
	
	public static int displayOddNumber(int...numbers){
		int index = 0;
		for(int number : numbers){
			if(number % 2 !=0){
				index++;
			}
				
			
		}
		return index;
	}	
}


	