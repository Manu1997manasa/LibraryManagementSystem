import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Transaction> transactions;
    private int transactionCounter = 1; // Unique transaction ID generator

    // Constructor
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Register a new member
    public void addMember(Member member) {
        members.add(member);
    }

    // Issue a book to a member
    public void issueBook(int memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null && book.getCopies() > 0) {
            book.setCopies(book.getCopies() - 1);
            transactions.add(new Transaction(transactionCounter++, member, book, "Issued"));
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book issue failed. Check member ID or book availability.");
        }
    }

    // Return a book
    public void returnBook(int memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null) {
            book.setCopies(book.getCopies() + 1);
            transactions.add(new Transaction(transactionCounter++, member, book, "Returned"));
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book return failed. Check member ID or book details.");
        }
    }

    // Display all books
    public void displayBooks() {
        for (Book book : books) {
            book.displayBookInfo();
        }
    }

    // Display all members
    public void displayMembers() {
        for (Member member : members) {
            member.displayMemberInfo();
        }
    }

    // Display all transactions
    public void displayTransactions() {
        for (Transaction transaction : transactions) {
            transaction.displayTransactionInfo();
        }
    }

    // Helper methods to find a member or book
    private Member findMemberById(int memberId) {
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }

    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
