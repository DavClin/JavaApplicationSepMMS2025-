import java.util.Scanner;

public class BookSearch {

    public static void main(String[] args) {
        String[] books = {
            ("The Great Gatsby"), 
 			("To Kill a Mockingbird"),
			("1984"),
			("Pride and Prejudice"), 
            ("The Catcher in the Rye"), 
			("Moby Dick"), 
			("War and Peace"), 
			("The Hobbit"),
            ("Harry Potter and the Sorcerer's Stone"), 
			("The Lord of the Rings"), 
			("The Alchemist"),
            ("Animal Farm"), 
			("Brave New World"),
			("The Da Vinci Code"), 
        };

      Scanner scan = new Scanner(System.in);
        System.out.print("Enter a book title to search: ");
        String search = scan.nextLine();

        for (String b : books) {
            if (b.equalsIgnoreCase(search)) {
                System.out.println("Book found: " + b);
                return;
            }
        }
        System.out.println("Sorry, that book is not in the library.");
    }
}