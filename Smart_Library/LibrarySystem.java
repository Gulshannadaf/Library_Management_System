import java.util.*;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        Admin admin = new Admin("A1", "Librarian", "admin@library.com");
        User user = new User("U1", "Gulshan", "gulshan@example.com");
        library.addUser(user);

        library.addBook(new Book("B1", "1984", "George Orwell", "Dystopia"));
        library.addBook(new Book("B2", "The Alchemist", "Paulo Coelho", "Fiction"));

        System.out.println("Welcome to SmartLibrary+");

        while (true) {
            System.out.println("\n1. View Books\n2. Issue Book\n3. Return Book\n4. My Issued Books\n5. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> library.listBooks();
                case 2 -> {
                    System.out.print("Enter Book ID to issue: ");
                    String bid = sc.nextLine();
                    Book book = library.findBookById(bid);
                    if (book != null) user.issueBook(book);
                    else System.out.println("Book not found.");
                }
                case 3 -> {
                    System.out.print("Enter Book ID to return: ");
                    String bid = sc.nextLine();
                    Book book = library.findBookById(bid);
                    if (book != null) user.returnBook(book);
                    else System.out.println("Book not found.");
                }
                case 4 -> user.listIssuedBooks();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}

