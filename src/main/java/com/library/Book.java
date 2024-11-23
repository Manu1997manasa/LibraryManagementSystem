public class Book {
    private String title;
    private String author;
    private String isbn;
    private int copies;

    // Constructor
    public Book(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public String getAuthor() { return author}
    public String getIsbn() { return isbn; }
    public int getCopies() { return copies; }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Copies: " + copies);
    }
}

