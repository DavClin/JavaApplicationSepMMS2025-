public class SalesCommission {
    public static void main(String[] args) {
        int[] ranges = new int[9]; // counters for salary ranges
        int[] grossSales = {5000, 7000, 300, 10000, 2000}; // example sales

        for (int sales : grossSales) {
            int salary = 200 + (int)(0.09 * sales);
            int index;
            if (salary >= 1000) index = 8;
            else index = (salary - 200) / 100;
            ranges[index]++;
        }

        System.out.println("Range\tCount");
        System.out.println("$200–299:\t" + ranges[0]);
        System.out.println("$300–399:\t" + ranges[1]);
        System.out.println("$400–499:\t" + ranges[2]);
        System.out.println("$500–599:\t" + ranges[3]);
        System.out.println("$600–699:\t" + ranges[4]);
        System.out.println("$700–799:\t" + ranges[5]);
        System.out.println("$800–899:\t" + ranges[6]);
        System.out.println("$900–999:\t" + ranges[7]);
        System.out.println("$1000+:\t" + ranges[8]);
    }
}
