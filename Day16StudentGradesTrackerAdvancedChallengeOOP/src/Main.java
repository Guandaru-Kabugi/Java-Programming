import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Initialize students array
        System.out.println("How many students do you want to add.");
        int num = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[num];


        System.out.println("Welcome to the Student Grades Tracker!");

        // Loop to create and populate student objects
        for (int i = 0; i < students.length; i++) {
            // Consume newline character
            // Create a new Student object and add it to the array

            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student grade.");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student(name,grade);
        }

        //System.out.println("Students: "+ Arrays.toString(students));

        // Display student details
        for (Student student: students){
            System.out.println(student.getDetails());

        }
    }
    }

