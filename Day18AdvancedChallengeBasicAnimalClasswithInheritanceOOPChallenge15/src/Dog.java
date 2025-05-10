public class Dog extends Animal {
    private String breed;

    // Constructor using super to call the parent class constructor
    // Call the parent class constructor

    protected Dog(String name,String breed) {
        super(name);
        this.breed = breed;
    }

    // Getter for breed
    protected String getBreed(){
        return this.breed;
    }

    // Method to display details using parent and child attributes
    public void displayDetails() {
        System.out.println("Dog's Name: " + getName());
        System.out.println("Dog's Breed: " + getBreed());
    }




}
