public class Main {
    public static void main(String [] args){
        Dog dog = new Dog("Daisy","German Shepherd");
        Animal animal = new Animal("Jamie");
        dog.eats(); //inherits from parent class
        dog.barks(); //new method
        animal.eats(); //parent class method
        dog.dogEats();

        System.out.println("=-------------");
        Laptop myLaptop = new Laptop("HP",
                "Pro book",16,
                512,1,
                15);
        myLaptop.displayInfo();
        myLaptop.powerOn();

    }
}
