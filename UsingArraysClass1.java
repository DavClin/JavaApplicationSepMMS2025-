import java.util.Arrays;

public class UsingArraysClass1{
	public static void main(String[] args){
		int[] numbers = {5,8,2,3,9,4,1,6,7,10};
		int[] a = {7,9,6};
		int[] b = {8,9,6};
		
		int[] c = {7,9,9};
		int[] d = {7,9,6};
		int[] e = {7,9,6};
		
		Arrays.sort(numbers);
		System.out.println("The elements of the array are");
		
		for(int number : numbers){
			System.out.printf("%d%n",number);
		}
		System.out.println("Binary Search");
		int index = Arrays.binarySearch(numbers,9);
		System.out.printf("The index number of 9 is %d%n",index);
		
		boolean isEqual = Arrays.equals(a,b);
		System.out.printf("The result is %b%n", isEqual);
		
		int isCompare = Arrays.compare(c,d);
		System.out.printf("The result is %d%n", isCompare);
		
		int isCompare2 = Arrays.compare(d,e);
		System.out.printf("The result is %d%n", isCompare2);
		
		int isCompare3 = Arrays.compare(d,c);
		System.out.printf("The result is %d%n", isCompare3);
		
		
	}
}