public class Demo{
	public static void main(String[] args){
		DemoInstanceMethodInJava instanceMethod = new DemoInstanceMethodInJava();
		int sum = instanceMethod.add(20,60,30);
		System.out.printf("The sum of the numbers is %d%n",sum);
		
		instanceMethod.details(40,"Emmanuel Peter");
	}
	
}