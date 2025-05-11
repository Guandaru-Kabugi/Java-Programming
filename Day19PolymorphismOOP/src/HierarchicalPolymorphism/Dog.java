package HierarchicalPolymorphism;

public class Dog extends Animal{
    String breed;
    //constructor
    public Dog(String name,String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog constructor called! The breed is: " + breed);


    }

    @Override
    void eat() {
        super.eat();
        System.out.println(name+ " eats food!");
    }

    @Override
    void makeSound() {
        System.out.println(name + " is barking.");
    }

    void fetch(){
        System.out.println(name + " is fetching the ball.");
    }
}
