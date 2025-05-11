package DynamicPolymorphism;

public class StudentMember extends LibraryMember{
    //parent constructor
    public StudentMember(String name) {
        super(name);
    }

    @Override
    public void borrowBook() {
        System.out.println(name + " can borrow up to 3 books.");
    }
}
