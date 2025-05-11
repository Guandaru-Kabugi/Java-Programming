package DynamicPolymorphism;

public class LibraryMember {

    String name;

    //constructor
    public LibraryMember(String name){
        this.name = name;
    }
    public void borrowBook(){
        System.out.println(name + " can borrow books.");
    }
}
