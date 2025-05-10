public class Student {

    // Private member variable for name
    private String name;

    // Private member variable for grade
    private double grade;


    // Parameterized constructor
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    // Method to get student details
    public String getDetails() {
        return getName() + ":" + getGrade();
    }

    // Setters and getters (optional for this exercise)
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public double getGrade() {
        return this.grade;
    }
}
