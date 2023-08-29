import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Student
{
    String name;
    int rollNumber;
    Student(String name, int rollNumber) 
	{
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

public class SchoolManagementSystem 
{
    public static void main(String[] args) 
		{
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        Map<Integer, Boolean> attendanceMap = new HashMap<>();

        while (true) {
            System.out.println("School Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Take Attendance");
            System.out.println("3. View Attendance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    int rollNumber = students.size() + 1;
                    students.add(new Student(name, rollNumber));
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.println("Mark Attendance");
                    for (Student student : students) {
                        System.out.print("Is " + student.name + " present? (yes/no): ");
                        String attendance = scanner.nextLine();
                        attendanceMap.put(student.rollNumber, attendance.equalsIgnoreCase("yes"));
                    }
                    System.out.println("Attendance marked successfully.");
                    break;
                case 3:
                    System.out.println("View Attendance");
                    for (Student student : students) {
                        String status = attendanceMap.getOrDefault(student.rollNumber, false) ? "Present" : "Absent";
                        System.out.println(student.name + " - " + status);
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
