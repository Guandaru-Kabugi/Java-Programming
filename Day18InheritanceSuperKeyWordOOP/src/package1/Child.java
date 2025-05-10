package package1;

public class Child extends Parent{

    public void accessProtectedMethod(){
        protectedMethod(); //from parent
    }
}
