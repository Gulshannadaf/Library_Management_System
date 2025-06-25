import java.util.*;

public class Student {
    private static int counter = 1000;
    private final int id;
    private String name;
    private String department;
    private String email;
    private List<Double> marks;
    private double average;
    private String grade;

    public Student(String name, String department, String email, List<Double> marks) {
        this.id = ++counter;
        this.name = name;
        this.department = department;
        this.email = email;
        this.marks = marks;
        calculateAverageAndGrade();
    }

    private void calculateAverageAndGrade() {
        double total = 0;
        for (double m : marks) total += m;
        this.average = total / marks.size();
        this.grade = calculateGrade(this.average);
    }

    private String calculateGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getEmail() { return email; }
    public List<Double> getMarks() { return marks; }
    public double getAverage() { return average; }
    public String getGrade() { return grade; }

    public void setMarks(List<Double> newMarks) {
        this.marks = newMarks;
        calculateAverageAndGrade();
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Dept: %s | Email: %s | Avg: %.2f | Grade: %s",
                id, name, department, email, average, grade);
    }
}