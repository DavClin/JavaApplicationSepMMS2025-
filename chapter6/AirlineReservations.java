import java.util.Scanner;

public class AirlineReservations {
    public static void main(String[] args) {
        boolean[] seats = new boolean[10];
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Type 1 for First Class, 2 for Economy: ");
            int choice = input.nextInt();
            int seat = -1;

            if (choice == 1) {
                for (int i = 0; i < 5; i++) if (!seats[i]) { seat = i; break; }
                if (seat == -1) {
                    System.out.println("First Class full. Economy?");
                    choice = 2;
                }
            }
            if (choice == 2) {
                for (int i = 5; i < 10; i++) if (!seats[i]) { seat = i; break; }
                if (seat == -1) {
                    System.out.println("Economy full. First Class?");
                    choice = 1;
                }
            }

            if (seat == -1) {
                System.out.println("Next flight leaves in 3 hours.");
                break;
            } else {
                seats[seat] = true;
                System.out.println("Boarding pass: Seat " + (seat + 1) +
                                   (seat < 5 ? " First Class" : " Economy"));
            }
        }
    }
}
