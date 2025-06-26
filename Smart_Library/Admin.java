public class Admin extends Person {
    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    public void displayDetails() {
        System.out.println("Admin: " + name + " | Email: " + email);
    }
}

