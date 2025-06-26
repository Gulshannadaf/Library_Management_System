import java.util.*;

public class Library {
    private List<Book> books;
    private Map<String, User> users;

    public Library() {
        books = new ArrayList<>();
        users = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addUser(User user) {
        users.put(user.id, user);
        System.out.println("User added: " + user.name);
    }

    public void listBooks() {
        for (Book b : books) b.display();
    }

    public Book findBookById(String id) {
        for (Book b : books) {
            if (b.getId().equals(id)) return b;
        }
        return null;
    }

    public User getUser(String id) {
        return users.get(id);
    }
}

