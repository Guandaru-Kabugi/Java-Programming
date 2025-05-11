package DynamicPolymorphism;

public class ProfessorMember extends LibraryMember {
    //constructor from super
    public ProfessorMember(String name) {
        super(name);
    }

    @Override
    public void borrowBook() {
        System.out.println(name+ " can borrow up to 10 books.");
    }
}
