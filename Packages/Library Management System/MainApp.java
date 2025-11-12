import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainApp {
    public static void main(String[] args) {
        Book b = new Book("DBMS", "Korth");
        Member m = new Member("Ravi");
        Transaction t = new Transaction();

        b.showBook();
        m.showMember();
        t.issue(b, m);
    }
}
