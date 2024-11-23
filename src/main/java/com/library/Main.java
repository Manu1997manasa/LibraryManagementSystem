import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding some initial data
        library.addBook(new Book("Java Programming", "James Gosling", "12345", 3));
        library.addBook(new Book("Python Essentials", "Guido van Rossum", "67890", 2));
        library.addMember(new Member("Manasa", 1));
        library.addMember(new Member("John", 2));

        // Menu for library management
        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Display Books");
            System.out.println("2. Add Book");
            System.out.println("3. Display Members");
            System.out.println("4. Add Member");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Display Transactions");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    scanner.nextLine(); // Consume newline
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter number of copies: ");
                    int copies = scanner.nextInt();
                    library.addBook(new Book(title, author, isbn, copies));
                    break;
                case 3:
                    library.displayMembers();
                    break;
                case 4:
                    System.out.print("Enter member name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    int memberId = scanner.nextInt();
                    library.addMember(new Member(name, memberId));
                    break;
                case 5:
                    System.out.print("Enter member ID: ");
                    int issueMemberId = scanner.nextInt();
                    System.out.print("Enter book ISBN: ");
                    scanner.nextLine(); // Consume newline
                    String issueIsbn = scanner.nextLine();
                    library.issueBook(issueMemberId, issueIsbn);
                    break;
                case 6:
                    System.out.print("Enter member ID: ");
                    int returnMemberId = scanner.nextInt();
                    System.out.print("Enter book ISBN: ");
                    scanner.nextLine(); // Consume newline
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnMemberId, returnIsbn);
                    break;
                case 7:
                    library.displayTransactions();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
