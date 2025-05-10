import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //we initialize the scanner
        Scanner scanner = new Scanner(System.in);

        //ask users to enter the number of students they want to add
        System.out.println("How many students will you add?");
        int numStudents = scanner.nextInt();

        //create an array of students from the Student class

        Student[] students = new Student[numStudents];

        //loop to take student details
        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); //we consume new line

            System.out.println("Enter details for student " + (i+1));
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Height (in cm): ");
            double height = scanner.nextDouble();

            //store student details in the array

            students[i] = new Student(name,rollNumber,age,height); //we are calling a single object per loop to save a student

        }
        calculateAndDisplayStats(students);
        scanner.close();

    }

    //method to calculate and display statistics for students

    public static void calculateAndDisplayStats(Student[] students){
        int totalAge = 0;
        double totalHeight = 0.0;
        int oldestAge = students[0].age;
        double tallestHeight = students[0].height;
        String oldestStudent = students[0].name;
        String tallestStudent = students[0].name;

        for (Student student: students){ //for object student in students

            totalAge += student.age;
            totalHeight += student.height;

            //check the oldest in the array
            if(oldestAge<student.age){
                oldestAge = student.age;
                oldestStudent = student.name;
            }
            //check the tallest in the array
            if(tallestHeight<student.height){
                tallestHeight = student.height;
                tallestStudent = student.name;

            }

        }
        double averageAge = (double) totalAge/students.length;
        double averageHeight = totalHeight/students.length;

        System.out.println("\n--- Statistics ---");
        System.out.println("Average Age: " + String.format("%.2f",averageAge) + " years"); //another way to format decimals
        System.out.printf("Average Height: %.2f cm%n", averageHeight); //one way to format the decimals
        System.out.println("Oldest Student: " + oldestStudent + " (Age: " + oldestAge + " years)");
        System.out.println("Tallest Student: " + tallestStudent + " (Height: " + tallestHeight + " cm)");


    }

}
