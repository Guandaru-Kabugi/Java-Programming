package Encapsulation;

public class Main {
    public static void main(String[] args){

        UserProfile user1 = new UserProfile("John Doe","Secure1234","johndoe@gmail.com");
        user1.displayUserInfo();
        user1.setPassword("hihi"); //invalid password display
        user1.setPassword("hihihihihihi");

    }
}
