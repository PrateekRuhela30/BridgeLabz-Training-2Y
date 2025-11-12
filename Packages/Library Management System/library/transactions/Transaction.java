package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void issue(Book b, Member m) {
        System.out.println(m.name + " issued the book " + b.title);
    }
}
