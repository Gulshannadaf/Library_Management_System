import java.util.*;
import java.time.*;

public class User extends Person implements LibraryActions {
    private List<Book> issuedBooks;

    public User(String id, String name, String email) {
        super(id, name, email);
        this.issuedBooks = new ArrayList<>();
    }

    public void issueBook(Book book) {
        if (!book.isIssued()) {
            book.setIssued(true);
            book.setIssuedTo(this.id);
            book.setIssuedDate(LocalDate.now());
            issuedBooks.add(book);
            System.out.println("Book issued: " + book.getTitle());
        } else {
            System.out.println("Book already issued.");
        }
    }

    public void returnBook(Book book) {
        if (issuedBooks.contains(book)) {
            issuedBooks.remove(book);
            book.setIssued(false);
            book.setIssuedTo(null);
            book.setIssuedDate(null);
            System.out.println("Book returned: " + book.getTitle());
        } else {
            System.out.println("This book wasn't issued by you.");
        }
    }

    public void displayDetails() {
        System.out.println("User: " + name + " | Email: " + email);
    }

    public void listIssuedBooks() {
        System.out.println("Issued Books:");
        for (Book b : issuedBooks) {
            b.display();
        }
    }
}
