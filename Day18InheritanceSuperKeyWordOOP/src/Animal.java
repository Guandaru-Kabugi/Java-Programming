public class Animal {


    String name;

    //constructor
    public Animal(String name){
        this.name = name;
        System.out.println("Animal constructor called for " + name);
    }

    //this is the parent class
    //has one method
    void eats(){
        System.out.println("This animal eats food.");
    }
}
