import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1; //to support future changes
    private String name;
    private int rollNumber;
    private int age;

    //constructor

    public Student(String name,int rollNumber,int age){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;

    }
    //getters

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
    //setters

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void displayStudentDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age " + age);
    }
}
