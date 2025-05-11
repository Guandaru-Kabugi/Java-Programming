package InterfaceSyntax;

public interface InterFaceName {

    //constant
    int CONSTANT = 10; //cannot be changed

    //abstract methods

    void methodName();

    //default method
    default  void defaultMethod(){
        System.out.println("Default Implementation.");

    }
    //static method
    static void staticMethod(){
        System.out.println("Static Method");
    }
}
