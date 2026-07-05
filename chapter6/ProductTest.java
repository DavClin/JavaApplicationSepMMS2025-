public class ProductTest {
    public static int product(int... numbers) {
        int result = 1;
        for (int n : numbers) result *= n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(product(2, 3));        // 6
        System.out.println(product(4, 5, 6));     // 120
        System.out.println(product(7, 8, 9, 10)); // 5040
    }
}
