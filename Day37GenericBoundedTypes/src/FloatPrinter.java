//TO MAKE IT BOUNDED WE ADD 'extends Number or something else'
public class FloatPrinter <T>{
    T num;

    public FloatPrinter(T num) {
        this.num = num;
    }

    public void print(){
        System.out.println(num);
    }

    //generic method example
    public static<T> void printing(T something){
        System.out.println("Something");
    }
    //bounded
    public static<T extends Number> void prints(){

    }
}
