Public class Exceptions{
	public static void main(String[] args){
		try{
			int result = 10/0;
		}
		catch(ArithmeticException e){
			System.out.println("You can't divide by zero!");
		}
	}
}


