package package2;

import package1.Parent;

public class DifferentPackage extends Parent {

    public void accessProtectedFromParent(){
        protectedMethod(); //can access even from different package
    }

    //we test
    public static void main(String[] args){
        DifferentPackage child = new DifferentPackage();
        child.protectedMethod();
    }
}
