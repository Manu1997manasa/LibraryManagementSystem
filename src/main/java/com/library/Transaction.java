public class Transaction {
    private int transactionId;
    private Member member;
    private Book book;
    private String status; // Issued or Returned

    // Constructor
    public Transaction(int transactionId, Member member, Book book, String status) {
        this.transactionId = transactionId;
        this.member = member;
        this.book = book;
        this.status = status;
    }

    // Getters and Setters
    public int getTransactionId() { return transactionId; }
    public Member getMember() { return member; }
    public Book getBook() { return book; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method to display transaction details
    public void displayTransactionInfo() {
        System.out.println("Transaction ID: " + transactionId +
                ", Member: " + member.getName() +
                ", Book: " + book.getTitle() +
                ", Status: " + status);
    }
}
