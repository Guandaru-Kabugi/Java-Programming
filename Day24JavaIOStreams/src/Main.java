import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        //String data = "Hello, this is a test using fileoutputstream";
        //when using a .txt, all data will not be readable on the file except the string
        //input stream
        InputStream fileStream = Main.class.getClassLoader().getResourceAsStream("output.bin");
        if(fileStream ==null){
            System.out.println("File is null");
        }
        try(
            //best is to use a bin
            DataInputStream dis = new DataInputStream(fileStream)){
            double value = dis.readDouble();
            char charValue = dis.readChar();
            int intValue = dis.readInt();
            String stringValue = dis.readUTF();
            System.out.println("Double: " + value);
            System.out.println("Char: " + charValue);
            System.out.println("Int Value: " + intValue);
            System.out.println("String Value: " + stringValue);
            //make resources folder a resources
            //project structure, modules, tick src/resources as resources and apply

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
