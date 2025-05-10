public class Dog extends Animal {

    String breed;


    //constructor for child class inheriting from super
    public Dog(String name,String breed){
        super(name);
        this.breed = breed;
        System.out.println("Dog Constructor called for breed " + breed);

    }

    //best practice to use override decorate
    //hide the parent class eat method. not best approach. override can be used.
    void eats(){
        System.out.println("The dog eats food");
    }
    void dogEats(){
        super.eats();
    }
    //this is a subclass of animal
    void barks(){
        System.out.println("This dog barks.");
    }
}
