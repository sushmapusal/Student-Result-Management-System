import java.util.*;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n==== STUDENT RESULT MANAGEMENT SYSTEM ====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    System.out.println("Exiting Program. Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }

    static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks of 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        Student s = new Student(roll, name, m1, m2, m3);
        students.add(s);

        System.out.println("Student added successfully!");
    }

    static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.roll == roll) {
                s.display();
                return;
            }
        }

        System.out.println("Student not found!");
    }
}
