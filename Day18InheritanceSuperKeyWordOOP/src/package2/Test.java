package package2;

import package1.Parent;

public class Test {

    //we create a main method to run
    public static void main(String[] args){
        Parent parent1 = new Parent();
        //parent1.protectedMethod(); //gives an error because there is no inheritance for the protected method
    }
}
