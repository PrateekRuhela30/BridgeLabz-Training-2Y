package library.books;

public class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showBook() {
        System.out.println("Book: " + title + " by " + author);
    }
}
