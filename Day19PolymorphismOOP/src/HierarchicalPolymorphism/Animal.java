package HierarchicalPolymorphism;

public class Animal {
    String name;

    //constructor
    public Animal(String name){
        this.name = name;
        System.out.println("Animal Constructor called for " + name);

    }
    void eat(){
        System.out.println("This animal eats food!");
    }
    void sleep(){
        System.out.println(name + " is sleeping.");
    }
    void makeSound(){
        System.out.println(name+ " is making a sound.");
    }
}
