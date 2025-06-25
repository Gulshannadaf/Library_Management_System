import java.util.*;

public class StudentManager {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("✅ Student added successfully.");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("📭 No students found.");
            return;
        }
        students.forEach(System.out::println);
    }

    public Student findById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateStudentMarks(int id, List<Double> newMarks) {
        Student student = findById(id);
        if (student != null) {
            student.setMarks(newMarks);
            System.out.println("✏️ Student marks updated.");
        } else {
            System.out.println("❌ Student not found.");
        }
    }

    public void deleteStudent(int id) {
        Student student = findById(id);
        if (student != null) {
            students.remove(student);
            System.out.println("🗑️ Student deleted.");
        } else {
            System.out.println("❌ Student not found.");
        }
    }

    public void showTopAndLowest() {
        if (students.isEmpty()) {
            System.out.println("📭 No students available.");
            return;
        }
        Student top = Collections.max(students, Comparator.comparing(Student::getAverage));
        Student low = Collections.min(students, Comparator.comparing(Student::getAverage));
        System.out.println("🏆 Top Scorer: " + top);
        System.out.println("😓 Lowest Scorer: " + low);
    }
}