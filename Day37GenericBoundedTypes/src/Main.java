public class Main {
    public static void main(String[] args) {
        FloatPrinter<Float> floatPrinter = new FloatPrinter<>(3.14f);

        floatPrinter.print();

        FloatPrinter<Double> doubleFloatPrinter = new FloatPrinter<>(122.33);
        doubleFloatPrinter.print();

        FloatPrinter<String> stringPrinter = new FloatPrinter<>("hi there");
        stringPrinter.print();
    }
}
