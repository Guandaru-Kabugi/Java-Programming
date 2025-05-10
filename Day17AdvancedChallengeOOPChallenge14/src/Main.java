public class Main {

    public static void main(String[] args){
        Employee emp1 = new Employee("Alice","HR");
        Employee emp2 = new Employee("Bob","Engineering");
        Employee emp3 = new Employee("Charlie","Finance");

        //display employee details
        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());
        System.out.println(emp3.getDetails());
        //display total number of employees
        System.out.println("Total Number of Employees: " + Employee.getTotalEmployees());
    }
}
