public class Employee {
    //variables
    String name;
    String department;
    private static int totalEmployees;

    public Employee(String name,String department){
        this.name = name;
        this.department = department;
        totalEmployees++;
    }

    //method to get employee details using this keyword
    public String getDetails(){
        return "Name: " + this.name + " and Department: " + this.department;

    }

    public static int getTotalEmployees(){
        return totalEmployees;
    }
}
