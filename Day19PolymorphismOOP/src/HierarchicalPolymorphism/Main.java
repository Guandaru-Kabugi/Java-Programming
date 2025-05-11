package HierarchicalPolymorphism;

public class Main {
    public static void main (String[] args){
        Dog myDog = new Dog("Buddy","Golden Retriever");
        /*myDog.eat(); //override the eat method
        myDog.makeSound();
        myDog.fetch();
        Bird myBird = new Bird("Tweety");
        myBird.fly(); */
        //polymorphism where the parent class can be used to create objects of different classes
        Animal myDog2 = new Dog("Kenny","Collie");
        //polymorphic call
        myDog2.makeSound();
        //if we want to access attributes inside the subclass,
        // we need to cast the animal into a dog
        ((Dog) myDog2).fetch();



    }
}
