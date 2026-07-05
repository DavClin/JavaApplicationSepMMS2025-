public class PassSingleArrayToMethodClass2 {
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { 
                sum +=(numbers[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 4, 3, 2, 9, 0, 1, 6, 8};

        int sum = sumEvenNumbers(arr);

        System.out.printf("The total of even numbers is %d%n", sum);
    }
}
