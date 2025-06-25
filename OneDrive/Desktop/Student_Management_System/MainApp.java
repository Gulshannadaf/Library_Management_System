import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        boolean running = true;

        while (running) {
            System.out.println("\n===== STUDENT MANAGEMENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Student by ID");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Show Top/Lowest Scorer");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    List<Double> marks = new ArrayList<>();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Enter marks for Subject " + i + ": ");
                        marks.add(sc.nextDouble());
                    }
                    sc.nextLine(); // consume newline

                    Student s = new Student(name, dept, email, marks);
                    manager.addStudent(s);
                }
                case 2 -> manager.viewAllStudents();
                case 3 -> {
                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Student s = manager.findById(id);
                    if (s != null) System.out.println(s);
                    else System.out.println("❌ Student not found.");
                }
                case 4 -> {
                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                    List<Double> newMarks = new ArrayList<>();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Enter new marks for Subject " + i + ": ");
                        newMarks.add(sc.nextDouble());
                    }
                    sc.nextLine();
                    manager.updateStudentMarks(id, newMarks);
                }
                case 5 -> {
                    System.out.print("Enter student ID to delete: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    manager.deleteStudent(id);
                }
                case 6 -> manager.showTopAndLowest();
                case 7 -> {
                    System.out.println("👋 Exiting...");
                    running = false;
                }
                default -> System.out.println("❌ Invalid choice.");
            }
        }
        sc.close();
    }
}