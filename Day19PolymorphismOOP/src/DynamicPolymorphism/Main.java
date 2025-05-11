package DynamicPolymorphism;

public class Main {
    public static void main(String[] args){
        //array of library members
        LibraryMember[] members = new LibraryMember[3];

        //initialization
        members[0]= new LibraryMember("Alex"); //created by base class
        members[1] = new StudentMember("Emily"); //derived student class
        members[2] = new ProfessorMember("Dr. Smith"); //derived professor child class

        //for loop to call the single method overrode
        for (LibraryMember member: members){
            member.borrowBook();
        }

    }
}
